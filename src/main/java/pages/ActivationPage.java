package pages;

import org.openqa.selenium.By;

import basePage.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ActivationPage extends BasePage{
	
	By activationButton = AppiumBy.accessibilityId("Activate Account");
	By otpField = AppiumBy.accessibilityId("OTP digit 1");
	By otpField1 = AppiumBy.accessibilityId("OTP digit 2");
	By otpField2 = AppiumBy.accessibilityId("OTP digit 3");
	By otpField3 = AppiumBy.accessibilityId("OTP digit 4");
	By otpField4 = AppiumBy.accessibilityId("OTP digit 5");
	By otpField5 = AppiumBy.accessibilityId("OTP digit 6");
	
	
	public ActivationPage(AndroidDriver driver) {
		super(driver);
		
	}
	
	public void activation(String emailfield,CharSequence[] otp1)
	{
		driver.findElement(activationButton).click();
		driver.findElement(EmailField).sendKeys(emailfield);
		driver.findElement(otpField).sendKeys(otp1);
		driver.findElement(otpField1).sendKeys(otp1);
		driver.findElement(otpField2).sendKeys(otp1);
		driver.findElement(otpField3).sendKeys(otp1);
		driver.findElement(otpField4).sendKeys(otp1);
		driver.findElement(otpField5).sendKeys(otp1);
		
	}

}
