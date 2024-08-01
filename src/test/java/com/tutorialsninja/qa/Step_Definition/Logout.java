package com.tutorialsninja.qa.Step_Definition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialsninja.qa.DriverFactory.DriverFactory;
import com.tutorialsninja.qa.Pages.AccountLogoutPage;
import com.tutorialsninja.qa.Pages.AccountPage;
import com.tutorialsninja.qa.Pages.HomePage;
import com.tutorialsninja.qa.Pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {

	public WebDriver driver;
	public LoginPage loginpage;
	public AccountLogoutPage logoutpage;
	public AccountPage accountpage;
	public HomePage homepage;

	@Given("User opens login page")
	public void user_opens_login_page() {
		driver = DriverFactory.getDriver();
		homepage = new HomePage(driver);
		homepage.clickOnMyAccountDropdown();
		homepage.clickOnLoginButton();
		loginpage = new LoginPage(driver);
		Assert.assertTrue(loginpage.emailTextBoxIsDisplayed());
	}

	@And("User enters email for logout {string}")
	public void user_enters_email_for_logout(String email) {
		loginpage.insertEmail(email);
	}

	@And("User enters password for logout {string}")
	public void user_enters_password_for_logout(String password) {
		loginpage.insertPassword(password);
	}

	@And("User clicks on Login button for logout")
	public void user_clicks_on_login_button_for_logout() {
		loginpage.clickOnLoginButton();
	}

	@And("User is logged into its account for logout")
	public void user_is_logged_into_its_account_for_logout() {
		accountpage = new AccountPage(driver);
		Assert.assertTrue(accountpage.editAccountInfoLinkIsDisplayed());
	}

	@Then("logout button is available")
	public void logout_button_is_available() {
		homepage.logoutButtonIsDisplayed();
	}

	@When("User clicks on logout button")
	public void user_clicks_on_logout_button() {
		homepage.clickOnLogoutButton();
	}

	@Then("User is redirected to the logout page")
	public void user_is_redirected_to_logout_page() {
		logoutpage = new AccountLogoutPage(driver);
		Assert.assertTrue(logoutpage.accountLogoutMessageIsDisplayed());
	}

}
