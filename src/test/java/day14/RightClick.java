package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement rightclick=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick).build().perform();
		
		//click on copy
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		driver.switchTo().alert().accept();
	}

}
