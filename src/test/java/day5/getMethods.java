package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle()
		
		//System.out.println(driver.getTitle());						//OrangeHRM
		
		//getCurrentUrl()
		
		//System.out.println(driver.getCurrentUrl());					//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		//getPageSource()
		//used for validating source code in DOM
		
		//System.out.println(driver.getPageSource());					//prints entire pagesource code
		
		//getWindowHandle()
		
		//System.out.println(driver.getWindowHandle());							//id of single browser window -3090888298388328E712359121BFB05C --changes dynamically
		
		//getWindowHandles()
		
		//before using window handles we will use multiple windows
		
		//to do so
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		Set<String> handles=driver.getWindowHandles();					//gives output in set --[703B5839D87B8E7E5C6CBA7179EA2F4B, EF415095CCB7C9308A10AEF39F2E5BF4]
		
		//why only set- because window id s are unique - so set doesnot allow duplicates
		
		System.out.println(handles);				//[96F444015085D4C462674C2E97C2BE8E, FBE717433358E7A7EAC42E7FEFAFC632] -- in form of set
		
		//driver.close();
		
		driver.quit(); 
	}

}
