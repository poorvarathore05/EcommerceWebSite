package com.Ecommerce.website.HelperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Ecommerce.website.TestClasses.LaunchFirefoxBrowser;

public class AlertHelper extends LaunchFirefoxBrowser {
	
	public static boolean isElementPresent(WebDriver adriver){
	     try {
	    	 adriver.switchTo().frame(driver.findElement(By.id("flow_close_btn_iframe")));
	    	 ButtonHelper.clickOnButton(By.id("closeBtn"));
	    	 return true;
		} catch (Exception e) {
				} 
	      return false;
	}

}
