package day22;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority=1,groups= {"sanity","Regression"})
	void PaymentInRupees() {
		System.out.println("Payment in rupees");
	}
	@Test(priority=2,groups= {"sanity","Regression"})
	void PaymentInDollars() {
		System.out.println("Payment in dollars");
	}
	
	

}
