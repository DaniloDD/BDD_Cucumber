@TutorialsNinjaLogin
Feature: Login Functionality of TutorialsNinja Application

Background: i am giving common steps to run before all scenarios
Given User navigate to Login Page

	@ValidCredentials
	Scenario Outline: Login with Valid Credentials
	When User enters valid email <email>
	And User enters valid password <password>
	And User clicks on Login button
	Then User is redirected to Account Page
	Examples:
	|email									 |password		|	
	|seleniumpanda@gmail.com |Selenium@123|
	|seleniumpanda1@gmail.com |Selenium@123|
	|seleniumpanda2@gmail.com |Selenium@123|
	
	
	@InvalidCredentials
	Scenario: Login with Invalid Credentials
	When User enters invalid email "seleniumpandaaa@gmail.com"
	And User enters invalid password "Sele123@"
	And User clicks on Login button
	Then User gets warning message about credentials mismatch
	
	@ValidEmailInvalidPassword
	Scenario: Login with Valid Email and Invalid Password
	When User enters valid email "seleniumpanda@gmail.com"
	And User enters invalid password "Sele123@"
	And User clicks on Login button
	Then User gets warning message about credentials mismatch
	
	@InvalidEmailValidPassword
	Scenario: Login with Invalid Email and Valid Password
	When User enters invalid email "seleniumpandaaa@gmail.com"
	And User enters valid password "Selenium@123"
	And User clicks on Login button
	Then User gets warning message about credentials mismatch
	
	@ValidEmailEmptyPassword
	Scenario: Login with valid email and empty password
	When User enters valid email "seleniumpanda@gmail.com"
	And User clicks on Login button
	Then User gets warning message about credentials mismatch
	
	@EmptyEmailValidPassword
	Scenario: Login with empty email and valid password
	When User enters valid password "Selenium@123"
	And User clicks on Login button
	Then User gets warning message about credentials mismatch
	
	@EmptyMandatoryFilds
	Scenario: Login with empty fields
	When User clicks on Login button
	Then User gets warning message about credentials mismatch
