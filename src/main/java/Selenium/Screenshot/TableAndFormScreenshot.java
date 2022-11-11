package Selenium.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TableAndFormScreenshot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        driver.get("https://www.w3schools.com/html/html_tables.asp");
//        WebElement element = driver.findElement(By.id("customers"));

        driver.get("https://api.freecrm.com/register/");
        WebElement element = driver.findElement(By.cssSelector(".ui.form"));

        File srcFile = element.getScreenshotAs(OutputType.FILE);
        try {
//            FileUtils.copyFile(srcFile, new File("./target/screenshots/webtable.png"));
            FileUtils.copyFile(srcFile, new File("./target/screenshots/register.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}