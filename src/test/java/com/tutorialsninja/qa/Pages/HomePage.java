package com.tutorialsninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "My Account")
	private WebElement myAccountDropdown;
	
	@FindBy (linkText = "Login")
	private WebElement loginButton;
	
	@FindBy(linkText = "Register")
	private WebElement registerButton;
	
	public void clickOnMyAccountDropdown() {
		myAccountDropdown.click();
	}
	
	public LoginPage clickOnLoginButton() {
		loginButton.click();
		return new LoginPage(driver);
	}
	
	public RegisterPage clickOnRegisterButton() {
		registerButton.click();
		return new RegisterPage(driver);
	}
}
