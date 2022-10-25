Feature: Automation for merchant add user in different role


@merchantsadduserowner
Scenario: Add user for role owner

Given Navigate to merchant URL
And Enter username and password and click sign in
Then Click User section
And Click on create new user
Then Enter email and name
Then Enter phone number and select type owner
And Click on save
Then Navigate to open gmail and click on confirm email
Then Enter Password and click on sign in
Then Enter username and password and click signin

@merchantsadduserfinance
Scenario: Add user for role Finance
  
Given Navigate to merchant URL
And Enter username and password and click sign in
Then Click User section
And Click on create new user
Then Enter email and name
Then Enter phone number and select type finance
And Click on save
Then Navigate to open gmail and click on confirm email
Then Enter Password and click on sign in with finance
Then Enter username and password and click sign in close



@merchantsadduseroperator
Scenario: Add user for role operator
  
Given Navigate to merchant URL
And Enter username and password and click sign in
Then Click User section
And Click on create new user
Then Enter email and name
Then Enter phone number and select type operator
And Click on save
Then Navigate to open gmail and click on confirm email
Then Enter Password and click on sign in with operator
Then Enter username and password and click sign in closee

