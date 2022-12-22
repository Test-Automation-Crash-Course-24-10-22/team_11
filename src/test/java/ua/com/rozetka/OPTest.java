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
    @Test

    public void LoginTest2(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickUserIcon()
                .successfullLogin("pass1@gmail.com", "123asdF");
    }
    @Test
    public void LoginTest3(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickUserIcon()
                .unsuccessfullLogin2();
    }
}
