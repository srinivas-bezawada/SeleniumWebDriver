package day24;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkreports;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
	    // not implemented
		sparkreports=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		sparkreports.config().setDocumentTitle("Automation Testing");
		sparkreports.config().setReportName("Functional Testing");
		sparkreports.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkreports);
		
		extent.setSystemInfo("Tester Name", "Anurag");
		
		System.out.println("Excecution started");
	  }
	
	
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		 test=extent.createTest(result.getName());
		 test.log(Status.PASS, "Test case passed:"+result.getName());
		 System.out.println("test passed");
		  }
	 
	 public void onTestFailure(ITestResult result) {
		    // not implemented
		 test=extent.createTest(result.getName());
		 test.log(Status.FAIL, "Test case FAILED:"+result.getName());
		 test.log(Status.FAIL, "Test case failed cause is "+result.getThrowable());
		 System.out.println("Test Failed");
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		    // not implemented
		 test=extent.createTest(result.getName());
		 test.log(Status.SKIP, "Test case SKIPPED:"+result.getName());
		 System.out.println("test skipped");
		  }
	 
	 public void onFinish(ITestContext context) {
		    // not implemented
		 extent.flush();
		  }
}
