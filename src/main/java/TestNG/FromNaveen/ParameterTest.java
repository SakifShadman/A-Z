package TestNG.FromNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParameterTest {

    WebDriver driver;

    @Test
    @Parameters({"url", "username", "password"})
    public void loginTest(String url, String userName, String passWord) {
        System.setProperty("webdriver.chrome.driver", "C:/Dev_tools/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get(url);

        By username = By.name("username");
        By password = By.name("password");

        driver.findElement(username).sendKeys(userName);
        //driver.findElement(RelativeLocator.with(By.tagName("div")).above(password)).sendKeys(userName);
        driver.findElement(password).sendKeys(passWord);
        driver.findElement(RelativeLocator.with(By.tagName("button")).below(password)).click();
    }

    //date driven:
    //excel file - test data
    //properties file - Environment variables, object repository, test data
    //testng.xml - Environment variables
    //some other xml files
    //JSON files
    //database

    /*
    <suite name="OrangeHRM Suite">

    <test name="OrangeHRM Test">
        <parameter name="url" value="https://opensource-demo.orangehrmlive.com"/>
        <parameter name="username" value="Admin"/>
        <parameter name="password" value="admin123"/>
        <classes>
            <class name="TestNG.FromNaveen.ParameterTest"/>
        </classes>
    </test>
    </suite>
    */
}
