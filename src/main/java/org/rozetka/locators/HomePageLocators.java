package org.rozetka.locators;

import org.openqa.selenium.By;

public enum HomePageLocators {
EMAIL_TITLE (By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[2]/ul/li[1]/a/div[2]/p"));







    private final By path;

    HomePageLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
