package  org.rozetka.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.rozetka.locators.HeadersLocators;
import org.rozetka.pages.BasePage;
public class HeaderComponent extends BasePage {
    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    WebElement userIcon;
    WebElement searchInput;

    public WebElement getUserIcon(){
        if (userIcon == null){
            userIcon = driver.findElement(HeadersLocators.USER_ICON.getPath());
        }
        return userIcon;
    }
    public LoginModal clickUserIcon(){
        this.getUserIcon().click();
        return new LoginModal(this.driver);
    }
    public WebElement getSearchInput(){
        if(searchInput== null){
            searchInput = driver.findElement(HeadersLocators.SEARCH_INPUT.getPath());
        }
        return searchInput;
    }



    }

