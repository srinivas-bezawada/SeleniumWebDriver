package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc")));
		//element.click();
		WebElement login=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button [@type='submit']")));
		login.click();
	}

}
