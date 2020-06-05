package com.Ecommerce.website.HelperClasses;

import org.openqa.selenium.By;

import com.Ecommerce.website.HelperClasses.AlertHelper;
import com.Ecommerce.website.HelperClasses.ButtonHelper;
import com.Ecommerce.website.HelperClasses.TextHelper;
import com.Ecommerce.website.TestClasses.LaunchFirefoxBrowser;

public class LoginHelper extends LaunchFirefoxBrowser{
	
	public static void login(){
		
		
		TextHelper.typeInTextBox(By.id("billing:street1"), "120 Street");
		TextHelper.typeInTextBox(By.id("billing:city"), "ohio");
		
	    TextHelper.selectByText("billing:region_id", "Arizona");
	    TextHelper.typeInTextBox(By.id("billing:postcode"), "945621");
	    TextHelper.selectByText("billing:country_id", "United States");
	    TextHelper.typeInTextBox(By.id("billing:telephone"), "7894455661");
	    ButtonHelper.clickOnButton(By.id("billing:use_for_shipping_yes"));
	    AlertHelper.isElementPresent(driver);
	    driver.switchTo().parentFrame();
	    ButtonHelper.clickOnButton(By.xpath("//div[@id='billing-buttons-container']/button"));
	    checkout();
	}
	
	    public static void checkout(){   
	    ButtonHelper.clickOnButton(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
	    ButtonHelper.clickOnButton(By.id("p_method_checkmo"));
	    AlertHelper.isElementPresent(driver);
		driver.switchTo().parentFrame();
	    ButtonHelper.clickOnButton(By.xpath("//div[@id='payment-buttons-container']/button"));
	    ButtonHelper.clickOnButton(By.xpath("//div[@id='review-buttons-container']/button"));
	}

}
