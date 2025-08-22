package day7;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='wikipedia-search-results']/child::*"));
		System.out.println("Count of links available:"+links.size());
		System.out.println("Printing and clicking links");
		for(WebElement x:links) {
			System.out.println(x.getText());
			x.click();
		}
		
		//after opening links get window ids
		
		Set<String> windowhandles=driver.getWindowHandles();
		for(String x:windowhandles) {
			String title=driver.switchTo().window(x).getTitle();
			System.out.println(title);
		}
		
		driver.quit();
		
	}

}
