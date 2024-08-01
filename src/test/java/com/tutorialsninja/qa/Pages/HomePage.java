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
	
	@FindBy(name = "search")
	private WebElement searchTextbox;
	
	@FindBy (css= "button.btn.btn-default.btn-lg")
	private WebElement searchButton;
	
	@FindBy (xpath = "//span[text() = 'Shopping Cart']")
	private WebElement shoppingCartButton;
	
	@FindBy (id = "cart-total")
	private WebElement itemsButton;
	
	@FindBy (linkText= "View Cart")
	private WebElement viewCartButton;
	
	@FindBy (linkText = "Checkout")
	private WebElement checkoutButton;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutButton;
	
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
	
	public Boolean searchTextboxIsDisplayedAndEnabled() {
		return (searchTextbox.isDisplayed() && searchTextbox.isEnabled());
	}
	
	public void clickOnSeachButton() {
		searchButton.click();
	}
	
	public void enterProductInTheSearchTextbox(String product) {
		searchTextbox.sendKeys(product);
	}
	
	public Boolean shoppingCartButtonIsDisplayed() {
		return shoppingCartButton.isDisplayed();
	}
	
	public void clickOnShoppingCartButton() {
		shoppingCartButton.click();
	}
	
	public void clickOnItemsButton() {
		itemsButton.click();
	}
	
	public void clickOnViewCartButton() {
		viewCartButton.click();
	}
	
	public Boolean checkoutButtonIsDisplayed() {
		return checkoutButton.isDisplayed();
	}
	
	public void clickOnCheckoutButton() {
		checkoutButton.click();
	}
	
	public void clickOnLogoutButton() {
		logoutButton.click();
	}
	
	public Boolean logoutButtonIsDisplayed() {
		return logoutButton.isDisplayed();
	}
}
