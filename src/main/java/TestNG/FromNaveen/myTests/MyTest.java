package TestNG.FromNaveen.myTests;

import TestNG.FromNaveen.Analyzer.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

    @Test (retryAnalyzer = RetryAnalyzer.class)
    public void test1() {
        Assert.assertEquals(true, false);
    }

    @Test
    public void test2() {
        Assert.assertEquals(true, false);
    }

    @Test
    public void test3() {
        Assert.assertEquals(true, true);
    }
}
