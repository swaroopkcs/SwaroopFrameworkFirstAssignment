package com.swaroopAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaroopAssignment.BasePackage.TestBase;

public class RegisterPage extends TestBase{
	
	public RegisterPage() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(id ="customer.firstName")
	WebElement firstNameInput;
	
	@FindBy(id ="customer.lastName")
	WebElement lastNameInput;
	
	@FindBy(id ="customer.address.street")
	WebElement addressInput;
	
	@FindBy(id ="customer.address.city")
	WebElement cityInput;
	
	@FindBy(id ="customer.address.state")
	WebElement stateInput;
	
	@FindBy(id ="customer.address.zipCode")
	WebElement zipCodeInput;
	
	@FindBy(id ="customer.phoneNumber")
	WebElement phoneNumberInput;
	
	@FindBy(id ="customer.ssn")
	WebElement ssnInput;
	
	@FindBy(id ="customer.username")
	WebElement userNameInput;
	
	@FindBy(id ="customer.password")
	WebElement passwordInput;
	
	@FindBy(id ="repeatedPassword")
	WebElement confirmPasswordInput;
	
	@FindBy(xpath = "//table[@class = 'form2']//tbody//tr[13]//td[2]")
	WebElement registerButton;
	
	public void enterfirstName(String firstName) {
		firstNameInput.sendKeys(firstName);
	}
	
	public void enterlastName(String lastName) {
		lastNameInput.sendKeys(lastName);
	}
	
	public void enterAddress(String address) {
		addressInput.sendKeys(address);
	}
	
	public void enterCity(String cityName) {
		cityInput.sendKeys(cityName);
	}
	
	public void enterState(String stateName) {
		stateInput.sendKeys(stateName);
	}
	
	public void enterZipCode(String zipCode) {
		zipCodeInput.sendKeys(zipCode);
	}
	
	public void enterPhoneNumber(String phoneNumber) {
		phoneNumberInput.sendKeys(phoneNumber);
	}
	
	public void enterSsn(String ssNumber) {
		ssnInput.sendKeys(ssNumber);
	}
	
	public void enterUserName(String userName) {
		userNameInput.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void reEnterPassword(String confirmPassword) {
		confirmPasswordInput.sendKeys(confirmPassword);
	}
	
	public WelcomePage clickREgisterButton() {
		registerButton.submit();
		return new WelcomePage();
	}

}
