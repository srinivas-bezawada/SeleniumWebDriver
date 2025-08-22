package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	public static void main(String []args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));			//here we have created for dropdown
		Select dropdn=new Select(dropdown);				///created the object of select class
		
		//By using select class methods we can access dropdown elements of drop down
		
		dropdn.selectByVisibleText("France");		//here it is value which is visible in website
		dropdn.selectByValue("france"); 			//here the value is of value attribute in DOM
		
		dropdn.selectByValue("canada"); 
		
		dropdn.selectByIndex(6);
		
		//get all the options
		
		List<WebElement> options=dropdn.getOptions();
		System.out.println("Total No of Options:"+options.size());
		
		//iterating over elements
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
		for(WebElement x:options) {
			System.out.println(x.getText());
		}
		
		driver.quit();
		
		
	}

}
