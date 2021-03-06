package test;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseClass {

	public WebDriver driver;
	Logger log = Logger.getLogger(BaseClass.class);

	@BeforeTest
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Potato\\git\\Selenium\\SeleniumAndJava\\src\\test\\resources\\BrowseDrivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		log.info("Initializing chrome in incognito mode");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
