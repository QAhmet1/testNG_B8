package day1;

import org.testng.annotations.*;

public class LifeCycle {
    // What is Test NG Life Cycle

    @BeforeClass       //  Runs once before a group of tests
    public void beforeClass () {
        System.out.println("Before Class is running");
    }


    @AfterClass
    public void afterClass() {

        System.out.println("After class is running");
    }



    @BeforeMethod     // It will run before each method
    public void BeforeMethod() {

        System.out.println("Before Method is running");

    }


    @AfterMethod
    public void AfterMethod() {
        System.out.println("After method is running");
    }





    @Test
    public void test1() {

        System.out.println("Test 1 is running");
    }


    @Test
    public void test2() {
        System.out.println("Test 2 is running");
    }











}
