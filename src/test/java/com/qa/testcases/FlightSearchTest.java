package com.qa.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.Page;
import com.qa.pages.actions.HomePage;
import com.qa.utilities.Utilities;

public class FlightSearchTest {

	@BeforeTest
	public void setUp() {
		Page.initConfiguraiton();
	}

	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void FlightsearchTest(Hashtable<String, String> data)  {
		// TODO Auto-generated method stub
		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as runmode set to N");
		}

		HomePage Hp = new HomePage();
		Hp.gotoFlights();
		Hp.bookAFlight(data.get("from"), data.get("to"), data.get("departing"), data.get("returning"),
				data.get("numOfAdults"), data.get("numOfChild"),data.get ("ageChild1"), data.get("ageChild2"));
		Page.quitBrowser();
	}
	
/*	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
		Page.quitBrowser();
		}
	}
*/
}
