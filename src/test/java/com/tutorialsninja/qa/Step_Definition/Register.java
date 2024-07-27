package com.tutorialsninja.qa.Step_Definition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialsninja.qa.DriverFactory.DriverFactory;
import com.tutorialsninja.qa.Pages.AccountCreatedPage;
import com.tutorialsninja.qa.Pages.HomePage;
import com.tutorialsninja.qa.Pages.RegisterPage;
import com.tutorialsninja.qa.Utilities.Util;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	public WebDriver driver;
	public HomePage homepage;
	public RegisterPage registerpage;
	public AccountCreatedPage accountcreatedpage;

	@Given("User navigate to Registration Page")
	public void user_navigates_To_Register_Page() {
		driver = DriverFactory.getDriver();
		registerpage = new RegisterPage(driver);
		homepage = new HomePage(driver);
		homepage.clickOnMyAccountDropdown();
		homepage.clickOnRegisterButton();
	}

	@When("User enters valid First Name {string}")
	public void user_enters_valid_first_name(String name) {
		registerpage.enterFirstName(name);
	}
	
	@And("User enters valid Last Name {string}")
	public void user_enters_valid_last_name(String lastname) {
		registerpage.enterLastName(lastname);
	}
	
	@And("User enters valid time stamp email {string}")
	public void user_enters_valid_email(String email) {
		email = Util.emailWithDateTimeStamp();
		registerpage.enterEmail(email);
	}
	
	@And("User enters valid existing email {string}")
	public void user_enters_valid_existing_email(String string) {
		registerpage.enterEmail(string);
	}
	
	@And("User enters valid telephone {string}")
	public void user_enters_valid_telephone(String telephone) {
		registerpage.enterTelephone(telephone);
	}
	@And("User enters valid register password {string}")
	public void user_enters_valid_password(String password) {
		registerpage.enterPasswordTextBox(password);
	}
	
	@And("User enters valid confirmation password {string}")
	public void user_enters_valid_confirmation_password(String confirmPassword) {
		registerpage.enterConfirmPassword(confirmPassword);
	}
	
	@And("User clicks on privacy policy checkbox")
	public void user_clicks_on_privacy_policy_checkbox() {
		registerpage.clickOnPrivacyPolicyCheckbox();
	}
	
	@And("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		registerpage.clickOnContinueRegisterButton();
	}
	
	@Then("User is redirected to the Account Created page")
	public void user_is_redirected_to_account_created_page() {
		accountcreatedpage = new AccountCreatedPage(driver);
		Assert.assertTrue(accountcreatedpage.yourAccountHasBeenCreatedMainMessageIsDisplayed());
	}
	
	@And("User clicks on newletter checkbox")
	public void user_clicks_on_newletter_checkbox() {
		registerpage.clickOnNewsletterSubscriptionCheckbox();
	}
	
	@Then("User gets a warning message for the existing email")
	public void user_gets_a_warning_for_the_existing_email() {
		Assert.assertTrue(registerpage.emailAlreadyExistingWarningMessageIsDisplayed()); 
	}
	
	@Then("User gets a warning confirm password mismatch message")
	public void user_gets_a_warning_confirm_password_mismatch_message() {
		Assert.assertTrue(registerpage.passwordConfirmDoesNotMatchWarningMessageIsDisplayed()); 
	}
	
	@When("User clicks on continue button with empty fields")
	public void user_clicks_on_continue_button_with_empty_fields() {
		registerpage.clickOnContinueRegisterButton();
	}
	@Then("User gets expectedPrivacyPolicyWarningMessage")
	public void user_gets_expectedPrivacyPolicyWarningMessage() {
		Assert.assertTrue(registerpage.actualPrivacyPolicyWarningMessageIsDisplayed());
	}
	
	@And("User gets expectedFirstNameWarningMessage")
	public void user_gets_expectedFirstNameWarningMessage() {
		Assert.assertTrue(registerpage.actualFirstNameWarningMessageIsDisplayed());
	}
	
	@And("User gets expectedLastNameWarningMessage")
	public void user_gets_expectedLastNameWarningMessage() {
		Assert.assertTrue(registerpage.actualLastNameWarningMessageIsDisplayed());
	}
	
	@And("User gets expectedValidEmailWarningMessage")
	public void user_gets_expectedValidEmailWarningMessage() {
		Assert.assertTrue(registerpage.actualValidEmailWarningMessageIsDisplayed());
	}
	
	@And("User gets expectedTelephoneWarningMessage")
	public void user_gets_expectedTelephoneWarningMessage() {
		Assert.assertTrue(registerpage.actualTelephoneWarningMessageIsDisplayed());
	}
	
	@And("User gets expectedPasswordWarningMessage")
	public void user_gets_expectedPasswordWarningMessage() {
		Assert.assertTrue(registerpage.actualPasswordWarningMessageIsDisplayed());
	}
}
