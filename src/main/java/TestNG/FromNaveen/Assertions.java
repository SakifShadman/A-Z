package TestNG.FromNaveen;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void hardAssertion() {
        Assert.assertEquals(true, true);
        Assert.assertEquals(false, false);
        Assert.assertEquals(true, false);
        Assert.assertEquals(false, true);
        Assert.assertEquals(true, true);
        System.out.println("Hard Assertion");
    }

    @Test
    public void softAssertion() {
        softAssert.assertEquals(true, true);
        softAssert.assertEquals(false, false);
        softAssert.assertEquals(true, false);
        softAssert.assertEquals(false, true);
        softAssert.assertEquals(true, true);
        System.out.println("Soft Assertion");
        softAssert.assertAll(); //if we don't use it, it will show test is passed and don't show which assert got fail
    }
}