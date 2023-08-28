package com.project1.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityProject1.BaseClassProject1;

public class ProfilePageLocatorProject1 extends BaseClassProject1 {
	
	
	public ProfilePageLocatorProject1() {
		
		PageFactory.initElements(driver, this);
		
			}

	@FindBy (id="nameofuser")
	
	public WebElement profilePageProject1;
	
}
