package com.Ecommerce.website.HelperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Ecommerce.website.TestClasses.LaunchFirefoxBrowser;

public class TextHelper extends LaunchFirefoxBrowser {
	
	public static void typeInTextBox(By locator, String value){
		
		WebElement element = getElement(locator);
		element.sendKeys(value);
	}
	
	static Select select =null;
	public static void selectByIndex(String locator , int value){
        select = new Select(getElement(locator));
	    select.selectByIndex(value);
		
	}
    public static void selectByValue(String locator,String value){
    	select = new Select(getElement(locator));
    	select.selectByValue(value);
    }
    
    public static void selectByText(String locator,String text){
    	select = new Select(getElement(locator));
    	select.selectByVisibleText(text);
    	
    }
}
