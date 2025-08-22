package day13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//so for dropdown type month and year	-- can directly use select class and we can select the date also
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='SelectedDate']")).click();	
		Select month=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByVisibleText("Jan");
		
		Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByVisibleText("2017");
		String date="27";
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for(WebElement x:dates) {
			if(x.getText().equals(date)) {
				x.click();
				//break;
			}
		}
	}

}
