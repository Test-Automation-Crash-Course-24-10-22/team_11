package org.rozetka.pages;

import org.openqa.selenium.WebDriver;

public class BasePageWithHeaders extends BasePage{
    protected  HeaderComponent headerComponent;
    public BasePageWithHeaders(WebDriver driver){
        super(driver);
        headerComponent  = new HeaderComponent(driver);
    }
    public HeaderComponent getHeaderComponent(){
        return headerComponent;
    }
}
