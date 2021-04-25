package com.lotr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lotr.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement SignUp;

}
