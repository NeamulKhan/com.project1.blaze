package com.project1.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityProject1.BaseClassProject1;

public class ProductpageLocatorProject1 extends BaseClassProject1 {
	
	
	public ProductpageLocatorProject1() {
		
		PageFactory.initElements(driver, this);
		
			
	}

	@FindBy (xpath="//*[@id=\"tbodyid\"]/div[2]/div/a")
	
	public WebElement addtoCart;
	
	@FindBy (id="cartur")
	
	public WebElement cartLink;
	
	@FindBy (id="page-wrapper")
	
	public WebElement productpage;
	
}
