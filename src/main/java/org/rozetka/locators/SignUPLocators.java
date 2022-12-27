package org.rozetka.locators;

import org.openqa.selenium.By;

public enum SignUPLocators {
SIGNUP_HEADER(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[1]/h3"));




    private final By path;

    SignUPLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}

