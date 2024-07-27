package com.tutorialsninja.qa.Step_Definition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialsninja.qa.DriverFactory.DriverFactory;
import com.tutorialsninja.qa.Pages.AccountPage;
import com.tutorialsninja.qa.Pages.HomePage;
import com.tutorialsninja.qa.Pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	public WebDriver driver;
	public HomePage homepage;
	public LoginPage loginpage;
	public AccountPage accountpage;

	@Given("User navigate to Login Page") 
	public void user_navigate_to_Login_Page() {
		driver = DriverFactory.getDriver();
		homepage = new HomePage(driver);
		homepage.clickOnMyAccountDropdown();
		loginpage = homepage.clickOnLoginButton();
	}
	
	@When("^User enters valid email (.+)$")
	public void user_enters_valid_email(String emailText) {
		loginpage.insertEmail(emailText);
	}
	
	@And("User enters valid password (.+)$")
	public void user_enters_valid_password(String validPasswordText) {
		loginpage.insertPassword(validPasswordText);;
	}
	
	@And("User clicks on Login button")
	public void user_clicks_on_Login_button() {
		loginpage.clickOnLoginButton();
	}
	
	@Then("User is redirected to Account Page")
	public void user_is_redirected_to_account_page() {
		accountpage = new AccountPage(driver);
		Assert.assertTrue(accountpage.editAccountInfoLinkIsDisplayed());
	}
	
	@When("User enters invalid email {string}")
	public void user_enters_invalid_email(String emailText) {
		loginpage.insertEmail(emailText);
	}
	
	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String passwordText) {
		loginpage.insertPassword(passwordText);;
	}
	
	@Then("User gets warning message about credentials mismatch") 
	public void user_gets_warning_message_about_credentials_mismatch() {
		Assert.assertTrue(loginpage.invalidEmailPasswordWarningIsDisplayed());
	}
}
