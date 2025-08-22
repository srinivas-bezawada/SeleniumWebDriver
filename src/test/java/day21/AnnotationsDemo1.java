package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	//WebDriver driver;
	@BeforeMethod
	public void login() {
		//driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		System.out.println("Before Method");
	}
	@Test(priority=1)
	public void EnterNameText() {
		  //WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		  //name.click();
		  //name.sendKeys("hello");
		  System.out.println("Entered Name1 successfully");
	}
	@Test(priority=2)
	public void EnteremailText() {
		  //WebElement name=driver.findElement(By.xpath("//input[@id='email']"));
		  //name.click();
		  //name.sendKeys("email");
		  System.out.println("Entered Email1 successfully");
	}
	@AfterMethod
	public void logout() {
		//driver.quit();
		System.out.println("After Method");
	}

}
