package com.project1.PageAction;

import com.project1.PageLocator.HomePageLoacatorProject1;
import com.project1.PageLocator.ProfilePageLocatorProject1;

import utilityProject1.BaseClassProject1;

public class HomePageActionProject1 extends BaseClassProject1 {
	
	HomePageLoacatorProject1 homePageLoacatorProject1 = new HomePageLoacatorProject1();
	ProfilePageLocatorProject1 profilePageLocatorProject1= new ProfilePageLocatorProject1();
	
	public void clicksignupLink() {
		
		homePageLoacatorProject1.signupLink.click();
		
	}
	
	public void entercredentials(String x, String y) throws Exception {
		
		Thread.sleep(5000);
		
		homePageLoacatorProject1.username.sendKeys(x);
		Thread.sleep(2000);
		homePageLoacatorProject1.password.sendKeys(y);
		Thread.sleep(2000);
		homePageLoacatorProject1.signupButton.click();
		
		
	}
	
	public void clickloginLink() {
		
		homePageLoacatorProject1.loginLink.click();
		
	}
	
	
	public void logincredentials (String x,String y) throws InterruptedException {
		
		Thread.sleep(5000);
		
		homePageLoacatorProject1.enterusername.sendKeys(x);
		Thread.sleep(2000);
		homePageLoacatorProject1.enterpassword.sendKeys(y);
		Thread.sleep(2000);
		homePageLoacatorProject1.loginButton.click();
	}
	
	

}
