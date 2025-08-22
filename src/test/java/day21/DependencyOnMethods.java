package day21;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyOnMethods {
	@Test(priority=1)
	public void login() {
		System.out.println("login method");
		Assert.assertTrue(false);
	}
	@Test(priority=2,dependsOnMethods= {"login"})
	public void search() {
		System.out.println("search ");
	}
	@Test(priority=3,dependsOnMethods= {"login","search"})
	public void advancedsearch() {
		System.out.println("Adv Serach");
	}
	@Test(priority=3,dependsOnMethods= {"login","search","advancedsearch"})
	public void logout() {
		System.out.println("logout");
	}

}
