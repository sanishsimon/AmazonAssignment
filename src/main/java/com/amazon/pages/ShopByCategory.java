package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShopByCategory {
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/web_home_shop_by_department_label")
	
	private WebElement ShopByCategory;
	

public ShopByCategory(AppiumDriver<WebElement> driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

public void clickonShopByCategory() {
	ShopByCategory.click();
}

	
}
