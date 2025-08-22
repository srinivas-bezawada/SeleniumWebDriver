package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		// https://ui.vision/demo/webtest/frames/
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));
		
		driver.findElement(By.xpath("//input[@type='text' and @name='mytext1']")).sendKeys("hello");
		
		//frame to frame we cannot switch
		//we need to come out of first frame to main page
		//and then we can switch to another frame
		
		driver.switchTo().defaultContent();
		//to frame 2
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_2.html']")));
		
		driver.findElement(By.xpath("//input[@type='text' and @name='mytext2']")).sendKeys("hello");
		driver.switchTo().defaultContent();
		
		//switch to frame 5 and click on iframe link and handle the iframe from frame 5
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_5.html']")));
		driver.findElement(By.linkText("https://a9t9.com")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);						//here we are giving the index as it is the only frame inside the 5 frame 
														// and is at index 0 --- here it is iframe also which is part of a frame 
		
		System.out.println(driver.getTitle());					//Frames - Web Automation Test


	}

}
