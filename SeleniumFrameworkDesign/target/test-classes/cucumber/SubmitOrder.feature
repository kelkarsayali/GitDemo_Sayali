
@tag
Feature: Purchase the order from Ecommerce Website 
  I want to use this template for my feature file

Background:  
	Given I landed on Ecommerce page
    
   @Regression 
  Scenario Outline: Positive test of submitting order
    Given Logged in  with username "<name>" and password "<password>"
    When I add product "<productName>" from cart
    And Checkout "<productName>" and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage

    Examples: 
      | name               | password |productName |
      | test2212@gmail.com | Test@123 |ZARA COAT 3 |