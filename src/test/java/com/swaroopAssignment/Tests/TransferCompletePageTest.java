package com.swaroopAssignment.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaroopAssignment.BasePackage.TestBase;
import com.swaroopAssignment.Pages.AccountOpenedPage;
import com.swaroopAssignment.Pages.OpenAccountPage;
import com.swaroopAssignment.Pages.RegisterPage;
import com.swaroopAssignment.Pages.TransferCompletePage;
import com.swaroopAssignment.Pages.TransferFundsPage;
import com.swaroopAssignment.Pages.WelcomePage;

public class TransferCompletePageTest extends TestBase{
	
	RegisterPage registerPage;
	WelcomePage welcomePage;
	TransferFundsPage transferFundsPage;
	TransferCompletePage transferCompletePage;
	OpenAccountPage openAccountPage;
	AccountOpenedPage accountOpenedPage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		registerPage = new RegisterPage();
	}
	
	@Test
	public void verifyUSerCanOpenNewAccount() {
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
//		openAccountPage = welcomePage.clickOpenNewAccountButton();
//		openAccountPage.selectAccountType();
//		openAccountPage.selectTransferFromAccount();
//		accountOpenedPage = openAccountPage.clickOpenAccountButton();
		transferFundsPage = welcomePage.clickTransferFundsButton();
		transferFundsPage.enterAmount(prop.getProperty("amountTransferred"));
		transferFundsPage.selectFromAccount();
		transferFundsPage.selectToAccount();
		transferCompletePage = transferFundsPage.clickTransferButton();
		String successMessageForTransfer = transferCompletePage.getTextfromTransferCompleteMessage();
		Assert.assertEquals(successMessageForTransfer, prop.getProperty("TransferSuccessMessage"));
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
