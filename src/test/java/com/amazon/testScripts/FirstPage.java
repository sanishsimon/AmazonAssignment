package com.amazon.testScripts;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;

import com.amazon.pages.HamburgerList;
import com.amazon.pages.ShopByCategory;


//import io.appium.java_client.TouchAction;

import com.amazon.pages.KindleEReaders;
import com.amazon.pages.PaperWhite;



public class FirstPage extends TestAndroid {
ShopByCategory ShopByCategory;
HamburgerList HamburgerList;
KindleEReaders KindleEReader;
PaperWhite PaperWhite;


    @Test
    public void TestAndroi() {
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	ShopByCategory = new ShopByCategory(driver);
	ShopByCategory.clickonShopByCategory();
	System.out.println("ShopByCategory Tapped");
		

	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	HamburgerList = new HamburgerList(driver);
	HamburgerList.clickonkindleEreadersandEBooks();
	System.out.println("Kindle E Readers and E Books Tapped");
    
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	KindleEReader = new KindleEReaders(driver);
	KindleEReader.clickonkindleEReaders();
	System.out.println("KindleEReader Tapped");	   
	
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	PaperWhite = new PaperWhite(driver);
	PaperWhite.clickonPaperWhite();
    System.out.println("PaperWhite Tapped");

}
}
