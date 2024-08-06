package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePage.BasePage;
import baseTest.MomBaseTest;
import pages.LoginPage;
import pages.MorePage;

public class LoginTest extends MomBaseTest{
	
	
	
	@Test
	public void login()
	{
		navigateTillLogin();
		Assert.assertTrue(momdashboardpage.isScreenDisplay());
	}

}
