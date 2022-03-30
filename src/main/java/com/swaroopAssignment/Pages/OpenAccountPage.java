package com.swaroopAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.swaroopAssignment.BasePackage.TestBase;

public class OpenAccountPage extends TestBase {

	public OpenAccountPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "type")
	WebElement typeOfAccountDropDown;

	@FindBy(id = "fromAccountId")
	WebElement transferFromAccountDropDown;

	@FindBy(css = "div [type = 'submit']")
	WebElement openNewAccountButton;
	
	
	public void selectAccountType() {
		Select select = new Select(typeOfAccountDropDown);
		select.selectByValue("1");
	}

	public void selectTransferFromAccount() {
		Select select = new Select(transferFromAccountDropDown);
		select.selectByIndex(0);
	}
	
	public AccountOpenedPage clickOpenAccountButton() {
		openNewAccountButton.submit();
		return new AccountOpenedPage();
	}
	
	

}
