package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileUploadPopUp extends BaseClass{
	
	@Test
	public void handlePopUp() {
		
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Potato\\Downloads\\jh.txt");  //Don't click the upload button, instead use send keys to upload
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
