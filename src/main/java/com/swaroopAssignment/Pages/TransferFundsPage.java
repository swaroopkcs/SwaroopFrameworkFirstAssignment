package com.swaroopAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.swaroopAssignment.BasePackage.TestBase;

public class TransferFundsPage extends TestBase{
	
	public TransferFundsPage() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy (id = "amount")
	WebElement amountInput;
	
	@FindBy (id = "fromAccountId")
	WebElement selectFromAccount;
	
	@FindBy (id = "toAccountId")
	WebElement selectToAccount;
	
	@FindBy (css = "input.button")
	WebElement transferButton;
	
	public void enterAmount(String amountToBeTransferred) {
		amountInput.sendKeys(amountToBeTransferred);
	}
	
	public void selectFromAccount() {
		Select select = new Select(selectFromAccount);
		select.selectByIndex(0);
	}
	
	public void selectToAccount() {
		Select select = new Select(selectToAccount);
		select.selectByIndex(0);
	}
	
	public TransferCompletePage clickTransferButton() {
		transferButton.click();
		return new TransferCompletePage();
	}

}
