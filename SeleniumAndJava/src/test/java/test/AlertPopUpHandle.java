package test;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertPopUpHandle extends BaseClass{
	// Initialize Log4j logs
	Logger log = Logger.getLogger(AlertPopUpHandle.class);
	
	@Test
	public void alertDemo() {
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		log.info("Fetching rediff mail");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		driver.switchTo().alert().accept();							//we have to use alert API to handle alerts. Switch to alerts and either accept it(ok) or dismiss it(Cancel)
	
		
	//	JavascriptExecutor a = (JavascriptExecutor)driver;			
	//	a.executeScript("document.getElementById('//input[@title='Search']').value='text';");		//use JS like this if you don't want to use send-keys

	}
}
