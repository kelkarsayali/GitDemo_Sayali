
@tag
Feature: Error Validations
  I want to use this template for my feature file



  @ErrorValidations
  Scenario Outline: Capuring error validation message
    Given I landed on Ecommerce page
    When Logged in  with username "<name>" and password "<password>"
    Then "Incorrect email password." message is displayed
   
    Examples: 
      | name              | password |
      |test2212@gmail.com |Test@4    |
