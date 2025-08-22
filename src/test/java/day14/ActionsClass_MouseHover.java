package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement pointer=driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
		WebElement mobiles=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		//Mouse Hover using Actions Class
		Thread.sleep(3000);
		act.moveToElement(pointer);
		Thread.sleep(3000);
		act.moveToElement(mobiles).click();
		
		
	}

}
