package com.swaroopAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaroopAssignment.BasePackage.TestBase;

public class BillPaymentCompletePage extends TestBase{
	
	public BillPaymentCompletePage() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy (css = "div [ng-show ='showResult']")
	WebElement successMessage;
	
	public String getbillPaymentSuccessMessage() {
		return successMessage.getText();
	}
	
	

}
