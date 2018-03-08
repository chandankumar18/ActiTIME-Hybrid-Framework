
package com.FevTutor.test;

import org.testng.annotations.Test;

import com.FevTutor.page.LoginPage;

import Generic.Excel;

/**
 * @author CHANDAN KR. MALHOTRA
 */

public class ValidLogin extends BaseTest {
	
	@Test(priority = 1)
	public void testValidLogin(){
		
		String un = Excel.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
		String pwd = Excel.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
		String hpt = Excel.getCellValue(EXCEL_PATH, "ValidLogin", 1, 2);
	
		LoginPage login = new LoginPage(driver);
		
		login.setUserName(un);
		
		login.setPassword(pwd);
		
		//Wait for 3 second
		login.waitFor();
		
		login.clickLoginBtn();
		
		login.verifyTitle(hpt);
		
		/*
		//Enter the valid username
		login.setUserName("admin");
		
		//Enter the valid password
		login.setPassword("manager");
		
		//Wait for 3 second
		login.waitFor();
		
		//Click on login button
		login.clickLoginBtn();
		
		//verify home page is displayed
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		
		e.verifyTitle("actiTIME - Enter Time-Track");
		*/
	}

}
