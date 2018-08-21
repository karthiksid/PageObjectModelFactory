 package com.qa.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qa.base.Page;
import com.qa.pages.locators.signInPageLocator;

public class SignInPage extends Page{
	
	public signInPageLocator sipgloc;
	
public SignInPage() {
	this.sipgloc = new signInPageLocator();
	AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
	PageFactory.initElements(factory, this.sipgloc);

}

	public void doLogin(String userName, String password){
		
		writing(sipgloc.Username,userName);
		writing(sipgloc.password,password);
		click(sipgloc.clickSignIn);
		
	}
}
