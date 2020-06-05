package com.Ecommerce.website.TestClasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Ecommerce.website.HelperClasses.ButtonHelper;
import com.Ecommerce.website.HelperClasses.TextHelper;

public class HomePage extends LaunchFirefoxBrowser{

	@Test
	public void getHomePage(){
		
		String url ="http://live.demoguru99.com/index.php/";
		driver.get(url);
		driver.findElement(By.xpath("//nav[@id='nav']//a[text()='Mobile']")).click();
		Select sel = new Select(driver.findElement(By.xpath("//div[@class='sort-by']/select[@title='Sort By']")));
		sel.selectByIndex(0);
		String price =driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();		
		driver.findElement(By.xpath("//div[@class='category-products']//li[1]//span[text()='Add to Cart']")).click();
		String totalPrice = driver.findElement(By.xpath("//td[@class='a-right']/span")).getText();
		Assert.assertTrue(price.equals(totalPrice));
		driver.get("http://live.demoguru99.com/index.php/checkout/cart/");
		TextHelper.typeInTextBox(By.xpath("//td[@class='product-cart-actions']/input"),"1000");
		ButtonHelper.clickOnButton(By.xpath("//button[@class='button btn-update']"));
		String errMsg= driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
		Assert.assertEquals(errMsg, "* The maximum quantity allowed for purchase is 500.");
		driver.findElement(By.id("empty_cart_button")).click();
		driver.findElement(By.xpath("//div[@class='cart-empty']/p[2]/a")).click();
	    
		
		
	}
}
