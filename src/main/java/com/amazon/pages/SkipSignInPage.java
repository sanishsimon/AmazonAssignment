package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SkipSignInPage {
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/sign_in_button")
	
	private WebElement AlreadyaCustomerSignIn;

	
@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/new_user")
	
	private WebElement NewToAmazonInCreateAnAccount;

@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/skip_sign_in_button")

private WebElement SkipSignIn;

public SkipSignInPage(AppiumDriver<WebElement> driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

public void clickOnSkipSignIn() {
	SkipSignIn.click();
}
	
public void clickOnNewToAmazonInCreateAnAccount() {
	NewToAmazonInCreateAnAccount.click();
}
		
public void clickOnAlreadyaCustomerSignIn() {
	AlreadyaCustomerSignIn.click();
			
}
}
