package com.project1.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityProject1.BaseClassProject1;

public class HomePageLoacatorProject1 extends BaseClassProject1{
	
	public  HomePageLoacatorProject1() {
	
	PageFactory.initElements( driver, this);
	
	}
	
	@FindBy(id="signin2")
		
		public WebElement signupLink;
	
	@FindBy (id="sign-username")
	
	public WebElement username;
	
	@FindBy (id="sign-password")
	
	public WebElement password;
	
	@FindBy (xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	
	public WebElement signupButton;
	
	@FindBy (id="login2")
	
	public WebElement loginLink;

	
	@FindBy (id="loginusername")
	
	public WebElement enterusername;
	
	@FindBy (id="loginpassword")
	
	public WebElement enterpassword;
	
	@FindBy (xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	
	public WebElement loginButton;
	
	
	@FindBy (xpath="//*[@id=\"navbarExample\"]/ul/li[2]/a")
	
	public WebElement contactLink;
	
	
	@FindBy (id="recipient-email")
	
	public WebElement email;
	
	
	@FindBy (id="recipient-name")
	
	public WebElement name;
	
	
	@FindBy (id="message-text")
	
	public WebElement message;
	
	
	@FindBy (xpath ="//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
	
	public WebElement sendmsg;
	
	
}
