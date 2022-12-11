package org.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.rozetka.locators.HeadersLocators;
import org.rozetka.locators.LoginLocators;

public class LoginModal extends BasePage {
    protected WebElement passwordInput;
    protected WebElement loginButton;
    protected WebElement errorMessange;
    protected WebElement emailInput;
    protected WebElement captchar;
protected WebElement errorMessangePassword;
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
    public WebElement getEmailInput() {
        if (emailInput == null) {
            emailInput = driver.findElement(LoginLocators.EMAIL_FIELD.getPath());
        }
        return emailInput;
    }
    public WebElement getCaptchar() {
        if (captchar == null) {
            captchar = driver.findElement(LoginLocators.CAPTCHAR_CHECKBOX.getPath());
        }
        return captchar;
    }


    public WebElement getErrorMessange() {
        if (errorMessange == null) {
            errorMessange = driver.findElement(LoginLocators.ERROR_MESSANGE.getPath());
        }
        return errorMessange;
    }
    public WebElement getErrorMesPassword(){
        if(errorMessangePassword == null ){
            errorMessangePassword = driver.findElement(LoginLocators.EROOR_MESSANGEPASSWORD.getPath());
        }
        return errorMessangePassword;
    }

    public void  unssussfulLogin1() {
        getPasswordInput().sendKeys("pass");
        getLoginButton().click();
        System.out.println("Message: " + getErrorMessange().getText());
    }
    public HomePage successfullLogin(String email, String password){
        getEmailInput().sendKeys("pass1@gmail.com");
        getPasswordInput().sendKeys("123asdF");
        getLoginButton().click();
        sleep(5);
        getCaptchar().click();
        getLoginButton().click();
        sleep(10);
        return new HomePage(driver);
    }
    public void unsuccessfullLogin2(){
        getEmailInput().sendKeys("pass1@gmail.com");
        getPasswordInput().sendKeys("fgh");
        getLoginButton().click();
        sleep(5);
        getCaptchar().click();
        sleep(5);
        getLoginButton().click();
        System.out.println("Message: " + getErrorMesPassword().getText());
    }
}
