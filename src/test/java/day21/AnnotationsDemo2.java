package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	//WebDriver driver;
	@BeforeClass
	public void login() {
		//driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		System.out.println("Before Class");
	}
	@Test(priority=1)
	public void EnterNameText() {
		  //WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		  //name.click();
		  //name.sendKeys("hello");
		  System.out.println("Entered Name2 successfully");
	}
	@Test(priority=2)
	public void EnteremailText() {
		  //WebElement name=driver.findElement(By.xpath("//input[@id='email']"));
		  //name.click();
		  //name.sendKeys("email");
		  System.out.println("Entered Email2 successfully");
	}
	@AfterClass
	public void logout() {
		//driver.quit();
		System.out.println("After Class");
	}

}
