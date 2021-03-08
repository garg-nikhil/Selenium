package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPriorities {

//	O/p for below program:-
//	beforeSuite
//	In BeforeTest
//	In BeforeClass
//	In @BeforeMethod									// Before method and after method will always execute after each test case
//	in Test case1										//One can also use priority tag to assign priority to the test cases. Syntax for priority tag: @Test(priority=1)	
//	In @AfterMethod										//In this program we have used @test twice without priorities tag, in such cases testNG can pick any testcase at random
//	In @BeforeMethod									//if you assign same priority to 2 test cases it will execute both test cases but at random without any errors
//	In TestCase2										1. If we are dealing with multiple classes and pre,post condition is same then we should use @BeforeTest & @AfterTest
														//2. If we are dealing with same class and pre,post conditions are specific at single class level then we should use @BeforeClass & @AfterClass
														//3. If we are dealing with pre & post condition at test case level then we should use @beforeMethod and @AfterMethod 
//	In @AfterMethod
//	In @AfterClass
//	In @AfterTest

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("beforeSuite");

	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("In BeforeClass");

	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("In BeforeTest");

	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("In @BeforeMethod");

	}

	@Test
	public void T1() {
		System.out.println("in Test case1");

	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("In @AfterMethod");

	}

	@AfterTest
	public void AfterTest() {
		System.out.println("In @AfterTest");

	}

	@AfterClass
	public void AfterClass() {
		System.out.println("In @AfterClass");

	}

	@Test
	public void T2() {
		System.out.println("In TestCase2");
	}

}
