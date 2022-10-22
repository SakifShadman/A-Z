package TestNG;

import org.testng.annotations.Test;

public class TestCasesRegex { //4

    @Test(groups = {"Smoke"})
    public void WebLoginCarLoan() {
        System.out.println("WebLoginCarLoan");
    }

    @Test
    public void MobileLoginCarLoan() {
        System.out.println("MobileLoginCarLoan");
    }

    @Test
    public void MobileLoginPersonalLoan() {
        System.out.println("MobileLoginPersonalLoan");
    }

    @Test(groups = {"Regression"})
    public void MobileLoginHomeLoan() {
        System.out.println("MobileLoginHomeLoan");
    }

    @Test(groups = {"Smoke"})
    public void LoginAPICarLoan() {
        System.out.println("LoginAPICarLoan");
    }

    //The pattern /sequence .*/ searches the string which is starting with the sequence keyword including space character. The '*' asterisk represents the remaining characters.
    //we include all the test cases represented by the starting keyword 'Mobile' with a pattern Mobile.* in <include> tag.

    /*
    <suite name = "suite">
    <test name = "test">
        <classes>
            <class name = "TestNG.TestCasesRegex">
                <methods>
                    <include name = "Mobile.*"/>
                </methods>
            </class>
        </classes>
    </test>
</suite>
     */
}
