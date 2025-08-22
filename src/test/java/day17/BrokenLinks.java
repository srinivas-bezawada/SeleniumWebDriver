package day17;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		//Total number of links
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links:"+links.size());
		
		//iterating over each link
		int invalidlink=0;
		int brokenlink=0;
		int validlink=0;
		for(WebElement eachlink:links) {
			
			String hrefattvalue=eachlink.getAttribute("href");
			if(hrefattvalue==null || hrefattvalue.isEmpty()) {
				System.out.println("href value is empty, so we cannot check further");
				invalidlink+=1;
				continue;			//skip this link and move further with other links
				
			}
			try {
			URL linkurl=new URL(hrefattvalue);
			HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefattvalue+"===> broken Link");
				brokenlink+=1;
			}else {
				System.out.println(hrefattvalue+"===> not a broken link");
				validlink+=1;
			}
			}catch(Exception e) {
				
			}
		}
		System.out.println("Not valid link count:"+invalidlink);
		System.out.println("Broken link count:"+brokenlink);
		System.out.println("Valid Link Count:"+validlink);
		
		driver.quit();

	}

}
