package ua.com.rozetka;
import io.qameta.allure.*;
import org.rozetka.locators.LoginLocators;
import org.rozetka.pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.com.rozetka.runers.BaseRuner;


public class OPTest extends BaseRuner {
    @BeforeTest
    public void BeforeTest(){
        setDriver();
    }
    @Test
@Description("Login test with valid password and valid email")
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_11/issues/2")
    @Issue("2")
    public void LoginTest1(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickUserIcon()
                .successfullLogin("pass1@gmail.com", "123asdF");
    }
    @Test
    @Description("Login test with empty email field")
@Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_11/issues/13")

    public void LoginTest2() {
        new HomePage(driver)
                .getHeaderComponent()
                .clickUserIcon()
                .emptyEmailField();
        String wrongEmailMessage = driver.findElement(LoginLocators.ERROR_MESSANGE.getPath()).getText();
        System.out.println("Message: " + wrongEmailMessage);
        //Assert.assertEquals(" Введено невірну адресу ел. пошти або номер телефону ", wrongEmailMessage);
    }
    @Test
@Description("Login test with invalid password")
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_11/issues/11")
    public void LoginTest3(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickUserIcon()
                .invalidPassword();
        String wrongPasswordMessage = driver.findElement(LoginLocators.EROOR_MESSANGEPASSWORD.getPath()).getText();
        System.out.println("Message: " + wrongPasswordMessage);
       // Assert.assertEquals("Введено невірний пароль!", wrongPasswordMessage);
    }
    @Test
    public void LoginTest4(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickUserIcon()
                .invalidEmail();
        String wrongEmailMessage = driver.findElement(LoginLocators.ERROR_MESSANGE.getPath()).getText();
        System.out.println("Message: " + wrongEmailMessage);
        //Assert.assertEquals(" Введено невірну адресу ел. пошти або номер телефону ", wrongEmailMessage);

    }
}
