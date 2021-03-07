package test;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;



public class BaseClass {

	public WebDriver driver;
	// Initialize Log4j logs
	Logger log = Logger.getLogger(BaseClass.class);

	@BeforeMethod
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Potato\\git\\Selenium\\SeleniumAndJava\\src\\test\\resources\\BrowseDrivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		log.info("Initializing chrome in incognito mode");
	}

	@AfterMethod
	public void afterTest() {
		driver.quit();
	}
}
