package com.swaroopAssignment.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaroopAssignment.BasePackage.TestBase;
import com.swaroopAssignment.Pages.RegisterPage;
import com.swaroopAssignment.Pages.WelcomePage;

public class WelcomePageTest extends TestBase {

	RegisterPage registerPage = new RegisterPage();
	WelcomePage welcomePage;

	@BeforeMethod
	public void setUp() {
		initialization();
		registerPage = new RegisterPage();
	}
	
	@Test
	public void verifyUserCanRegister() {
		registerPage.enterfirstName(prop.getProperty("firstName"));
		registerPage.enterlastName(prop.getProperty("lastName"));
		registerPage.enterAddress(prop.getProperty("Address"));
		registerPage.enterCity(prop.getProperty("City"));
		registerPage.enterState(prop.getProperty("State"));
		registerPage.enterZipCode(prop.getProperty("zipCode"));
		registerPage.enterPhoneNumber(prop.getProperty("phoneNumber"));
		registerPage.enterSsn(prop.getProperty("SSN"));
		registerPage.enterUserName(prop.getProperty("userName"));
		registerPage.enterPassword(prop.getProperty("password"));
		registerPage.reEnterPassword(prop.getProperty("confirmPassword"));
		welcomePage = registerPage.clickREgisterButton();
		
		String accountWelcomeMessage = welcomePage.getTextfromWelcomePage();
		
		Assert.assertEquals(accountWelcomeMessage, prop.getProperty("welcomeMessage"));
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
