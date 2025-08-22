package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Autosuggestionhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bjs.com/");
		WebElement searchbox=driver.findElement(By.xpath("//input[@type='search']"));
		searchbox.click();
		Thread.sleep(5000);
		searchbox.sendKeys("school");
		Thread.sleep(5000);
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='list list-group']"));
		for(int i=0;i<elements.size();i++) {
			  System.out.println(elements.get(i).getText());
		}
	}

}
