package day21;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test
	void Test() {
		Assert.assertEquals("hello", "hello");			//passed
		Assert.assertNotEquals("123", 345);   			//passed bcoz of not equal values
		
		Assert.assertTrue(true);				//passed
		Assert.assertFalse(false);				//passed
		Assert.assertTrue(false);				//failed
		
		Assert.fail();                          //by default we can make test fail
	}

}
