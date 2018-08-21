package com.qa.pages.actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qa.base.Page;
import com.qa.pages.locators.HomePageObjects;

public class HomePage extends Page {
	
		public HomePageObjects hpobj;
		
	public HomePage() {
		this.hpobj = new HomePageObjects();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.hpobj);
		
	}

	public HomePage gotoFlights() {
		click(hpobj.flightTab);
		return this;
	}

	public void gotoHotels() {

		click(hpobj.hoteltab);
	
	}

	public void gotoHotelsFlights() {

		click(hpobj.flightHotelTab);
	}

	public void gotoCarHire() {

		click(hpobj.carHireTab);
	}

	public void gotoHolidayActivities() {
		click(hpobj.HolidayActivityTab);
	}

	public void gotoDiscover() {

	}
	
	
		
	
	public void bookAFlight(String from, String to, String departing, String returning, String numOfAdults,
			String numOfChild,String ageChild1,String ageChild2)
	
	{

		writing(hpobj.flyFrom,from);
		writing(hpobj.flyTo,to);
		writing(hpobj.departingDate,departing);
		writing(hpobj.returningDate,returning);
		writing(hpobj.Adults,numOfAdults);
		writing(hpobj.children,numOfChild);
		writing(hpobj.childAge1,ageChild1);
		writing(hpobj.childage2,ageChild2);
		click(hpobj.Search);
	}

}
