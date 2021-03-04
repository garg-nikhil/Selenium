package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Selenium {
	
	@Test
	public void test() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Project Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String URL = "https://www.amazon.in";
	driver.get(URL);
	driver.close();
}}
