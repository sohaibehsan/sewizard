package pages;

import org.openqa.selenium.By;

import basePage.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MomDashboardPage extends BasePage {
	
	By Dashboardbtn = AppiumBy.accessibilityId("Dashboard");

	public MomDashboardPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	public boolean isScreenDisplay(){
		return driver.findElement(Dashboardbtn).isDisplayed();
		
	}
	
}
