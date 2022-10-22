
   
@Signup

<<<<<<< HEAD
Feature: Automation Test Step for shopper signup with mitId testing tool
=======
Feature: Automation Test Step for shopper signup with mitId testing tools
>>>>>>> 608f7e4220e4aa3666b4b6e8f61c1f04152b4e03


  
  Scenario Outline: signup with mitId testing tools
  
    Given Login Mit Id anyday
    And Click on Autofill button and after copy Identity Claim random text
    Then Click on create identity
    Given Open shopper link and click login with Mit Id
    Then Past Identity Claim in User Id text field and click on continue
    Then Switch Mit Id and scroll down and click on click on open simulator
    And Click conform
    Given Switch to Mit Id browser and copy CPR number
    And Switch to shopper browser and enter CPR number and click
    Then Enter your phone number and email id and more action for signup

  

