package org.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.rozetka.locators.HeadersLocators;
import org.rozetka.locators.LoginLocators;

public class LoginModal extends BasePage {
    protected WebElement passwordInput;
    protected WebElement loginButton;
    protected WebElement errorMessange;

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    public WebElement getPasswordInput() {
        if (passwordInput == null) {
            passwordInput = driver.findElement(LoginLocators.PASSWORD_FIELD.getPath());
        }
        return passwordInput;
    }

    public WebElement getLoginButton() {
        if (loginButton == null) {
            loginButton = driver.findElement(LoginLocators.LOGIN_BUTTON.getPath());
        }
        return loginButton;
    }

    public WebElement getErrorMessange() {
        if (errorMessange == null) {
            errorMessange = driver.findElement(LoginLocators.ERROR_MESSANGE.getPath());
        }
        return errorMessange;
    }

    public void  unssussfulLogin1() {
        getPasswordInput().sendKeys("pass");
        getLoginButton().click();
        System.out.println("Message: " + getErrorMessange().getText());
    }
}
