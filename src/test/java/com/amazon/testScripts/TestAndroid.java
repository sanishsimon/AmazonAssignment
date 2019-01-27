package com.amazon.testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.pages.ShopByCategory;
import com.amazon.pages.SkipSignInPage;

import io.appium.java_client.android.AndroidDriver;

public class TestAndroid {

static AndroidDriver driver;
SkipSignInPage SkipSignInPage;
ShopByCategory ShopByCategory;

@BeforeClass
	
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Redmi Sanish");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		capabilities.setCapability("noReset", true);

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		 
	}
	
	@Test
	public void TestAndroid() {
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	// SkipSignInPage = new SkipSignInPage(driver);
	// SkipSignInPage.clickOnSkipSignIn();
	 System.out.println("1.Skip sign in clicked");
	}
 
}
