package Selenium.Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class SectionScreenshot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.softwaretestingmaterial.com");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#site-navigation")));

        WebElement elementLogo = driver.findElement(By.cssSelector("#site-navigation"));

        File src = elementLogo.getScreenshotAs(OutputType.FILE);
        File dest = new File("./target/screenshots/sectionTutorials.png");

        try {
            FileHandler.copy(src, dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
