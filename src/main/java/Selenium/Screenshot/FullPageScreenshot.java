package Selenium.Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class FullPageScreenshot {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://freecrm.com/");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void captureFullPageScreenshot() throws IOException {
        //In Selenium 4, there is a method called getFullPageScreenshotAs() for Firefox. It allows us to take a full page screenshots and store it in the specified location.
        //Here, instead of typecasting it to the ‘TakeScreenshot‘ interface. We have to typecast it to the ‘FirefoxDriver‘ instance. Since it works only on Firefox browser.

        File src = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("./target/screenshots/FullPageScreenshot.png"));
    }

    @Test
    public void capturePageScreenshot() throws IOException {
        /*TakesScreenshot interface enables the Selenium WebDriver to take a screenshot and store it in different ways. "getScreenshotAs()" method captures the screenshot and store it in the specified location.*/

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("./target/screenshots/PageScreenshot.png"));
    }
}
