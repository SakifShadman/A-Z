package TestNG.FromNaveen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AllAnnotations {

    //dependsOnMethods
    @Test(groups = "Smoke")
    public void loginTest() {
        System.out.println("Login Test");
        Assert.fail();
    }

    @Test(dependsOnMethods = "loginTest")
    public void homePage() {
        System.out.println("Home Page Test");
    }

    @Test(dependsOnMethods = {"loginTest", "homePage"}, alwaysRun = true) //using alwaysRun = true to make the test pass always
    public void adminPage() {
        System.out.println("Admin Page Test");
    }


    //groups
    @Test(groups = "Regression")
    public void MobileLoginHomeLoan() {
        System.out.println("MobileLoginHomeLoan");
    }

    @Test(groups = "Smoke")
    public void LoginAPICarLoan() {
        System.out.println("LoginAPICarLoan");
    }


    //invocationCount
    @Test(invocationCount = 5)
    public void sum() {
        System.out.println(10 + 20);
    }


    //timeOut
    @Test(timeOut = 300)
    public void infiniteLoop() {
        int i = 1;
        while (i==1) {
            System.out.println(i);
        }
    }


    //expectedExceptions
    @Test(expectedExceptions = NumberFormatException.class) // it will exceptions
    public void handleException() {
        String x = "100A";
        Integer.parseInt(x);
    }
}
