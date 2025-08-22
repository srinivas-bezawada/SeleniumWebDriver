package day24;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {
	
	public void onStart(ITestContext context) {
	    // not implemented
		System.out.println("Excecution started");
	  }
	
	public void onTestStart(ITestResult result) {
	    // not implemented
		System.out.println("Test started"); 			//before methods
	  }
	
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		 System.out.println("test passed");
		  }
	 
	 public void onTestFailure(ITestResult result) {
		    // not implemented
		 System.out.println("Test Failed");
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		    // not implemented
		 System.out.println("test skipped");
		  }
	 
	 public void onFinish(ITestContext context) {
		    // not implemented
		 System.out.println("Test completed");
		  }

}
