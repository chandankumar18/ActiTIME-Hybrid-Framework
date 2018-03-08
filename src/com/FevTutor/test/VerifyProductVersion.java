
package com.FevTutor.test;

import org.testng.annotations.Test;

import com.FevTutor.page.EnterTimeTrackPage;
import com.FevTutor.page.LoginPage;

/**
 * @author CHANDAN KR. MALHOTRA
 */

public class VerifyProductVersion extends BaseTest{
	
	@Test(priority = 3)
	public void tesVerifyProductVersion(){
		
		LoginPage login = new LoginPage(driver);
		
		//Enter the valid username
		login.setUserName("admin");
		
		//Enter the valid password
		login.setPassword("manager");
		
		//Wait for 3 second
		login.waitFor();
		
		//Click on login button
		login.clickLoginBtn();
		
		//Wait for 3 second
		login.waitFor();
		
		//Click on Help menu
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.clickHelpMenu();
		
		//Wait for 3 second
		login.waitFor();
		
		//Click on about your actiTime
		e.clickAboutYourActitimeMenu();
		
		//Wait for 3 second
		login.waitFor();
		
		//Verify product version
		e.verifyProductVersion("actiTIME 2017.1");
		
		//Wait for 3 second
		login.waitFor();
		
		//Close the pop-up
		e.clickCloseButton();
		
		//Click logout
		e.clickLogout();
		
	}

}
