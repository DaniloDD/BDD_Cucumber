package com.tutorialsninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "input-email")
	private WebElement emailTextBox;
	
	@FindBy (id = "input-password")
	private WebElement passwordTextBox;
	
	@FindBy (css = "input.btn.btn-primary")
	private WebElement loginButton;
	
	@FindBy (xpath = "//*[@id='account-login']/div[1]")
	private WebElement invalidEmailPasswordWarning;
	
	public void insertEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	public boolean emailTextBoxIsDisplayed() {
		return emailTextBox.isDisplayed();
	}
	
	public void insertPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public boolean invalidEmailPasswordWarningIsDisplayed() {
		return invalidEmailPasswordWarning.isDisplayed();
	}

}
