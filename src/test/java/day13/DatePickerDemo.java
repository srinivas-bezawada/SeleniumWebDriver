package day13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	static void SelectFutureDate(WebDriver driver,String month,String date,String year) {
		
		//below logic for month and year		-- future date
		
		while(true) {
			//actual data
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentMonth.equals(month) && currentyear.equals(year)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		//below logic for month and year		-- past date	-- same as above but prev button in calender instead of next
				// -->//span[@class='ui-icon ui-icon-circle-triangle-w']	--for prev date
	
		
		//picking date 
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		
		for(WebElement dt:alldates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Method1 -using sendkeys()
		
		driver.switchTo().frame(0);			//here the page is having 1 frame -so we are using index of 0
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/25/2025");
		
		//method 2 -- using date picker---for future dates
		
			//Expected data
				String year="2026";
				String month="May";
				String date="20";
				driver.findElement(By.xpath("//input[@id='datepicker']")).click();				//opens date picker
					
		//calling the method
				SelectFutureDate(driver,"May","24","2026");
				
				
			
		//driver.quit();

	}

}
