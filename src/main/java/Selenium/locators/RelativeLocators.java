package Selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class RelativeLocators {
    WebDriver driver;

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.aqi.in/dashboard/canada");

        WebElement ele = driver.findElement(By.linkText("Peterborough, Canada"));

        String aqNum = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(ele)).getText();
        System.out.println(aqNum);

        String rank = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
        System.out.println(rank);

        String belowCity = driver.findElement(RelativeLocator.with(By.tagName("p")).below(ele)).getText();
        System.out.println(belowCity);

        String cityColNum = driver.findElement(RelativeLocator.with(By.tagName("p")).above(ele)).getText();
        System.out.println(cityColNum);

        String name = driver.findElement(RelativeLocator.with(By.tagName("p")).near(ele)).getText();
        System.out.println(name);

        //right click
        Actions action = new Actions(driver);
        action.contextClick(ele).perform();
    }
}
