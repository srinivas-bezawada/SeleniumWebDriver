package day22;

import org.testng.annotations.Test;

public class SignUpTests {
	@Test(priority=1,groups= {"Regression"})
	void signupbyemail() {
		System.out.println("signup by email");
	}
	@Test(priority=2,groups= {"Regression"})
	void signupbyfacebook() {
		System.out.println("signup by facebook");
	}
	
	@Test(priority=2,groups= {"Regression"})
	void sigupByTwitter() {
		System.out.println("signup by twitter");
	}

}
