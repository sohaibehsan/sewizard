package pages;

import org.openqa.selenium.By;

import basePage.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class DocPage extends BasePage {

	public DocPage(AndroidDriver driver ) {
		super(driver);
		
	}
	
	By onboardingBtn = By.xpath("//android.view.ViewGroup[@content-desc=\'Onboarding\']");
	By federalForm = AppiumBy.accessibilityId("Federal W-4");
	By fedi9Form = AppiumBy.accessibilityId("Federal I-9");
	By paymentForm = AppiumBy.accessibilityId("Payment Method");
	By dwnloadform = AppiumBy.accessibilityId("downloadText");
	
	
	public void docPag()
	{
		
		
	}

}
