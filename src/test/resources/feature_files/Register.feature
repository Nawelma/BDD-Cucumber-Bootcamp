@TutorialsNinjaRegister
Feature: registration og Tutorialninja Application

@RegisterVaildcredentials
Scenario: Register With Valid credentials
Given User navigate to register page
When User enters mandatory fields information
|FirstName      | Rae        |
|LastName       | Rom        |
|Telephone      | 7272221111   |
|Password       | abcd1234  |
|ConfirmPassword| abcd1234  |
And User checks the newsletter box
And User checks agree box
And User Clicks on continue button 
Then User successfuly creates account 


