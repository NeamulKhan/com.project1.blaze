Feature: this feature is for cart functionality

@Cart1

Scenario: verify user can successfully add item in cart

Given Launch "<URL>"
Then click samsung7 and click addtocart button
Then click cart link 
Then verify item added in the cart
 