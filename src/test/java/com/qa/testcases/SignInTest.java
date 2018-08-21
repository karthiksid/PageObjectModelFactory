package com.qa.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Page;
import com.qa.pages.actions.SignInPage;
import com.qa.utilities.Utilities;

public class SignInTest {

	
	
	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void signInTest (Hashtable<String , String> data) {
		// TODO Auto-generated method stub
		
		if(data.get("runmode").equalsIgnoreCase("N")){
			
			throw new SkipException("Skipping the test as runmode set to N");
		}
		
		Page.initConfiguraiton();
			
	
		SignInPage signPage = Page.topNav.gotoSignIn();
		signPage.doLogin(data.get("username"),data.get("password"));
		
		
		// hard-assertion
		//assertTrue(false);
				
		/*SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertTrue(false);
		softAssertion.assertAll();*/	
			}
	
	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
		Page.quitBrowser();
		
	}
	} 
	}


