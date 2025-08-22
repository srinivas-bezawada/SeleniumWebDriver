package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(day24.ExtentReportManager.class)
public class SimpleTests {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=0)				//here test is passed
	void TestTitle0() {
		Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='title']")).getText(),"Automation Testing Practice");
	}
	
	@Test(priority=1)					//test is failed here
	void TestTitle1() {
		Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='title']")).getText(),"Automation Testing Practic");
	}
	
	@Test(priority=2,dependsOnMethods= {"TestTitle1"})				//here this test will be skipped 
	void TestTitle() {
		Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='title']")).getText(),"Automation Testing Practice");
	}
	
	@AfterClass
	void close() {
		driver.quit();
	}

}
