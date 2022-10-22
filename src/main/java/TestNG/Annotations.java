package TestNG;

import org.testng.annotations.*;

public class Annotations { //6

    //What is TestNG Annotation?
    //TestNG Annotation is a piece of code which is inserted inside a program or business logic used to control the flow of execution of test methods.

    //@BeforeSuite: The @BeforeSuite annotated method will run before the execution of all the test methods in the suite.
    //@AfterSuite: The @AfterSuite annotated method will run after the execution of all the test methods in the suite.
    //@BeforeTest: The @BeforeTest annotated method will be executed before the execution of all the test methods of available classes belonging to that folder.
    //@AfterTest: The @AfterTest annotated method will be executed after the execution of all the test methods of available classes belonging to that folder.
    //@BeforeClass: The @BeforeClass annotated method will be executed before the first method of the current class is invoked.
    //@AfterClass: The @AfterClass annotated method will be invoked after the execution of all the test methods of the current class.
    //@BeforeMethod: The @BeforeMethod annotated method will be executed before each test method will run.
    //@AfterMethod: The @AfterMethod annotated method will run after the execution of each test method.
    //@BeforeGroups: The @BeforeGroups annotated method run only once for a group before the execution of all test cases belonging to that group.
    //@AfterGroups: The @AfterGroups annotated method run only once for a group after the execution of all test cases belonging to that group.

    @BeforeSuite
    public void bSuite(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void bTest(){
        System.out.println("Before Test");
    }
    @BeforeClass
    public void bClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void bMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void test(){
        System.out.println("Test 0");
    }
    @AfterMethod
    public void aMethod(){
        System.out.println("After Method");
    }
    @AfterTest
    public void aTest(){
        System.out.println("After Test");
    }
    @AfterClass
    public void aClass(){
        System.out.println("After Class");
    }
    @AfterSuite
    public void aSuite(){
        System.out.println("After Suite");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }


}
