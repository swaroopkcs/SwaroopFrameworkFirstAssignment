package com.swaroopAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.swaroopAssignment.BasePackage.TestBase;

public class BillPayPage extends TestBase {
	public BillPayPage() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy (css = "input[name = 'payee.name']")
	WebElement payeeNameInput;
	
	@FindBy (css = "input[name = 'payee.address.street']")
	WebElement payeeAddressInput;
	
	@FindBy (css = "input[name = 'payee.address.city']")
	WebElement payeeCityInput;
	
	@FindBy (css = "input[name = 'payee.address.state']")
	WebElement payeeStateInput;
	
	@FindBy (css = "input[name = 'payee.address.zipCode']")
	WebElement payeeZipCodeInput;
	
	@FindBy (css = "input[name = 'payee.phoneNumber']")
	WebElement payeePhoneNumberInput;
	
	@FindBy (css = "input[name = 'payee.accountNumber']")
	WebElement payeeAccountNumberInput;
	
	@FindBy (css = "input[name = 'verifyAccount']")
	WebElement payeeVerifyAccountNumberInput;
	
	@FindBy (css = "input[name = 'amount']")
	WebElement payeeAmountInput;

	
	@FindBy (css = "[name = 'fromAccountId']")
	WebElement selectPayfromAccount;
	
	@FindBy (css = "input[type = 'submit']")
	WebElement submitButton;
	
	public void enterPayeeName(String payeeName) {
		payeeNameInput.sendKeys(payeeName);
	}
	
	public void enterPayeeAddress(String payeeAddress) {
		payeeAddressInput.sendKeys(payeeAddress);
	}
	
	public void enterPayeeCity(String payeeCity) {
		payeeCityInput.sendKeys(payeeCity);
	}
	
	public void enterPayeeState(String payeeState) {
		payeeStateInput.sendKeys(payeeState);
	}
	
	public void enterPayeeZipCode(String payeeZipCode) {
		payeeZipCodeInput.sendKeys(payeeZipCode);
	}
	
	public void enterPhoneNumber(String payeePhNumber) {
		payeePhoneNumberInput.sendKeys(payeePhNumber);
	}
	
	public void enterPayeeAccountNum(String payeeAccNum) {
		payeeAccountNumberInput.sendKeys(payeeAccNum);
	}
	
	public void enetrConfirmAccNum(String verifyPayeeAccNum) {
		payeeVerifyAccountNumberInput.sendKeys(verifyPayeeAccNum);
	}
	
	public void enterPaymentAmount(String paymentAmount) {
		payeeAmountInput.sendKeys(paymentAmount);
	}
	
	public void selectFromPaymentAccount() {
		Select select = new Select(selectPayfromAccount);
		select.selectByIndex(0);
	}
	
	public BillPaymentCompletePage clickSubmitButton() {
		submitButton.click();
		return new BillPaymentCompletePage();
	}


}
