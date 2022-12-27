package ua.com.rozetka.listeners;
import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

import org.testng.ITestListener;
import ua.com.rozetka.runers.BaseRuner;
import org.testng.ITestResult;

public class TestListener extends BaseRuner implements ITestListener {
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
    //Text attachments for allure
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
   //Text attachments for allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }
    @Override
    public void onTestFailure(ITestResult iTestresult) {
        System.out.println("I am in onTestFailure method " + getTestMethodName(iTestresult)+ "failed");
        Object testClass =iTestresult.getInstance();
        WebDriver driver = ((BaseRuner) testClass).getDriver();
        if (driver instanceof WebDriver) {
            System.out.println("Screenshot captured for testcase :" + getTestMethodName(iTestresult));
            saveScreenshotPNG(driver);
        }
    }

}
