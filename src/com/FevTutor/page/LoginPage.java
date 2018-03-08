
package com.FevTutor.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Generic.BasePage;

/**
 * @author CHANDAN KR. MALHOTRA
 */

public class LoginPage extends BasePage {
	
	@FindBy(id = "username")
	private WebElement unTB;
	
	@FindBy(xpath = "//input[@name='pwd' and @type='password']")
	private WebElement pwdTB;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath = "//span[contains(.,'invalid')]")
	private WebElement errMSG;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un){
		
		unTB.sendKeys(un);
	}
	
    public void setPassword(String pwd){
		
    	pwdTB.sendKeys(pwd);
	}
    
    public void waitFor(){
    
    try{
    	Thread.sleep(3000);
    }catch(InterruptedException ie){
    	ie.printStackTrace();
    }
    
    
    
    }
    
    public void clickLoginBtn(){
    	
    	loginBTN.click();
    }
    
    public void verifyErrMSGIsDisplayed(){
    	
    	Assert.assertTrue(errMSG.isDisplayed());
    }

}
