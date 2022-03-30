package com.swaroopAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaroopAssignment.BasePackage.TestBase;

public class AccountOpenedPage extends TestBase{
	
	public AccountOpenedPage() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy (xpath = "//p//b[text() ='Your new account number:']")
	WebElement accountOpenedMessage;
	
	public String getTextFromAccountOpenedMessage() {
		return accountOpenedMessage.getText();
	}

}
