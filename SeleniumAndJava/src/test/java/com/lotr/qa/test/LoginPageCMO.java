package com.lotr.qa.test;

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
	
/*	@Test
	public void verifyLogin(){
	
		
		loginpage.login();
		
		HomePage homepage = PageFactory.initElements(TestBase.driver, HomePage.class);
		
	}*/
	
	@Given("^Launch CRM website$")
	public void launchWebsite() {
		
		loginpage.getWebsite();
		
	}
	
	@When("^When Username and password is provided$")
	public void enterLoginDetails() {
		loginpage.submitDetails();
		
	}
	
	@Then("^user should be able to login successfully$")
	public void verifyLogin() {
		loginpage.clickLogin();
		
	}
}
