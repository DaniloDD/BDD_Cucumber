@TutorialsNinjaRegister
Feature: Register Functionality of TutorialsNinja app

Background: common step to run before each scenario:
Given User navigate to Registration Page

	@ValidMandatoryDetails
	Scenario Outline: Registration with all the mandatory fields
	When User enters valid First Name "Selenium"
	And User enters valid Last Name "Panda"
	And User enters valid time stamp email "seleniumpandaqaq@gmail.com"
	And User enters valid telephone "453534534"
	And User enters valid register password "Selenium@123"
	And User enters valid confirmation password "Selenium@123"
	And User clicks on privacy policy checkbox
	And User clicks on continue button
	Then User is redirected to the Account Created page
	
	@NewsletterSubscription
	Scenario Outline: Registration with all the mandatory details and newsletter subscription
	When User enters valid First Name "Selenium"
	And User enters valid Last Name "Panda"
	And User enters valid time stamp email "seleniummmpanda@gmail.com"
	And User enters valid telephone "23423423"
	And User enters valid register password "Selenium@123"
	And User enters valid confirmation password "Selenium"
	And User clicks on privacy policy checkbox
	And User clicks on newletter checkbox
	And User clicks on continue button
	Then User is redirected to the Account Created page
	
	@ExistingEmail
	Scenario Outline: Registration with valid mandatory details but existing email
	When User enters valid First Name "Selenium"
	And User enters valid Last Name "Panda"
	And User enters valid existing email "seleniumpanda@gmail.com"
	And User enters valid telephone "453534534"
	And User enters valid register password "Selenium@123"
	And User enters valid confirmation password "Selenium@123"
	And User clicks on privacy policy checkbox
	And User clicks on continue button
	Then User gets a warning message for the existing email
	
	@InvalidConfirmPassword
	Scenario Outline: Registration with valid mandatory details but not matching confirm password
	When User enters valid First Name "Selenium"
	And User enters valid Last Name "Panda"
	And User enters valid time stamp email "seleniumpandaqaq2q@gmail.com"
	And User enters valid telephone "453534534"
	And User enters valid register password "Selenium@123"
	And User enters valid confirmation password "Sele"
	And User clicks on privacy policy checkbox
	And User clicks on continue button
	Then User gets a warning confirm password mismatch message
	
	@EmptyFields
	Scenario Outline: Registration with empty fields
	When User clicks on continue button with empty fields
	Then User gets expectedPrivacyPolicyWarningMessage
	And User gets expectedFirstNameWarningMessage
	And User gets expectedLastNameWarningMessage
	And User gets expectedValidEmailWarningMessage
	And User gets expectedTelephoneWarningMessage
	And User gets expectedPasswordWarningMessage

