package day21.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {
	@AfterTest
	void xyz() {
		System.out.println("After Test");
	}
	@Test
	void c2() {
		System.out.println("c2");
	}

}
