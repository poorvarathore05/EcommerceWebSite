package com.Ecommerce.website.HelperClasses;


import org.openqa.selenium.By;

import com.Ecommerce.website.TestClasses.LaunchFirefoxBrowser;

public class ReceiptWindow  extends LaunchFirefoxBrowser{
	
	public static void printReceipt(){
		
		driver.findElement(By.xpath("//div[@class='col-main']/p[3]/a")).click();

	}

}
