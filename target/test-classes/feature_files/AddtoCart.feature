@TutorialsNinjaAddToCart
Feature: AddToCart 

@ValidateAddToCart

Scenario: validate Addtocart functionality
Given User searches the product in product page 
When User clicks on AddToCart button
And User clicks on ShoppingCart button
And User should find the right product in shoppingcart
Then User clicks on CheckOut button
