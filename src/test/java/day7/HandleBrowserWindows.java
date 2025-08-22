package day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));			//Implicit Wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();		
		
		Set<String> windows=driver.getWindowHandles();
		//to iterate over set and access set elemenets we need to convert to arraylist 
		
		//approach 1-- for few browser windows only
		
		/*
		List<String> windowlist=new ArrayList(windows);
		
		String parentwindow=windowlist.get(0);
		String childwindow=windowlist.get(1);
		
		//switch to child window
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		
		//switchto parent
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		*/
		
		//Approach 2
		//or using for loop
	}

}
