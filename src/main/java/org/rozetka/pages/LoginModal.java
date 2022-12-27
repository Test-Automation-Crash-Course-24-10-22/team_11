package org.rozetka.pages;
import org.rozetka.pages.BasePage;
import org.rozetka.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.rozetka.locators.HeadersLocators;
import org.rozetka.locators.LoginLocators;
import org.rozetka.pages.HomePage;
public class LoginModal extends BasePage {
    protected WebElement passwordInput;
    protected WebElement loginButton;
    protected WebElement emailInput;
    protected WebElement captchar;
    protected WebElement checkBox;
    protected WebElement sighUp;

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

    public WebElement getCheckBox() {
        if (checkBox == null) {
            checkBox = driver.findElement(LoginLocators.CHECK_BOX.getPath());
        }
        return checkBox;
    }
    public WebElement getSighUp(){
        if (sighUp==null){
            sighUp = driver.findElement(LoginLocators.SIGN_UP.getPath());
        }
        return sighUp;
    }
        public void  emptyEmailField() {
            getPasswordInput().sendKeys("pass");
            getLoginButton().click();
        }

        public HomePage successfullLogin(String email, String password){
            getEmailInput().sendKeys(email);
            getPasswordInput().sendKeys(password);
            getLoginButton().click();
            sleep(5);
            getCaptchar().click();
            getLoginButton().click();
            sleep(10);
            return  new HomePage(driver);
        }
        public void invalidPassword(){
            getEmailInput().sendKeys("pass1@gmail.com");
            getPasswordInput().sendKeys("fgh");
            getLoginButton().click();
            sleep(5);
            getCaptchar().click();
            sleep(5);
            getLoginButton().click();
        }
public void clickCheckbox(){
        getCheckBox().click();
        sleep(5);
        getCheckBox().click();
}
public void getOpotunitySignUp(){
        getSighUp().click();
    sleep(10);
}
}



