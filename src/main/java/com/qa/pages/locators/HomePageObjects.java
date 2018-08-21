package com.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {

	@FindBy(css = "#tab-flight-tab-hp")
	public WebElement flightTab;

	@FindBy(css = "#tab-hotel-tab-hp")
	public WebElement hoteltab;

	@FindBy(css = "#tab-package-tab-hp")
	public WebElement flightHotelTab;

	@FindBy(css = "#tab-car-tab-hp")
	public WebElement carHireTab;

	@FindBy(css = "#tab-activity-tab-hp")
	public WebElement HolidayActivityTab;

	@FindBy(css = "#tab-openSearch-tab-hp")
	public WebElement discoverTab;

	@FindBy(css = "#flight-origin-hp-flight")
	public WebElement flyFrom;

	@FindBy(css = "#flight-destination-hp-flight")
	public WebElement flyTo;

	@FindBy(css = "#flight-departing-hp-flight")
	public WebElement departingDate;

	@FindBy(css = "#flight-returning-hp-flight")
	public WebElement returningDate;

	@FindBy(css = "#flight-adults-hp-flight")
	public WebElement Adults;

	@FindBy(css = "#flight-children-hp-flight")
	public WebElement children;

	@FindBy(css = "#gcw-flights-form-hp-flight > div.cols-nested.ab25184-submit > label > button")
	public WebElement Search;

	@FindBy(css = "#flight-age-select-1-hp-flight")
	public WebElement childAge1;

	/*
	@FindAll({
	@FindBy(css = "#flight-age-select-2-hp-flight"),
	@FindBy(xpath="//*[@id=\"hotel-1-age-select-2-hp-hotel\"]") 
	})
*/	
	@FindBy(css = "#flight-age-select-2-hp-flight")
	public WebElement childage2;
}
