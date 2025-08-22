package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElementHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//This Element is inside single shadow DOM.
		String cssSelectorForHost1 = "#shadow_host";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("input[type='text']")).sendKeys("hello");
	}

}
