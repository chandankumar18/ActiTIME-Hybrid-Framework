
package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * @author CHANDAN KR. MALHOTRA
 */

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void verifyTitle(String eTitle){
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		try{
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("PASS: Title is matching", true);
		}catch(Exception e){
		Reporter.log("FAIL: Title is not matching", true);
		Assert.fail();
		}
		
	}

}
