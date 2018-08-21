package com.qa.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.actions.TopNavigation;
import com.qa.utilities.ExcelReader;
import com.qa.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Page {

	public static WebDriver driver;

	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") +"\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static TopNavigation topNav;
	
	public static void initConfiguraiton() {

		if (constants.browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\Browser_Drivers\\chromedriver.exe");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			/*DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);*/
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			driver = new ChromeDriver(options);
							
			driver.manage().deleteAllCookies();
			log.debug("launching chrome browser");

		} else if (constants.browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\Browser_Drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
			log.debug("launching firfox browser");
		} else if (constants.browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\Browser_Drivers\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			log.debug("launching IE browser");
		}
		driver.get(constants.siteUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(constants.implicitWait,TimeUnit.SECONDS);
		
//		WebDriverWait wait = new WebDriverWait(driver, 20L);
		topNav = new TopNavigation(driver);
	}

	
	public static void click(WebElement element) {
		element.click();
		log.debug("Clicking on an Element : " + element);
	test.log(LogStatus.INFO, "Clicking on : " + element);
	}

	public static void writing(WebElement element, String value) {

		element.sendKeys(value);
		
		log.debug("Typing in an Element : " + element + " entered value as : " + value);

		test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " + value);

	}
	
	public static void quitBrowser() {

		driver.quit();
	}

}
