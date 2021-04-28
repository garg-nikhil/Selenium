package com.lotr.qa.stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lotr.qa.base.TestBase;
import com.lotr.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.lotr.qa.pages.HomePage;

public class LoginPageCMO extends LoginPage {
	
	public static Logger log = Logger.getLogger(TestBase.class);
	LoginPage loginpage = PageFactory.initElements(TestBase.driver, LoginPage.class);
	HomePage homepage = PageFactory.initElements(TestBase.driver, HomePage.class);
	
	@Test(priority=0)
	@Given("^Launch CRM website$")
	public void launchWebsite() {
		
		loginpage.getWebsite();
		
	}
	
	@Test(priority=1)
	@When("^Username and password is provided$")
	public void enterLoginDetails() {
		loginpage.submitDetails();
		
	}
	
	@Test(priority=2)
	@Then("^user should be able to login successfully$")
	public void verifyLogin() {
		loginpage.clickLogin();
		
	}
}
