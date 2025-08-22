package day21.pack;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class AllTestAnnotations {
	@BeforeSuite
	void c1() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	void c2() {
		System.out.println("Before Test");
	}
	@BeforeClass
	void c3() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	void c4() {
		System.out.println("Before Method");
	}
	@Test
	void Test1() {
		System.out.println("Test Method 1");
	}
	@Test
	void Test2() {
		System.out.println("Test Method 2");
	}
	@AfterSuite
	void c5() {
		System.out.println("After Suite");
	}
	
	@AfterTest
	void c6() {
		System.out.println("After Test");
	}
	@AfterClass
	void c7() {
		System.out.println("After Class");
	}
	@AfterMethod
	void c8() {
		System.out.println("After Method");
	}

}
