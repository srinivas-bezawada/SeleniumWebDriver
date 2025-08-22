package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement>checkboxes=driver.findElements(By.xpath("//label[text()='Days:']/parent::div/child::div"));
		System.out.println(checkboxes.size());
		//selecting all the checkboxes
		
			/*for(WebElement x:checkboxes) {						
				x.click();
			}*/
		
		//seleceting specific checkboxes
		
			//select last 4
			//total no of checkboxes-how many you have to select=starting index
		/*for(int i=checkboxes.size()-4;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
		*/
		//select first 3 checkboxes
		/*for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}
		*/
		//select/unselect checkboxes
		/*for(WebElement x:checkboxes) {
			if(x.isSelected()) {
				x.click();		//unselect
			}else {
				x.click();		//select
			}
		}
		
		for(WebElement x:checkboxes) {
			if(x.isSelected()) {
				x.click();		//unselect
			}else {
				x.click();		//select
			}
		}
		*/
		//select specific checkbooxes
		
		for(int i=0;i<checkboxes.size();i++) {
			if(i==1 || i==3 || i==6) {
				checkboxes.get(i).click();
			}
		}
	}

}
