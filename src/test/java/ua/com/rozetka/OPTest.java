package ua.com.rozetka;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.rozetka.locators.HomePageLocators;
import org.rozetka.locators.LoginLocators;
import org.rozetka.locators.SignUPLocators;
import org.rozetka.pages.HomePage;
import org.rozetka.pages.LoginModal;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ua.com.rozetka.runers.BaseRuner;
import ua.com.rozetka.listeners.TestListener;

@Feature("Login Tests")
@Listeners({TestListener.class})
public class OPTest extends BaseRuner {
    @BeforeTest
    public void BeforeTest(){
        setDriver();
    }
    @Test
@Description("Login test with valid password and valid email")
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_11/issues/2")
    @Issue("2")
    @Severity(SeverityLevel.BLOCKER)
    public void LoginTestSuccessful(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickUserIcon()
                .successfullLogin("pass1@gmail.com", "123asdF");
        //WebElement nameEmail = driver.findElement(HomePageLocators.EMAIL_TITLE.getPath());
        //Assert.assertTrue(nameEmail.isDisplayed());
    }
    @Test
    @Description("Login test with empty email field")
@Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_11/issues/13")
    @Issue("13")
    @Severity(SeverityLevel.CRITICAL)

    public void LoginTestEmptyEmail() {
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
    @Issue("11")
    @Severity(SeverityLevel.CRITICAL)
    public void LoginTestInvalidPassword(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickUserIcon()
                .invalidPassword();
        String wrongPasswordMessage = driver.findElement(LoginLocators.EROOR_MESSANGEPASSWORD.getPath()).getText();
        System.out.println("Message: " + wrongPasswordMessage);
       // Assert.assertEquals("Введено невірний пароль!", wrongPasswordMessage);
    }
    @Test
    @Description("Verify the opportunity to select checkbox [Remember Password]")
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_11/issues/12")
    @Issue("12")
    @Severity(SeverityLevel.MINOR)
    public void LoginTestRememberPassword(){
        new HomePage(driver)
                .getHeaderComponent()
        .clickUserIcon()
        .clickCheckbox();
        Assert.assertTrue(driver.findElement(LoginLocators.CHECK_BOX.getPath()).isSelected());
        //System.out.println("Method - RememberPassword() :"+driver.findElement(LoginLocators.CHECK_BOX.getPath()).getTagName() + " "  + driver.findElement(LoginLocators.CHECK_BOX.getPath()).isSelected());
    }
    @Test
    @Description("Verify the user can call the sighup popup window with button [Signup]")
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_11/issues/10")
    @Issue("11")
    @Severity(SeverityLevel.BLOCKER)
    public void LoginTestSignUp(){
new HomePage(driver)
        .getHeaderComponent()
        .clickUserIcon()
        .getOpotunitySignUp();
WebElement sighUp = driver.findElement(SignUPLocators.SIGNUP_HEADER.getPath());
        Assert.assertTrue(sighUp.isDisplayed());
    }




}
