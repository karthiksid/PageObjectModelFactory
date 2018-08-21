package com.qa.rough;

import com.qa.base.Page;
import com.qa.pages.actions.SignInPage;

public class SignInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Page.initConfiguraiton();
		SignInPage signPage = Page.topNav.gotoSignIn();
		signPage.doLogin("karthiksiddani@gmail.com","karthikray");
		
	}

}
