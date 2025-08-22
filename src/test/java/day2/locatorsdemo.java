package day2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.*;

public class locatorsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//by name
		driver.findElement(By.name("field-keywords")).sendKeys("MacBook");
		//by id
		//WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
		//boolean status=logo.isDisplayed();
		//or----------------
		System.out.println("Status of logo:"+driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
		
		//linkText
				//preferable
		//driver.findElement(By.linkText("Bestsellers")).click();
		
		//partialLinkTeext
					//works if we give partial link text also
		driver.findElement(By.partialLinkText("sellers")).click();
		
		//className
		List<WebElement> headerlinks=driver.findElements(By.className("nav-li"));
		System.out.println(headerlinks.size());
		
		//tagName
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());			//395  --gives total links in webpage
		
		
		//to get total number of images in page we use img tag
		
		List <WebElement> img=driver.findElements(By.tagName("img"));
		System.out.println(img.size());				//44
	}

}
