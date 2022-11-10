package Selenium.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ElementScreenshotPart2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(RelativeLocator.with(By.tagName("button")).below(password));

        username.sendKeys("Admin");
        password.sendKeys("admin123");

        takeElementScreenshot(username, "username");
        takeElementScreenshot(password, "password");
        takeElementScreenshot(loginBtn, "loginBtn");

//        TakesScreenshot srcShot = ((TakesScreenshot)username);
//        File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
//
//        try {
//            FileUtils.copyFile(srcFile, new File("./target/screenshots/username.png"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        driver.quit();
    }

    public static void takeElementScreenshot(WebElement element, String fileName) {
        TakesScreenshot srcShot = ((TakesScreenshot)element);
        File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("./target/screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
