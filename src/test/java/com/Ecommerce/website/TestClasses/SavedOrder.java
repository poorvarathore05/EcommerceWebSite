package com.Ecommerce.website.TestClasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Ecommerce.website.HelperClasses.AlertHelper;
import com.Ecommerce.website.HelperClasses.ButtonHelper;
import com.Ecommerce.website.HelperClasses.LoginHelper;
import com.Ecommerce.website.HelperClasses.TextHelper;

public class SavedOrder  extends LaunchFirefoxBrowser{

	
	@Test
	public void orderFromCart(){
		
		driver.get("http://live.demoguru99.com/index.php/");
		ButtonHelper.clickOnButton(By.xpath("//div[@class='account-cart-wrapper']/a"));
		ButtonHelper.clickOnButton(By.xpath("//div[@id='header-account']//li[6]"));
		TextHelper.typeInTextBox(By.name("login[username]"), "xyz111@gmail.com");
		TextHelper.typeInTextBox(By.id("pass"),"123456");
		ButtonHelper.clickOnButton(By.id("send2"));
		driver.findElement(By.xpath("//tr[@class='first odd']/td[6]/span/a[1]")).click();
		driver.findElement(By.xpath("//a[@class='link-reorder']")).click();
		
		driver.findElement(By.xpath("//ul[@class='checkout-types bottom']/li/button/span")).click();
		AlertHelper.isElementPresent(driver);
		driver.switchTo().parentFrame();
		ButtonHelper.clickOnButton(By.xpath("//div[@id='billing-buttons-container']/button"));
        LoginHelper.checkout();
	}
}
