
@Highercredit

Feature: After signup automation apply for higher credit if user equal and more then 21 Age


  
  Scenario Outline: signup automation apply for higher credit
  
    Given Login Mit id
    And Click on Autofill button and after copy Identity claim random text
    Then Click on create Identity
    Given Open shopper link and click login with Mit id
    Then Past Identity Claim in User Id text field and click on Continue
    Then Switch Mit Id and scroll down and click on click on open Simulator
    And Click Conform
    Given Switch to Mit Id browser and copy CPR Number
    And Switch to shopper browser and enter CPR number and Click
    Then Enter your phone number and email id and more action for Signup
    Given Click on Apply Now for higher credit limit
    Then Click on Accept payment information
    Then Click on connect to my bank option
    Given Click on Continue bank option
    Then Click on demo bank option
    Then enter CPR number and mobile code in the text field and click on continue
    Given Click on Checking Account and click continue
    Then Click on continue

  