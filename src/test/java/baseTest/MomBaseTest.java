package baseTest;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePage.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.MomDashboardPage;
import pages.LoginPage;
import pages.MorePage;

public class MomBaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public MomDashboardPage momdashboardpage;
	public MorePage morePage;
	
	@BeforeMethod
	public void Beforemethod() throws MalformedURLException
	{
//		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Sohaib Ehsan\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
	
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Momtesting");
		options.setApp("D:\\My\\MOM1\\src\\main\\java\\Resources\\deviceBugsResolved.apk");
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void navigateTillLogin() {
		BasePage basePage = new BasePage(driver);
		basePage.isMomPageDisplayed();
		LoginPage loginPage = basePage.gotoLogin();
		momdashboardpage =  loginPage.verifyLogin("sohaib23@blondmail.com","Aio@123456");
	}
	
	@AfterMethod
	public void Aftermethod() {
		
		driver.quit();
//		service.stop();
	}

}
