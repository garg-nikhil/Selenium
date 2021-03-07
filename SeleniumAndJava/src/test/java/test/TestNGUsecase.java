package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGUsecase {
	
	// Initialize Log4j logs
	Logger log = Logger.getLogger(TestNGUsecase.class);
	WebDriver driver;
		
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
		
		WebElement flag = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		log.info("Checking google logo");
		boolean a = flag.isDisplayed();
		if(a==true)
		{
			System.out.println("Passed");
		}
		
	}
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title:-" + title);
		
	}
	
	@Test
	public void googleMailTest() {
		boolean flag = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isEnabled();
		//assert.assertTrue(true);
		if(flag==true)
		{
			System.out.println("Passed");
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("Closing the browser");
		
	}

}
