package TestNG;

import org.testng.annotations.Test;

public class Groups { //5

    //https://www.javatpoint.com/testng-groups

    @Test(groups = {"Smoke", "Regression"})
    public void WebLoginPersonalLoan() {
        System.out.println("Web Login Personal Loan");
    }

    @Test(groups = {"Regression"})
    public void MobileLoginPersonalLoan() {
        System.out.println("Mobile Login Personal Loan");
    }

    @Test(groups = {"Smoke"})
    public void APILoginPersonalLoan() {
        System.out.println("API Login Personal Loan");
    }

    //When groups include other groups, these groups are called meta group.
    //define tag is used to create meta groups inside groups tag.
    //We can add priority for groups too.
    //when an entire class is added to a group, it is called default group. we use it for unit testing within a class.
    //when we define groups at the class level and then add groups at the method level, it is called partial groups.

    /*
    <suite name = "suite">
    <groups>
        <run>
            <include name="Smoke"/>
        </run>
    </groups>
    <test name = "test">
        <classes>
            <class name = "TestNG.TestCasesRegex"/>
            <class name="TestNG.Groups"/>
        </classes>
    </test>
    </suite>
     */
}
