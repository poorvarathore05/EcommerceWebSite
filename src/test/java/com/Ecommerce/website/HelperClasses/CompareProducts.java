package com.Ecommerce.website.HelperClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;

import com.Ecommerce.website.TestClasses.LaunchFirefoxBrowser;

public class CompareProducts extends LaunchFirefoxBrowser{
	
	public static void compare(){
		
		driver.get("http://live.demoguru99.com/index.php/mobile.html");
		driver.findElement(By.xpath("//div[@class='category-products']//li[1]//li//a[text()='Add to Compare']")).click();
		driver.findElement(By.xpath("//div[@class='category-products']//li[2]//li//a[text()='Add to Compare']")).click();
		driver.findElement(By.xpath("//span[text()='Compare']")).click();
		
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		TargetLocator target = driver.switchTo();
		target.window(list.get(1));
		driver.findElement(By.xpath("//tr[@class='add-to-row last even']/td[2]//button/span")).click();
		driver.findElement(By.xpath("//button[@class='button']")).click();
		target.window(list.get(0));
		driver.findElement(By.xpath("//ul[@class='checkout-types bottom']/li/button/span")).click();
		
		
	}
	

}
