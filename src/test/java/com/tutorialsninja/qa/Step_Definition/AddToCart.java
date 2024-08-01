package com.tutorialsninja.qa.Step_Definition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialsninja.qa.DriverFactory.DriverFactory;
import com.tutorialsninja.qa.Pages.HomePage;
import com.tutorialsninja.qa.Pages.ProductDetailsPage;
import com.tutorialsninja.qa.Pages.ProductPage;
import com.tutorialsninja.qa.Pages.ShoppingCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	
	public WebDriver driver;
	public HomePage homepage;
	public ProductDetailsPage productdetailsPage;
	public ShoppingCartPage shoppingcartpage;
	public ProductPage productPage;
	
	@Given("User navigates to homepage")
	public void user_navigates_to_homepage() {
		driver = DriverFactory.getDriver();
		homepage = new HomePage(driver);	
		productPage = new ProductPage(driver);
		productdetailsPage = new ProductDetailsPage(driver);
	}
	
	@And("User enters product for add to cart {string}")
	public void user_enters_product_for_add_to_cart(String product) {
		homepage.enterProductInTheSearchTextbox(product);
	}
	
	@And("User clicks on search button for add to cart")
	public void user_clicks_search_button_for_add_to_cart() {
		homepage.clickOnSeachButton();
	}
	
	@And("User is redirected to productpage")
	public void user_is_redirected_to_productpage() {
		Assert.assertTrue(productPage.validProductIsDisplayed());
	}
	
	@And("User clicks On AddToCartButton")
	public void user_clicks_on_addtocartbutton() {
		productPage.clickOnAddToCartButton();
	}
	
	@And("User is redirected to productdetailspage")
	public void user_is_redirected_to_productdetailspage() {
		Assert.assertTrue(productdetailsPage.descriptionProductDetailsIsDisplayed());
	}
	
	@And("User clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		productdetailsPage.clickOnAddToCartButton();
	}
	
	@And("User clicks on Items button")
	public void user_clicks_on_item_button() {
		homepage.clickOnItemsButton();
	}
	
	@Then("The valid product is displayed")
	public void valid_prdocut_is_displayed() {
		Assert.assertTrue(productPage.validProductIsDisplayed());
	}
	
	@When("User clicks on view cart button") 
	public void user_clicks_on_view_cart_button() {
		homepage.clickOnViewCartButton();
	}
	
	@Then("valid shopping cart product is displayed")
	public void valid_shopping_cart_product_is_displayed() {
		shoppingcartpage = new ShoppingCartPage(driver);
		Assert.assertTrue(shoppingcartpage.validProductIsDisplayed());
	}
}
