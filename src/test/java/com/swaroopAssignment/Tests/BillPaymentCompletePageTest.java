package com.swaroopAssignment.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaroopAssignment.BasePackage.TestBase;
import com.swaroopAssignment.Pages.BillPayPage;
import com.swaroopAssignment.Pages.BillPaymentCompletePage;
import com.swaroopAssignment.Pages.RegisterPage;
import com.swaroopAssignment.Pages.WelcomePage;

public class BillPaymentCompletePageTest extends TestBase{
	
	RegisterPage registerPage = new RegisterPage();
	WelcomePage welcomePage;
	BillPayPage billPayPage;
	BillPaymentCompletePage billPaymentCompletePage;

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
		billPayPage = welcomePage.clickBillPaymentButton();
		billPayPage.enterPayeeName(prop.getProperty("PayeeName"));
		billPayPage.enterPayeeAddress(prop.getProperty("PayeeAddress"));
		billPayPage.enterPayeeCity(prop.getProperty("payeeCity"));
		billPayPage.enterPayeeState(prop.getProperty("payeeState"));
		billPayPage.enterPayeeZipCode(prop.getProperty("payeeZipCode"));
		billPayPage.enterPhoneNumber(prop.getProperty("payeePhone"));
		billPayPage.enterPayeeAccountNum(prop.getProperty("payeeAccount"));
		billPayPage.enetrConfirmAccNum(prop.getProperty("verifyAccount"));
		billPayPage.enterPaymentAmount(prop.getProperty("paymentAmount"));
		billPayPage.selectFromPaymentAccount();
		billPaymentCompletePage = billPayPage.clickSubmitButton();
		String succsessMessageforBillPay =  billPaymentCompletePage.getbillPaymentSuccessMessage();
		Assert.assertEquals(succsessMessageforBillPay, prop.getProperty("successMessageBill"));
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
