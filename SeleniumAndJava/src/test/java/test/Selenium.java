package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium {

	private WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Project Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test() {

		String URL = "https://www.amazon.in";
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
