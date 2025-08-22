package day22;

import org.testng.annotations.Test;

public class LoginTests {
	@Test(priority=1,groups= {"sanity"})
	void loginbyemail() {
		System.out.println("Login by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginbyfacebook() {
		System.out.println("login by facebook");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByTwitter() {
		System.out.println("login by twitter");
	}

}
