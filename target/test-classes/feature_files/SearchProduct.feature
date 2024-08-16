@TutorialNinjaSearchProduct
Feature: SearchProduct functionality of TutorialsNinja Application


@ValidateSearchProduct
Scenario: User navigates to login page 
Given User navigates to home page
When User enters a valid product into search box 
And User clicks on search button
Then User should finds the right product in product page 
