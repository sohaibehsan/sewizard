package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePage.BasePage;
import baseTest.MomBaseTest;
import io.appium.java_client.AppiumBy;
import pages.LoginPage;
import pages.MorePage;
import pages.MyAccountPage;

public class MyAccountTest extends MomBaseTest{
	
	MyAccountPage myAccountPage;

	@Test
	public void editFirstName()
	{
		navigateTillLogin();
		myAccountPage = morePage.clickAccBtn();
		myAccountPage.enterFirstName("Testing");
		myAccountPage.clickSaveBtn();
		myAccountPage.clickBackButton();
		morePage.clickAccBtn();
		String actualFirstName = myAccountPage.getFirstName();
		Assert.assertEquals(actualFirstName, "Testing");
	}
	@Test
	public void editLastName()
	{
		navigateTillLogin();
		myAccountPage = morePage.clickAccBtn();
		myAccountPage.enterLastName("Automation");
		myAccountPage.clickSaveBtn();
		myAccountPage.clickBackButton();
		morePage.clickAccBtn();
		String actualLastName = myAccountPage.getLastName();
		Assert.assertEquals(actualLastName, "Automation");
		
	}

	@Test
	public void changePassword() {
		navigateTillLogin();
		MyAccountPage myAccountPage = morePage.clickAccBtn();
		myAccountPage.changePassword("Aio@123456", "Aio@123456", "Aio@123456");
		myAccountPage.clickPswdSaveBtn1();
		myAccountPage.clickBackButton();
		morePage.clickAccBtn();
		
	}

}