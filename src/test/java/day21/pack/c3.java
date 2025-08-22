package day21.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {
	@BeforeSuite
	void abc() {
		System.out.println("Before Suite");
	}
	@Test
	void hgh() {
		System.out.println("c3");
	}
	@AfterSuite
	void agd() {
		System.out.println("After Suite");
	}

}
