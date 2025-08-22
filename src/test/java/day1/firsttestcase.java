package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
public class firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch Browser
		//ChromeDriver cd=new ChromeDriver();			//here object of ChromeDriver has constructor which is called to launch
		///orrr  
		WebDriver driver =new ChromeDriver();
		//WebDriver driver =new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		//open url 
		//https://demo.opencart.com/
		//https://www.opencart.com/
		driver.get("https://www.opencart.com/index.php?route=cms/demo");			//webdriver methods
		
		System.out.println("Solve the Captcha and Hit Enter after completeion");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();				//this waits for users ENTER keyword
		
		System.out.println("Continuing next operations");
		//validate Title 
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("OpenCart - Demo")) {
			System.out.println("Title is matching");
		}else {
			System.out.println("Title is not matching");
		}
		
		//close the browser
		//driver.close();
		//driver.quit();
	}

}
