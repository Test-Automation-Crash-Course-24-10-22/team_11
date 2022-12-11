package ua.com.rozetka;

import org.rozetka.pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.com.rozetka.runers.BaseRuner;

public class OPTest extends BaseRuner {
    @BeforeTest
    public void BeforeTest(){
        setDriver();
    }
    @Test
    public void LoginTest1(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickUserIcon()
                .unssussfulLogin1();

    }
}
