package ua.com.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rozetka.com.ua/ua/");
    driver.quit();
}
}