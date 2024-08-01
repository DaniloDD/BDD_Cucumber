package com.tutorialsninja.qa.Step_Definition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialsninja.qa.DriverFactory.DriverFactory;
import com.tutorialsninja.qa.Pages.HomePage;
import com.tutorialsninja.qa.Pages.ProductDetailsPage;
import com.tutorialsninja.qa.Pages.ProductPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	public WebDriver driver;
	public ProductPage productpage;
	public HomePage homepage;
	public ProductDetailsPage productdetailspage;
	
	@Given("User navigates to Home Page")
	public void user_navigates_to_homepage() {
		try {
			driver = DriverFactory.getDriver();
			homepage = new HomePage(driver);
			productpage = new ProductPage(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		homepage.clickOnSeachButton();
	}
	
	@Then("User is redirected to the Product page")
	public void user_redirected_to_productpage() {
		Assert.assertTrue(productpage.emptySearchResultMessageIsDisplayed());
	}
	
	@When("User enters valid product {string}")
	public void user_enters_valid_product(String productname) {
		homepage.enterProductInTheSearchTextbox(productname);
	}
	
	/*
	@And("User clicks on search button")
	public void user_clicks_on_search_button() {
		homepage.clickOnSeachButton();
	}
	*/
	
	@Then("User gets valid products info display in product page")
	public void user_gets_valid_product_into_display_in_productpage() {
		Assert.assertTrue(productpage.validProductIsDisplayed());
	}
	
	@When("User enters invalid product {string}")
	public void user_enters_invalid_product(String invalidProduct) {
		homepage.enterProductInTheSearchTextbox(invalidProduct);
	}
	
	@Then("User gets invalid product warning message")
	public void user_gets_invalid_product_warningmessage() {
		Assert.assertTrue(productpage.invalidProductWarningMessageIsDisplayed());
	}
	
	@And("User clicks on found product details")
	public void user_clicks_on_found_product_details() {
		productpage.clickOnValidProductDetails();
	}
	
	@Then("User is redirected to its Details page")
	public void user_redirected_to_detailspage() {
		productdetailspage = new ProductDetailsPage(driver);
		Assert.assertTrue(productdetailspage.descriptionProductDetailsIsDisplayed());
	}

}
