package Generic;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	static{
		Calendar calender = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh:mm:ss");
		extent = new ExtentReports(System.getProperty("user.dir")+"src/Report/test" + formater.format(calender.getTime())+".html", false);
	}
	
	public void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.SUCCESS)
			test.log(LogStatus.PASS , result.getName() + "test is pass");
		else if(result.getStatus() == ITestResult.SKIP)
			test.log(LogStatus.SKIP, result.getName() + "test is skipped and skip reason is: "+result.getThrowable());
		else if(result.getStatus() == ITestResult.FAILURE)
			test.log(LogStatus.FAIL, result.getName() + "test is failed and fail reason is: " + result.getThrowable());
		else if(result.getStatus() == ITestResult.STARTED)
			test.log(LogStatus.INFO, result.getName() + "test is started");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result){
		getResult(result);
	}
	
	@BeforeMethod
	public void beforeMethod(Method result){
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + "test started");
	}
	
	@AfterClass(alwaysRun = true)
	public void endtest(){
		extent.endTest(test);
		extent.flush();
	}

}
