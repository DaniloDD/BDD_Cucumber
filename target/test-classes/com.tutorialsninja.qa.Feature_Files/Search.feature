@TutorialsNinjaSearchProduct
Feature: Search Product Functionality of TutorialsNinja

Background: common steps to run before each scenario
Given User navigates to Home Page

	@SearchButtonFunctional
	Scenario Outline: Search button is available and functional
	When User clicks on search button
	Then User is redirected to the Product page 
	
	@ValidProduct
	Scenario Outline: Search with valid product
	When User enters valid product "HP"
	And User clicks on search button
	Then User gets valid products info display in product page
	
	
	@InvalidProduct
	Scenario Outline: Search with Invalid product
	When User enters invalid product "DELL"
	And User clicks on search button
	Then User gets invalid product warning message
	
	@ValidProductDatailsPage
	Scenario Outline: Search the valid product and enter its Details Page
	When User enters valid product "HP"
	And User clicks on search button
	And User clicks on found product details
	Then User is redirected to its Details page