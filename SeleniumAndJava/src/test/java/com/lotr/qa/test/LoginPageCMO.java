package com.lotr.qa.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lotr.qa.base.TestBase;
import com.lotr.qa.pages.LoginPage;
import com.lotr.qa.pages.HomePage;

public class LoginPageCMO extends LoginPage {
	
	public static Logger log = Logger.getLogger(TestBase.class);
		
	@Test
	public void verifyLogin(){
	
		LoginPage loginpage = PageFactory.initElements(TestBase.driver, LoginPage.class);
		loginpage.login();
		
		HomePage homepage = PageFactory.initElements(TestBase.driver, HomePage.class);
		
	}
	


}
