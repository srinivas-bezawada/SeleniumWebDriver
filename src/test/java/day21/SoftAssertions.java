package day21;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	@Test
	void softassertdemo() {
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2); 				//here test fails but below steps also executes due to soft assertion
		
		System.out.println("Hello1");
		System.out.println("sdflkjasdfh");
		
		sa.assertAll();  		//mandatory step 
	}
	

}
