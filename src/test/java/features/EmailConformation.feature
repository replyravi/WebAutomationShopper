
@emailconform

Feature: Automation for mail conformation and verify the mail approved
  
Scenario: Mail conformation and verify the mail approved with all attachment in the mail


Given Login MitId
And Click on Autofill button then after copy Identity Claim random text
Then Click on identity
Given Open shopper link and click login with MitId
Then Past Identity Claim in User Id text field click continue
Then Switch Mit Id and scroll down and click on click then open simulator
And Click conform button
Given Switch to MitId browser and copy CPR number
And Switch to shopper browser and enter CPR number then click
Then Enter your phone number and email id then more action for signup
Then Navigate to tab and open mail account
Given Enter username and password then login
Then Click on conform email received by Anyday
Then Verify conform mail have attachment and then click on conform email
Then Wait for maximum ten minutes for approved mail
Then Received approved mail then click on it and verify mail have attachment
Then Switch to shopper tab and conform email conformation option not showing
  