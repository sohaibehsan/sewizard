package pages;

import org.openqa.selenium.By;

import basePage.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MorePage extends BasePage{
	
	public MorePage(AndroidDriver driver) {
		super(driver);
		
	}
	
	By moreScreen = By.xpath("//android.widget.TextView[@text='More']");
	By myAccountBtn = AppiumBy.accessibilityId("My Account");

	
	public MyAccountPage clickAccBtn() {
		driver.findElement(myAccountBtn).click();
		return new MyAccountPage(driver);
	}
	
public boolean isScreenDisplayed()
{
	return driver.findElement(moreScreen).isDisplayed();
}


}
