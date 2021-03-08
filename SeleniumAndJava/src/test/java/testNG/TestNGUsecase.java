package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGUsecase {
	
	// Initialize Log4j logs
	Logger log = Logger.getLogger(TestNGUsecase.class);
	WebDriver driver;
	
/*	Flow of execution will be = 
			@BeforeMethod
			@Test
			@AfterMethod
			@BeforeMethod									//BeforeMethod and AfterMethod always gets executed at individual testcase level
			@Test
			@AfterMethod
			@BeforeMethod
			@Test
			@AfterMethod
*/
		
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Potato\\git\\Selenium\\SeleniumAndJava\\src\\test\\resources\\BrowseDrivers\\chromedriver.exe");
		log.info("Setting browser properties");
		
		ChromeOptions options = new ChromeOptions();							//By using chrome options one can pass on multiple arguments to chrome, like launching website in incognito mode
		options.addArguments("--incognito");
		log.info("Launching browser in incognito mode");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		log.info("Maximizing the window");
		
		driver.get("https://www.google.com/");
		log.info("Fetching google");
	}
	
	@Test
	public void googleLogoTest() {
		
		boolean flag = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		log.info("Checking google logo");
		Assert.assertTrue(flag);
		
		
	}
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		log.info("Title of current webpage is:- "+title);
		Assert.assertEquals(title, "Google","Title is not matched");
		
	}
	
	@Test
	public void googleMailTest() {
		boolean flag = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isEnabled();
		log.info("In mailtest message");
		Assert.assertTrue(flag);										//This TC will only pass if flag's value comes out as true. If flag comes out as false then this tc will fail
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("Closing the browser");
		
	}

}
