package TestNG;

import org.testng.annotations.Test;

public class ExcludeInclude { //3
    //Exclude/Include test cases:
    //TestNG provides the feature of enabling and disabling the test cases. We can disable a set of test cases from getting executed. For example, consider a scenario where a serious bug occurs in a feature due to certain tests, so we need to disable the test cases from being executed.

    //In TestNG, test cases can be disabled in two ways:
    //You can disable the test case in a @Test annotation.
    //You can disable the test case in the XML file.

    //TestNG @Test enable parameter
    //You can disable or exclude the test cases by using the enable attribute to the @Test annotation and assign False value to the enable attribute.

        @Test(enabled=false)
        public void test1() {
            System.out.println("Hello javaTpoint!!");
        }

        @Test
        public void test2() {
            System.out.println("JTP Travels");
        }

        //Suppose we have multiple test cases and you want to include only one or two test cases, in such situation, we use <include> tag. If we use the <exclude> tag, then it becomes very tedious to exclude all the test cases.
}
