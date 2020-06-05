package com.Ecommerce.website.TestClasses;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Ecommerce.website.HelperClasses.AlertHelper;
import com.Ecommerce.website.HelperClasses.ButtonHelper;
import com.Ecommerce.website.HelperClasses.CompareProducts;
import com.Ecommerce.website.HelperClasses.LoginHelper;
import com.Ecommerce.website.HelperClasses.ReceiptWindow;
import com.Ecommerce.website.HelperClasses.TextHelper;

public class CompareProdAndCheckOutAsGuest extends LaunchFirefoxBrowser {
	
	@Test
	public static void guestCheckout(){

		CompareProducts.compare();
		ButtonHelper.clickOnButton(By.id("login:guest"));
		AlertHelper.isElementPresent(driver);
		driver.switchTo().parentFrame();
		ButtonHelper.clickOnButton(By.id("onepage-guest-register-button"));
		TextHelper.typeInTextBox(By.id("billing:firstname"), "abcd");
		TextHelper.typeInTextBox(By.id("billing:lastname"), "xyz");
		TextHelper.typeInTextBox(By.id("billing:email"), "acb@gmail.com");
		ButtonHelper.clickOnButton(By.id("billing:use_for_shipping_yes"));
		LoginHelper.login();
		ReceiptWindow.printReceipt();
	} 

}
