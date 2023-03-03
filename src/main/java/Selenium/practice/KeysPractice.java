package Selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class KeysPractice {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com");

        //caps lock
        //driver.findElement(By.cssSelector("input[class='gLFyf']")).sendKeys(Keys.SHIFT,"Java");

        driver.get("https://www.autozone.com/");

        //scroll down
        WebElement element = driver.findElement(By.cssSelector("div[class='az_Rqb'] input[class='az_Wqb']"));
        element.click();
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);
    }
}
