
package com.FevTutor.test;

import org.testng.annotations.Test;

import com.FevTutor.page.LoginPage;

import Generic.Excel;

/**
 * @author CHANDAN KR. MALHOTRA
 */

public class InvalidLogin extends BaseTest {
	
	@Test(priority = 2)
	public void testInvalidLogin(){
		
		int rc = Excel.getRowCount(EXCEL_PATH, "InvalidLogin");
		
		for(int i = 0; i<rc; i++){
			
			String un = Excel.getCellValue(EXCEL_PATH, "InvalidLogin", 1, 0);
			String pwd = Excel.getCellValue(EXCEL_PATH, "InvalidLogin", 1, 1);
			
			LoginPage l = new LoginPage(driver);
			l.setUserName(un);
			l.setPassword(pwd);
			l.waitFor();
			l.clickLoginBtn();
			l.verifyErrMSGIsDisplayed();
			
		}
		
		/*
		//Enter invalid username
		LoginPage l = new LoginPage(driver);
		l.setUserName("chandan");
		
		//Enter invalid password
		l.setPassword("chandan123");
		
		//wait for 3 second
		l.waitFor();
		
		//Click on login button
		l.clickLoginBtn();
		
		//Verify the error message is displayed
		l.verifyErrMSGIsDisplayed();
		*/
	}

}
