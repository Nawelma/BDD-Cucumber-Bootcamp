@TutorialsNinja
Feature: Login Functionality of TutorialsNinja Application 

@ValidCredentials
Scenario: Login with Valid Credentials
Given User navigates to LoginPage
    When User enters valid email "rae.rom@gmail.com"
    And User enters valid password "abcd1234" 
    And User clicks on Login button
    Then User successfully login into AccountPage

    @InvalidCredentials
    Scenario: Login with Invalid Credentials
    Given User navigates to LoginPage
    When User enters invalid email "rae.rom@gmaill.com" 
    And User enters invalid password "abcd12345"
    And User clicks on Login button
    Then User gets warning message about credentials mismatch
    
    @ValidEmailInvalidPassword
    Scenario: Login with Valid email and Invalid password
    Given User navigates to LoginPage
    When User enters valid email "rae.rom@gmail.com" 
    And User enters invalid password "abcd12345"
    And User clicks on Login button
    Then User gets warning message about credentials mismatch
    
    @InvalidEmailValidPassword
    Scenario: Login with Invalid email and Valid password
    Given User navigates to LoginPage
    When User enters invalid email "rae.rom@gmaill.com" 
    And User enters valid password "abcd1234"
    And User clicks on Login button
    Then User gets warning message about credentials mismatch