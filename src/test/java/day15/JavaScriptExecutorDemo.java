package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeAsyncScript("arguments[0].setAttribute('value','John')", inputbox);
		
		WebElement checkbox=driver.findElement(By.xpath("//label[text()='Days:']/parent::div/child::div[1]"));
		//checkbox.click();
		js.executeScript("arguments[0].click();", checkbox);
	}

}
