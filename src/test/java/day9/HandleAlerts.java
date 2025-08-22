package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		
		//noraml alert with OK button
		
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
		
		//both ok and cancel
		
		// same as above using .accept() and .dismiss()
		
		//prompt alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert myalert1=driver.switchTo().alert();
		//to enter text
		myalert1.sendKeys("Helo");
		
		System.out.println(myalert1.getText());						//I am a JS prompt
		
		
		myalert1.accept();
		
	}

}
