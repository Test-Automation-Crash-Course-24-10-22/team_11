package org.rozetka.locators;
import org.openqa.selenium.By;

public enum HeadersLocators {
    USER_ICON(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
    ;
    private final By path;

    HeadersLocators(By path){
        this.path = path;
    }
    public By getPath(){
        return path;
    }

}
