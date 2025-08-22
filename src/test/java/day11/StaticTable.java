package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		 //getting single value from static table
		
		System.out.println("Element value of particular position:"+driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]")).getText());
		
		//getting row count
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(rows.size());
		
		//getting column count
		List<WebElement> col=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		System.out.println(col.size());
		
		
		//iterating using for loop
		/*for(int r=2;r<=rows.size();r++) {
			for(int c=1;c<=col.size();c++) {
				System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText()+"\t");
			}System.out.println();
		}*/
		
		//getting bookname for author 
		
		/*for(int r=2;r<rows.size();r++) {
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(author.equals("Animesh")) {
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+r+\"]//td[1]")).getText()+"\t"+author);
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+r+\"]//td[3]")).getText());	//get subject for author
			}
		}*/
		
		//find total price of books
		int price=0;
		for(int r=2;r<rows.size();r++) {
			String price1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			price=price+Integer.parseInt(price1);
		}
		System.out.println("Total price of books:"+price);
		
		
		driver.quit();
		
	}

}
