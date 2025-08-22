package day16;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//full page screenshot
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		
		sourcefile.renameTo(targetfile);		//copy source file to targetfile
		
		//screenshot of specific section
		WebElement tab=driver.findElement(By.xpath("//h2[text()='Tabs']"));
		File sourcefile1=tab.getScreenshotAs(OutputType.FILE);
		File targetfile1=new File(System.getProperty("user.dir")+"\\Screenshots\\specificpage.png");
		sourcefile1.renameTo(targetfile1);
	}

}
