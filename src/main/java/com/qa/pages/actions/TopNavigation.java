package com.qa.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qa.base.Page;
import com.qa.pages.locators.TopNavigationObjects;

public class TopNavigation {

	public TopNavigationObjects topNavObj;

	public TopNavigation(WebDriver driver) {

		this.topNavObj = new TopNavigationObjects();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10); 
		PageFactory.initElements(factory,this.topNavObj);
	}

	public SignInPage gotoSignIn() {

		Page.click(topNavObj.Account);
		Page.click(topNavObj.signin);
		return new SignInPage();
	}

	public void gotoCreateAccount() {

	}

	public void gotoMyLists() {

	}

	public void gotoManageTrips() {

	}

	public void gotoSupport() {

	}

	public void gotoHome() {

	}

	public void gotoFlights() {

	}

}
