package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class CSSSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();			//to maximize the browser window
		
		
		//enter text to search box
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("SAMSUNG");		//using tagname and ID
		
		//CLICK ON SEARCH
		driver.findElement(By.cssSelector("button.button-1 search-box-button")).click();			//using tagname and class
		
		//  input[placeholder='Search store']													//using tagname and attribute
		
		// input.search-box-text[placeholder='Search store']								//using tagname class and attribute
		
		
		///html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]			//absolute xpath
		/////*[@id="topcartlink"]/a/span[1]						//relative xpath
		
		
		

	}

}
