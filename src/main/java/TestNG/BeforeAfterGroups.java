package TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroups { //7
    //TestNG allows the testers to create multiple test cases into a single group through the use of attribute 'group' in the @Test annotation. We can say that TestNG groups allow you to add similar functionalities in the same group

    //@BeforeGroups: The @BeforeGroups annotated method will run only once before all the test methods belonging to a specified group have been executed.

    @BeforeGroups(groups = {"IT Department"})
    public void before_it() {
        System.out.println("This method will be executed before the execution of IT Department group");
    }

    @Test
    public void testcase1() {
        System.out.println("HR");
    }

    @Test(groups= {"IT Department"})
    public void testcase2() {
        System.out.println("Software Developer");
    }

    @Test(groups= {"IT Department"})
    public void testcase3() {
        System.out.println("QA Analyst");
    }

    //@AfterGroups: The @AfterGroups annotated method will run only once after the execution of all the test methods of a specified group.

    @AfterGroups(groups = {"IT Department"})
    public void after_group() {
        System.out.println("The list which is shown above are the testing tools");
    }

    @Test(groups= {"Testing tool"})
    public void testcase11() {
        System.out.println("Appium");
    }

    @Test()
    public void testcase22() {
        System.out.println("JIRA");
    }

    @Test(groups= {"Testing tool"})
    public void testcase33() {
        System.out.println("RedMine");
    }
}
