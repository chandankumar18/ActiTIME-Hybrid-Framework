
package com.FevTutor.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Generic.IAutoConst;

/**
 * @author CHANDAN KR. MALHOTRA
 */

public abstract class BaseTest implements IAutoConst{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postCondition(){
		driver.quit();
	}

}
