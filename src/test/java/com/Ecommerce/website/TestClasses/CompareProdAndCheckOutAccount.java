package com.Ecommerce.website.TestClasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Ecommerce.website.HelperClasses.AlertHelper;
import com.Ecommerce.website.HelperClasses.ButtonHelper;
import com.Ecommerce.website.HelperClasses.CompareProducts;
import com.Ecommerce.website.HelperClasses.LoginHelper;
import com.Ecommerce.website.HelperClasses.ReceiptWindow;

public class CompareProdAndCheckOutAccount extends LaunchFirefoxBrowser {

	@Test
	public void compareProductsWithAccount() {

		CompareProducts.compare();
		driver.findElement(By.id("login-email")).sendKeys("xyz111@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='buttons-set']/button[@type='submit']")).click();
		AlertHelper.isElementPresent(driver);
		driver.switchTo().parentFrame();
		ButtonHelper.clickOnButton(By.xpath("//div[@id='billing-buttons-container']/button"));
        LoginHelper.checkout();

	}

}
