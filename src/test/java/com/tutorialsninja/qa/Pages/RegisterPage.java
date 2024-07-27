package com.tutorialsninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "input-firstname")
	private WebElement firstNameTextBox;
	
	@FindBy (id = "input-lastname")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "input-email")
	private WebElement emailTextBox;
	
	@FindBy (id = "input-telephone")
	private WebElement telephone;
	
	@FindBy (id = "input-password")
	private WebElement passwordTextBox;
	
	@FindBy (id = "input-confirm")
	private WebElement confirmPassword;
	
	@FindBy (xpath = "//input[@name='agree']")
	private WebElement policyCheckBox;
	
	@FindBy (css = "input.btn.btn-primary")
	private WebElement continueRegisterButton;
	
	@FindBy (xpath = "//input[@name='newsletter' and @value='1']")
	private WebElement newsletterSubscriptionCheckbox;
	
	@FindBy (xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement emailAlreadyExistWarningMessage;
	
	@FindBy (xpath = "//div[@class='text-danger']")
	private WebElement passwordConfirmDoesNotMatchWarningMessage;
	
	@FindBy (xpath = "//div[contains(text(), 'Warning: You must agree to the Privacy Policy!')]")
	private WebElement actualPrivacyPolicyWarningMessage;
	
	@FindBy (xpath = "//div[contains(text(), 'First Name must be between 1 and 32 characters!')]")
	private WebElement actualFirstNameWarningMessage;
	
	@FindBy (xpath = "//div[contains(text(), 'Last Name must be between 1 and 32 characters!')]")
	private WebElement actualLastNameWarningMessage;
	
	@FindBy (xpath = "//div[contains(text(), 'E-Mail Address does not appear to be valid!')]")
	private WebElement actualValidEmailWarningMessage;
	
	@FindBy (xpath = "//div[contains(text(), 'Telephone must be between 3 and 32 characters!')]")
	private WebElement actualTelephoneWarningMessage;
	
	@FindBy (xpath = "//div[contains(text(), 'Password must be between 4 and 20 characters!')]")
	private WebElement actualPasswordWarningMessage;
	
	public void enterFirstName(String name) {
		firstNameTextBox.sendKeys(name);
	}
	
	public void enterLastName(String lastname) {
		lastNameTextBox.sendKeys(lastname);
	}
	
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	public void enterTelephone(String telephone) {
		lastNameTextBox.sendKeys(telephone);
	}
	
	public void enterPasswordTextBox (String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPass) {
		confirmPassword.sendKeys(confirmPass);
	}
	
	public void clickOnPrivacyPolicyCheckbox() {
		policyCheckBox.click();;
	}
	public void clickOnContinueRegisterButton() {
		continueRegisterButton.click();;
	}
	
	public void clickOnNewsletterSubscriptionCheckbox () {
		newsletterSubscriptionCheckbox.click();
	}
	
	public String emailAlreadyExistWarningMessageGetText() {
		return emailAlreadyExistWarningMessage.getText();
	}
	
	public boolean emailAlreadyExistingWarningMessageIsDisplayed() {
		return emailAlreadyExistWarningMessage.isDisplayed();
	}
	
	public String passwordConfirmDoesNotMatchWarningMessageGetText() {
		return passwordConfirmDoesNotMatchWarningMessage.getText();
	}
	
	public boolean passwordConfirmDoesNotMatchWarningMessageIsDisplayed() {
		return passwordConfirmDoesNotMatchWarningMessage.isDisplayed();
	}
	
	public String actualPasswordWarningMessageGetText() {
		return actualPasswordWarningMessage.getText();
	}
	
	public boolean actualPasswordWarningMessageIsDisplayed() {
		return actualPasswordWarningMessage.isDisplayed();
	}
	
	public String actualTelephoneWarningMessageGetText() {
		return actualTelephoneWarningMessage.getText();
	}
	
	public boolean actualTelephoneWarningMessageIsDisplayed() {
		return actualTelephoneWarningMessage.isDisplayed();
	}
	
	public String actualValidEmailWarningMessageGetText() {
		return actualValidEmailWarningMessage.getText();
	}
	
	public boolean actualValidEmailWarningMessageIsDisplayed() {
		return actualValidEmailWarningMessage.isDisplayed();
	}
	
	public String actualLastNameWarningMessageGetText() {
		return actualLastNameWarningMessage.getText();
	}
	
	public boolean actualLastNameWarningMessageIsDisplayed() {
		return actualLastNameWarningMessage.isDisplayed();
	}
	
	public String actualFirstNameWarningMessageGetText() {
		return actualFirstNameWarningMessage.getText();
	}
	
	public boolean actualFirstNameWarningMessageIsDisplayed() {
		return actualFirstNameWarningMessage.isDisplayed();
	}
	
	public String actualPrivacyPolicyWarningMessageGetText() {
		return actualPrivacyPolicyWarningMessage.getText();
	}
	
	public boolean actualPrivacyPolicyWarningMessageIsDisplayed() {
		return actualPrivacyPolicyWarningMessage.isDisplayed();
	}
	

}
