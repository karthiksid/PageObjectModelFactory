package com.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signInPageLocator {
	
	
	@FindBy(css="#signin-loginid")
	public WebElement Username; 
	
	@FindBy(css="#signin-password")
	public WebElement password;
	
	@FindBy(css="#submitButton")
	public WebElement clickSignIn;

}
