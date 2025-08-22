package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatorAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		//Injection process-without using sendkeys()---we will give with url only directly--Bypassing
		
		//syntax
		//https://username:passwod@the-internet.herokuapp.com/basic_auth
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
