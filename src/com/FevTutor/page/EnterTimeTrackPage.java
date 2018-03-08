
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

public class EnterTimeTrackPage extends BasePage{
	
	@FindBy(xpath = "//div[contains(text(),'Help')]")
	private WebElement helpMenu;
	
	@FindBy(linkText = "About your actiTIME")
	private WebElement aboutActitimeMenu;
	
	@FindBy(css = ".productVersion")
	private WebElement productVersion;
	
	@FindBy(id = "aboutPopupCloseButtonId")
	private WebElement closeBTN;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutBTN;
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickHelpMenu(){
		
		helpMenu.click();
	}
	
	public void clickAboutYourActitimeMenu(){
		
		aboutActitimeMenu.click();
	}
	
	public void verifyProductVersion(String expected){
		
		String actual = productVersion.getText();
		Assert.assertEquals(actual, expected);
	}
	
	public void clickCloseButton(){
		
		closeBTN.click();
	}
	
	public void clickLogout(){
		
		logoutBTN.click();
	}

}
