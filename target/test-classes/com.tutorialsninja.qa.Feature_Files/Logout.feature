@TutorialsNinjaLogout
Feature: Logout functionality of tutorialsninja app

Background: user logs into its personal account
Given User opens login page
And User enters email for logout "seleniumpanda@gmail.com"
And User enters password for logout "Selenium@123"
And User clicks on Login button for logout
And User is logged into its account for logout

	@LogoutButtonIsAvailable
	Scenario Outline: the logout button is displayed and available
	Then logout button is available
	
	@LogoutButtonIsFunctional
	Scenario Outline: the logout functionality is active
	When User clicks on logout button
	Then User is redirected to the logout page
