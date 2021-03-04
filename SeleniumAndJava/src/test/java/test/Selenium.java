package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Selenium {
	
	@Test
	public void test() {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Project Selenium\\chromedriver.exe");
	String URL = "www.amazon.in";
	driver.navigate().to(URL);
	
}}
