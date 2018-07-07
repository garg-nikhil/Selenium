package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins {
	@Test
	public void tutorial1()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Downloads\\lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		String a= driver.getTitle();
		System.out.println("Welcome to Jenkins: "+a);
				
	}

}
