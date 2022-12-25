package org.rozetka.locators;
import org.openqa.selenium.By;

public enum HeadersLocators {
    USER_ICON(By.xpath("//div/div/ul/li[3]/rz-user/button")),

    SEARCH_INPUT(By.xpath("//div/div/div/form/div/div/input"));
    private final By path;

    HeadersLocators(By path){
        this.path = path;
    }
    public By getPath(){
        return path;
    }

}
