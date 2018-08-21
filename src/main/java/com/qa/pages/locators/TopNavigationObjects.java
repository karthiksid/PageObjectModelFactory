package com.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationObjects {
	
	@FindBy(css="#header-account-menu")
	public WebElement Account;

	@FindBy(css="#account-signin")
	public WebElement signin;

	
}
