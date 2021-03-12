package com.lotr.qa.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lotr.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void demo() {
		driver.get("https://www.google.com/");
	}

}
