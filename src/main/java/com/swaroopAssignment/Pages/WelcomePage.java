package com.swaroopAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaroopAssignment.BasePackage.TestBase;

public class WelcomePage extends TestBase{
	
	public WelcomePage() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(css =".title")
	WebElement welcomeUserText;
	
	@FindBy(css ="div#leftPanel>ul>li:nth-of-type(1)")
	WebElement openNewAccountButton;
	
	@FindBy(css ="div#leftPanel>ul>li:nth-of-type(3)")
	WebElement transferFundsButton;
	
	@FindBy(css ="div#leftPanel>ul>li:nth-of-type(4)")
	WebElement billPaymentButton;
	
	public String getTextfromWelcomePage() {
		return welcomeUserText.getText();
	}
	
	public OpenAccountPage clickOpenNewAccountButton() {
		openNewAccountButton.click();
		return new OpenAccountPage();
	}
	
	public TransferFundsPage clickTransferFundsButton() {
		transferFundsButton.click();
		return new TransferFundsPage();		
	}
	
	public BillPayPage clickBillPaymentButton() {
		billPaymentButton.click();
		return new BillPayPage();		
	}
}
