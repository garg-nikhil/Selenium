package com.lotr.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lotr.qa.base.TestBase;


public class LoginPage extends TestBase {
	
	public static Logger log = Logger.getLogger(TestBase.class);
		
	@FindBy(xpath="//input[@name='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement Login;
	
	public void getWebsite(){
		
		System.out.println("URL: "+getApplicationUrl());
		driver.get(""+getApplicationUrl());
		log.info("Launching the website: ");
	}
	
	public void submitDetails() {
		Email.sendKeys(""+getUserName());
		log.info("Entering Username");
		
		Password.sendKeys(""+getPassword());
		log.info("Entering password");
	}
	
	public void clickLogin() {
		Login.click();
		log.info("Clicking login");
	}	
	
}
