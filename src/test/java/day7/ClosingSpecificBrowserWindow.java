package day7;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));			//Implicit Wait
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.linkText("Company")).click();		
		
		Set<String> windows=driver.getWindowHandles();
	}

}
