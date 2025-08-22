package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).getAttribute("placeholder"));
		driver.findElement(By.xpath("//input[@id='comboBox']")).click();
		List<WebElement>options=driver.findElements(By.xpath("//input[@id='comboBox']/following-sibling::div/child::*"));
		for(WebElement x:options) {
			System.out.println(x.getText());
		}
		driver.findElement(By.xpath("//div[text()='Item 4']")).click();
	}

}
