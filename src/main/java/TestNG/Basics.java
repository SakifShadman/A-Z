package TestNG;

public class Basics { //1
    public static void main(String[] args) {

        //TestNG is an open source automated Testing framework. In TestNG, NG stands for "Next Generation".
        //TestNG provides you full control over the test cases and the execution of the test cases. Due to this reason, TestNG is also known as a testing framework.

        //Advantages of TestNG over Junit
        //In TestNG, annotations are easier to understand than Junit.
        //It produces the HTML reports for implementation.
        //It also generates the Logs.
        //TestNG enables you to group the test cases easily which is not possible in JUnit.
        //It allows you to run the test cases of a particular group. Let's consider a scenario where we have created two groups such as 'Smoke' and 'Regression'. If you want to execute the test cases in a 'Regression' group, then this can only be possible in the TestNG framework.
        //Parallel execution of test cases, i.e., running multiple test cases is only possible in the TestNG framework.


        //Features of TestNG
        //Multiple Before and After annotation options:
        //Before and after annotations are used to execute a certain set of code before and after executing the test methods. These annotations are used to set the variables or configuration before the start of the execution of test methods and clean up all the variables after the execution ends. Some of the Before and After annotations are @BeforeSuite, @BeforeTest, @BeforeGroups, @BeforeClass, etc.

        //XML-based test configuration:
        //Test suites in a Testng are mainly configured by using the XML-based file. Testng.xml file is used to organize and run the test suites. The testng.xml file is used to create the test suites by using classes, test methods, packages as well as by using the test groups. It is also used to pass the parameters to test classes or methods.

        //Dependent methods:
        //Dependency is a feature of Testng that allows a test method to depend on the single or group of test methods. Dependency works on the principle "depend-on-method" which must be either in the same class or in the inherited base class. This is the most important feature in TestNG that tells the TestNG to run the dependent test method after the execution of a given test method. You can also configure whether you want dependent test method should be executed or not even after the execution of the given test method fails.

        //Groups/group of groups:
        //TestNG groups allow you to group the test methods. By using TestNG groups, you can declare the methods in a group as well as you can declare the groups within a group. The Testng group can be used to include a certain set of groups and can exclude another set of groups.

        //Dependent groups:
        //Similar to the Dependent methods, test methods in a group can depend on the test methods of another group.

        //Parameterization of test methods:
        //One of the most important feature of TestNG is Parameterization. This feature allows you to pass the arguments as parameters and this achieved by using testng@Parameters annotation. We can pass the parameters to test methods in two ways, i.e., testng.xml file and DataProviders.

        //Data-driven testing:
        //TestNG allows users to perform data-driven testing. This testing allows users to execute the same test multiple times with multiple sets of data. To achieve the data-driven testing, DataProvider feature is used. DataProvider is a data feeder method that executes the test method with multiple sets of data.

        //Multithreaded execution:
        //Multithreaded execution is the parallel execution of tests. Multithreading means the execution of multiple parts of software at the same time. Based on the configuration in the XML file, multiple threads are started, and test methods are executed in them. Multithreaded execution saves a lot of execution time.

        //Better reporting:
        //Testng provides XML and HTML reports by default for test execution. You can even add your own custom reports when required.

        //Open API:
        //TestNG contains the open API means API is publicly available to the developers. This feature allows you to create your custom extensions in your framework when required.
    }
}