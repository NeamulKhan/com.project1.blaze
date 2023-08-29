package com.project1.PageAction;

import org.testng.Assert;

import com.project1.PageLocator.ProductpageLocatorProject1;

import utilityProject1.BaseClassProject1;

public class ProductpageActionProject1 extends BaseClassProject1 {
	
	ProductpageLocatorProject1 productpageLocatorProject1 = new ProductpageLocatorProject1();
	
	public void clickaddtoCart() throws Exception {
		
		Thread.sleep(3000);
		
		productpageLocatorProject1.addtoCart.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
	}
	
	public void clickCartLink() throws Exception {
		
		Thread.sleep(5000);
		
		productpageLocatorProject1.cartLink.click();
		
	}
	
	public void verifyItemsAdded() throws Exception {
		
		Thread.sleep(5000);
		
		boolean verifyProductadded = productpageLocatorProject1.productpage.isDisplayed();
		
		Assert.assertTrue(verifyProductadded);
		
		
	}
}
