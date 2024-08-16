@TutotrialNinjaLogout
Feature: logout functionality of tutorialsNinja Application


@validateLogout
Scenario: User Logout successfully
Given User currently logged in 
When User clicks on the logout button
And User receives message about Account logout
Then User clicks on countinue button to navigate to homepage