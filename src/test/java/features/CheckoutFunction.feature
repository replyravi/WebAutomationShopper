
@Checkout

Feature: Test case for checkout function

Scenario Outline: checkout function with mock Web shop

Given Open admin page of Anyday
Then Enter username and password click Sign In
Then Navigate to left side and click on Merchants option
Then Scroll horizontal till Details column and click on eyes icon
Given Navigate to API tab and click regenerate API key button
Given Copy API key with click on copy icon
Then Logout Anyday admin page and switch windows to mock webshop form
Then Open mock webshop form past API key in Merchant API key text field
Given Fill total price more then three hundred price
Then Enter URL for navigate shopper page and click on submit button
Given Navigate to shopper page and follow login steps
Given verify all the payments instalment and check box click on Pay First Instalment