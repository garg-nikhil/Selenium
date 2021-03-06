package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertPopUpHandle extends BaseClass{
	
	
	@Test
	public void alertDemo() {
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		driver.switchTo().alert().accept();							//we have to use alert API to handle alerts. Switch to alerts and either accept it(ok) or dismiss it(Cancel)
	}
	

}
