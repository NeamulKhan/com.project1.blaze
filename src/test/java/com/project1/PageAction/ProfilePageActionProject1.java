package com.project1.PageAction;

import org.testng.Assert;

import com.project1.PageLocator.ProfilePageLocatorProject1;

import utilityProject1.BaseClassProject1;

public class ProfilePageActionProject1 extends BaseClassProject1 {
	
	ProfilePageLocatorProject1 profilePageLocatorProject1 = new ProfilePageLocatorProject1();
	
	
	public void verifyloginproject1() throws Exception {
		
		Thread.sleep(5000);
		
		boolean verifyLogin = profilePageLocatorProject1.profilePageProject1.isDisplayed();
		
		Assert.assertTrue(verifyLogin);
		
		
	}

}
