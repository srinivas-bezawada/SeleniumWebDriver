package day21.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	
	@BeforeTest
	void abc() {
		System.out.println("Before Test");
	}
	@Test
	void c1() {
		System.out.println("c1 ");
	}

}
