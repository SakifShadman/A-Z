package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class Basics {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); //we use this so we can perform cross browser testing
        WebDriver driver1 = new FirefoxDriver();

        ChromeDriver chromeDriver = new ChromeDriver(); //not this

        driver.close(); //session id will be invalid or expired
        driver.quit(); //session id will be null(no session id/ deleted)

        driver.get("www.google.com");
        driver.navigate().to("www.amazon.com");
        //no difference between them. to() method also call get() method internally to run the code.
        //we use navigate to back and forward. even if we use get() for url navigate back and forward will still work.
        //if we want to use 3rd party domain/url its best to use navigate().to() but for main domain should use get().
        driver.navigate().refresh(); //navigate use for refreshing too

        //headless:
        //no browser launch/ hidden browser
        //testing happening behind the scene
        //faster
        //By ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--headless");
        WebDriver driver11 = new ChromeDriver(co);

        //By FirefoxDriver
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions fo = new FirefoxOptions();
        fo.addArguments("--headless");
        WebDriver driver22 = new FirefoxDriver(fo);

        //incognito mode
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        WebDriver driver111 = new ChromeDriver(co);
    }
}