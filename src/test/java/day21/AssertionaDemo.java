package day21;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionaDemo {
	@Test
	void TestTitle() {
		String exp_title="hello";
		String act_title="hell";
		
		if(exp_title.equals(act_title)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");					//here in this case test case will pass but test condition fails
		}
		
		Assert.assertEquals(exp_title, act_title); 				//here in this case test case will fail
	}

}
