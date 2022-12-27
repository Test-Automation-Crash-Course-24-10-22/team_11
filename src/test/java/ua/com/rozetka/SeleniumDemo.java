package ua.com.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ua.com.rozetka.runers.BaseRuner;
import java.lang.reflect.Method;

public class SeleniumDemo extends BaseRuner {
    @BeforeTest
    public void BeforeTest() {
        setDriver();
    }

    @Test
    public void firstUnsuccessfulTest1() {

        WebElement userIcon = driver.findElement(By.xpath("//div/div/ul/li[3]/rz-user/button"));
        userIcon.click();
        WebElement password = driver.findElement(By.xpath("//*[@id=\"auth_pass\"]"));
        password.sendKeys("pass");
        WebElement loginBtn = driver.findElement(By.xpath("//div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
        loginBtn.click();
        WebElement errorMes = driver.findElement(By.xpath("//div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]/p"));
        //String expected  = " Введено невірну адресу ел. пошти або номер телефону ";
        Assert.assertTrue(errorMes.getText().contains("Введено невірну адресу ел. пошти або номер телефону"));
        //System.out.println("Message: " + errorMes.getText());

    }

    @Test
    public void SuccessfulTest() {
        WebElement userIcon = driver.findElement(By.xpath("//div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
        userIcon.click();
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"auth_email\"]"));
        emailField.sendKeys("pass1@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"auth_pass\"]"));
        password.sendKeys("123asdF");
        WebElement loginBtn = driver.findElement(By.xpath("//div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
        loginBtn.click();
        sleep(5);
        WebElement recaptcha = driver.findElement(By.id("ngrecaptcha-0"));
recaptcha.click();
sleep(10);
        loginBtn.click();
        sleep(10);
        WebElement listOrdering = driver.findElement(By.xpath("//div/div/rz-header/rz-main-header/header/div/div/ul/li[3]"));
//listOrdering.click();
//WebElement nameEmail = driver.findElement(By.xpath("//div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[2]/ul/li[1]/a/div[2]/p"));
//Assert.assertTrue(nameEmail.getText().contains("pass1@gmail.com"));
//Assert.assertTrue(listOrdering.isDisplayed());

    }

@Test
    public void firstUnsuccessfulTest2() {
    WebElement userIcon = driver.findElement(By.xpath("//div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
    userIcon.click();
    WebElement emailField = driver.findElement(By.xpath("//*[@id=\"auth_email\"]"));
    emailField.sendKeys("pass1@gmail.com");
    WebElement password = driver.findElement(By.xpath("//*[@id=\"auth_pass\"]"));
    password.sendKeys("fghj");
    WebElement loginBtn = driver.findElement(By.xpath("//div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
    loginBtn.click();
    sleep(5);
    WebElement recaptcha = driver.findElement(By.id("ngrecaptcha-0"));
    recaptcha.click();
    sleep(10);
    loginBtn.click();
    sleep(10);
    WebElement errorrMessange = driver.findElement(By.xpath("//div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[2]/div[2]/strong"));
    String expected = "Введено невірний пароль!";
    Assert.assertTrue(errorrMessange.getText().contains(expected));
    //System.out.println("Message: " + erorrMeassengePassw.getText());
}
@Test
    public void  RememberPassword(){
    WebElement userIcon = driver.findElement(By.xpath("//div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
    userIcon.click();
    WebElement checkBox = driver.findElement(By.xpath("//div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[3]/label"));
    checkBox.click();
    sleep(5);
    checkBox.click();
    //Assert.assertTrue(checkBox.isSelected());
    System.out.println("Method - RememberPassword() :"+checkBox.getTagName() + " "  + checkBox.isSelected());
}


}