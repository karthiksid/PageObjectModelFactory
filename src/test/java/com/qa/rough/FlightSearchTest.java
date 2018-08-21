package com.qa.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.Page;
import com.qa.pages.actions.HomePage;

public class FlightSearchTest {

	public static void main(String[] args){

		Page.initConfiguraiton();
		HomePage Hp = new HomePage();
		Hp.gotoFlights();
		Hp.bookAFlight("Delhi, India (DEL-Indira Gandhi Intl.)", "Hyderabad, India (HYD-Rajiv Gandhi Intl.)",
				"19/08/2018", "25/08/2018", "2", "2", "5", "8");
		
		
		Page.quitBrowser();

	}

}
