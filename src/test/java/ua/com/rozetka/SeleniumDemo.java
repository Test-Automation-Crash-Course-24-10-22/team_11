package ua.com.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.com.rozetka.runers.BaseRuner;

public class SeleniumDemo extends BaseRuner {
    @BeforeTest
    public void BeforeTest(){
        setDriver();
    }

    @Test
    public void firstUnsuccessfulTest() {

        WebElement userIcon = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
        userIcon.click();
        WebElement password = driver.findElement(By.xpath("//*[@id=\"auth_pass\"]"));
        password.sendKeys("pass");
        WebElement loginBtn = driver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
        loginBtn.click();
        WebElement errorMes = driver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]/p"));
        System.out.println("Message: " + errorMes.getText());

    }

    @AfterSuite
    public void afterSuite() {
        if (driver != null) {
            driver.quit();
        }
    }

}

