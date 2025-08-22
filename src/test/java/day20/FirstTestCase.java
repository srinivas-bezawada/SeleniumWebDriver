package day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	WebDriver driver;			//class level variable declaration so that we can access in all method level
	
  @Test(priority=-1)
  public void openApplication() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.manage().window().maximize();
  }
  @Test(priority=2)
  public void EnterText() {
	  WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
	  name.click();
	  name.sendKeys("hello");
  }
  @Test(priority=300)
  public void closeApplication() {
	  driver.quit();
  }
}
