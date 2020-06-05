package com.Ecommerce.website.HelperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Ecommerce.website.TestClasses.LaunchFirefoxBrowser;

public class ButtonHelper extends LaunchFirefoxBrowser{

	public static void clickOnButton(By locator){
		
		WebElement element = getElement(locator);
		element.click();
	}
}
