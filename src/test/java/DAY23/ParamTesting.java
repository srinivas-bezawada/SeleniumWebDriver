package DAY23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTesting {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) {
		switch(br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default:System.out.println("Invalid Entry");return;
		}
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	void TestTitle() {
		Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='title']")).getText(),"Automation Testing Practice");
	}
	
	@AfterClass
	void close() {
		driver.quit();
	}

}
