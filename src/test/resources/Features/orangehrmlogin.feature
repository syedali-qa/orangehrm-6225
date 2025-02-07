Feature: Test the login functionality of orange hrm

Scenario: Test login with valid credentials
Given User navigate to orangehrm applcation
When User enter valid id and pwd
And click on login 
Then User should be navigated to home page
