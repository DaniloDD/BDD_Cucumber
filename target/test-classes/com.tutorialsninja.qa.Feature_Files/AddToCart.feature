@TutorialsNinjaAddToCart
Feature: AddToCart Functionality of TutorialsNinja app

Background: User navigates to the homepage
Given User navigates to homepage
And User enters product for add to cart "HP"
And User clicks on search button for add to cart
And User is redirected to productpage
And User clicks On AddToCartButton
And User is redirected to productdetailspage
And User clicks on add to cart
And User clicks on Items button


	@AddToCartFromItemButton
	Scenario Outline: Verify add to cart funtionality from item button
	Then The valid product is displayed
	
	@AddToCartFromShoppingCartPage
	Scenario Outline: Verify add to cart functionality from shopping cart
	When User clicks on view cart button
	Then valid shopping cart product is displayed
