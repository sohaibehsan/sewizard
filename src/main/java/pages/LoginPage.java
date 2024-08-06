package pages;

import basePage.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends BasePage{
	
	public LoginPage(AndroidDriver driver) {
		super(driver);		
	}

	public MomDashboardPage verifyLogin(String emailinput,String passwordinput)
	{
		driver.findElement(EmailField).sendKeys(emailinput);
		driver.findElement(nextButton).click();
		
		waitForElementPresent(passwordField,15).sendKeys(passwordinput);
		driver.findElement(loginButton).click();
		return new MomDashboardPage(driver); 
	}
}