package basePage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import pages.LoginPage;

public class BasePage {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	
	public By EmailField = By.xpath("//android.widget.EditText[@text='Enter Your Email Address']");
	public By nextButton = AppiumBy.accessibilityId("Next");
	public By passwordField = By.xpath("//android.widget.EditText[@text='Enter Password']");
	public By profileTab = AppiumBy.accessibilityId("Profile");
	public By docTab = AppiumBy.accessibilityId("Documents");
	public By pageTitle = AppiumBy.accessibilityId("title");
	public By submitbtn = AppiumBy.accessibilityId("Submit");
	public By saveBtn = AppiumBy.accessibilityId("rightView");
	public By titleOfMom = AppiumBy.accessibilityId("appName");
	public By loginButton = AppiumBy.accessibilityId("Log In");
	
	
	public BasePage(AndroidDriver driver) {
		this.driver = driver;
	}
	
	public void isMomPageDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(titleOfMom));
	}
	
	public LoginPage gotoLogin() {
		driver.findElement(loginButton).click();
		return new LoginPage(driver);
	}
	/*
	 *waits for presence of element
	 *Takes Locator and time as arguments
	 *returns WebElement if found in given time
	 */
	public WebElement waitForElementPresent(By element,int time) {
		return new WebDriverWait(driver,Duration.ofSeconds(time)).until(ExpectedConditions.presenceOfElementLocated(element));
	}
	
	public WebElement waitForElementVisibility(By element,int time) {
		return new WebDriverWait(driver,Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	
	/*
	 * waits for invisibility of element
	 * Takes locator and time as arguments
	 * returns List of WebElements
	 */
	public List<WebElement> waitForElementsPresent(By element,int time) {
		return new WebDriverWait(driver,Duration.ofSeconds(time)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}
	
	

}
