package test;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ElementVisibilityTest extends BaseClass {

	Logger log = Logger.getLogger(ElementVisibilityTest.class);

	@Test
	public void demo() throws Exception {

		driver.get("https://gmail.com");
		log.info("Fetching gmail");

		// Checking if the button is displayed on GUI
		System.out.println(
				"Element status: " + driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed()); // true

		// Checking if the button is enabled on GUI i.e. its not greyed out/disabled
		System.out.println(
				"Element status: " + driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isEnabled()); // true

	}

	@Test
	public void isselecteddemo() throws Exception {

		driver.get("https://gmail.com");
		log.info("Fetching gmail");
		driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'For myself')]")).click();
		Thread.sleep(2000);

		// isselected() is only available for radio buttons, checkboxes and drop down
		boolean a = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("Status: " + a); // False

		// Lets click on the check box and then verify the status
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		boolean b = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("Status: " + b); // true
	}
}
