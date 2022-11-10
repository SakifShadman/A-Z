package Selenium.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakeElementScreenshot {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(RelativeLocator.with(By.tagName("button")).below(password));

        username.sendKeys("Admin");
        password.sendKeys("admin123");

        takeElementScreenshot(username, "usernameElement");
        takeElementScreenshot(password, "passwordElement");
        takeElementScreenshot(loginBtn, "loginBtnElement");

//        String path = "src/main/java/Selenium/Screenshot/";
//        File srcFile = username.getScreenshotAs(OutputType.FILE);
//        File destFile = new File(path + System.currentTimeMillis() + ".png");
//        try {
//            FileUtils.copyFile(srcFile, destFile);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        driver.quit();
    }

    public static void takeElementScreenshot(WebElement element, String fileName) {
        File srcFile = element.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("./target/screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
