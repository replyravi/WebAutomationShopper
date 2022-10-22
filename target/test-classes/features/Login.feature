   
@Loginmitid

Feature: Automation Test Step for shopper Login automation with MitId testing tools


  
Scenario Outline: Login automation with MitId testing tools


  Given Open Mit Id testing tool Link kit
  When Click upper left side search box and type CPR number which you want to login
  Then Click on search box and copy create identity
  Given Switch new tab and open shopper link and paste create identity click on continue
  Then Switch to Mit Id tab and scroll to Open simulator and click it
  Then Switch to open simulator and click on conform it
  Then Switch to Mit Id and copy CPR number
  Then Switch shopper tab paste CPR number and click continue


  