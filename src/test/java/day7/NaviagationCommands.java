package day7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagationCommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//using get()
		
		//driver.get("https://demo.nopcommerce.com/");
		
		//orrrrrrrrrr
		
		//using navigate().to(urlobject)
		
		//URL myurl=new URL("https://demo.nopcommerce.com/");			//here object of URL class is called 	//URL class is from java not from selenium
		//driver.navigate().to(myurl);								//now using that url object
		
		driver.navigate().to("https://www.facebook.com/"); 				//can give url in string format also
		
		driver.navigate().to("https://mail.google.com/mail/u/0/");
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
	
	
	}

}
