package org.rozetka.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class BasePage {
protected WebDriver driver;
public BasePage(WebDriver driver){
    this.driver = driver;
}
public void sleep(int seconds){


        try {
            Thread.sleep(seconds*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    }

