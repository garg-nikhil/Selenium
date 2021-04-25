package com.lotr.qa.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lotr.qa.base.TestBase;

public class DealsPage extends TestBase {
	
	@Test
	public void try1() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
	}

}
