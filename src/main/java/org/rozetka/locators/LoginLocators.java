package org.rozetka.locators;

import org.openqa.selenium.By;

public enum LoginLocators {
    PASSWORD_FIELD(By.xpath("//*[@id=\"auth_pass\"]")),
    LOGIN_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]")),
    ERROR_MESSANGE(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]/p")),
    EMAIL_FIELD(By.xpath("//*[@id=\"auth_email\"]")),
    CAPTCHAR_CHECKBOX(By.id("ngrecaptcha-0")),
    EROOR_MESSANGEPASSWORD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[2]/div[2]/strong"));







    private final By path;

    LoginLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}