package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationsAttributes { //8

    //description: It is a string which is attached to the @Test annotation that describes the information about the test.
    @Test(description = "This is testcase1", priority = -360)
    public void testcase1() {
        System.out.println("HR");
    }


    //dependsOnMethods: When the second test method wants to be dependent on the first test method, then this could be possible by the use of "dependOnMethods" attribute. If the first test method fails, then the dependent method on the first test method, i.e., the second test method will not run.
    @Test(priority = -500)
    public void WebStudentLogin() {
        System.out.println("Student login through web");
        Assert.fail();
    }

    @Test(dependsOnMethods= {"WebStudentLogin"}, alwaysRun = true) //alwaysRun = true, means always run
    public void MobileStudentLogin() {
        System.out.println("Student login through mobile");
    }

    @Test(dependsOnMethods= {"WebStudentLogin", "MobileStudentLogin"})
    public void APIStudentLogin() {
        System.out.println("Student login through API");
    }


    //priority: When no 'priority' attribute is specified then the TestNG will run the test cases in alphabetical order. Priority determines the sequence of the execution of the test cases. The priority can hold the integer values between -5000 and 5000. When the priority is set, the lowest priority test case will run first and the highest priority test case will be executed last.
    //If priority is not specified, then the default priority will be 0.

    @Test(priority = 15)
    public void mango() {
        System.out.println("I am Mango");
    }

    @Test(priority=1)
    public void apple() {
        System.out.println("I am Apple");
    }

    @Test(priority=-5000)
    public void watermelon() {
        System.out.println("I am Watermelon");
    }

    //enabled: The 'enabled' attribute contains the boolean value. By default, its value is true. If you want to skip some test method, then you need to explicitly specify 'false' value.

    //timeOut: If one of the test cases is taking a long time due to which other test cases are failing. To overcome such situation, you need to mark the test case as fail to avoid the failure of other test cases. The timeOut is a time period provided to the test case to completely execute its test case.

    @Test(timeOut=200)
    public void testCase1() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("This is testcase1");
    }

    @Test
    public void testCase2() {
        System.out.println("This is testcase2");
    }

    @Test
    public void testCase3() {
        System.out.println("This is testcase3");
    }
    //In the above code, inside the testcase1() method, we have Thread.sleep(500) which means that the testcase1() method will be executed after 500 milliseconds, but we have provided timeOUT attribute with the value 200 means that the testcase1() will be failed after 200 milliseconds.
}
