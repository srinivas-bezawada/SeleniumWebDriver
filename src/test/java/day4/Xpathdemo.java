package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();			//ctrl+shift+o--->to import packages
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();	
		
		
		//using text() method and fetch the text using getText() method
		
		//System.out.println(driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText());
		
		//using rediff business---https://money.rediff.com/gainers/bse/daily/groupa
		//count no of chld eelements for given parent
		List <WebElement> lis=driver.findElements(By.xpath("//a[contains(text(),'Krishna Institute')]/ancestor::tr/child::td"));
		
		System.out.println("Number of child elements:"+lis.size());			//Number of child elements:6
		
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Krishna Institute')]/ancestor::tr"));
		System.out.println(ele.getText());				//Krishna Institute A 741.40 756.00 + 1.97 Buy  |  Sell
	}

}
