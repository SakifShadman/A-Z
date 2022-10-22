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

    @Test
    public void APILoginPersonalLoan() {
        System.out.println("API Login Personal Loan");
    }
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
