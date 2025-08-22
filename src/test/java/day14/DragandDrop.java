package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions act=new Actions(driver);
		
		Action perform=act.dragAndDrop(drag, drop).build();				//using Action interface to store the build and actions class
		
		perform.perform();
		
		driver.switchTo().newWindow(WindowType.TAB);

	}

}
