package com.swaroopAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaroopAssignment.BasePackage.TestBase;

public class TransferCompletePage extends TestBase{
	
	public TransferCompletePage() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(css = ".title")
	WebElement transferCompleteSuccessMessage;
	
	public String getTextfromTransferCompleteMessage() {
		return transferCompleteSuccessMessage.getText();
	}

}
