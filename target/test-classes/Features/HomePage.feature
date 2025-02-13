Feature: Home page modules

  Background: 
    Given User opens chrome browser
    When User enter orangehrm and login with valid credentials
    Then User navigated to home page dashboard module

  Scenario: Verify Dashboard Page is Displayed
    And verify user able to see Dashboard Page

  Scenario: validate Admin page is displayed from home page
    When User click on the Admin at sidebar
    Then User is navigated to Admin page

  Scenario: validate Recruitment page is displayed at home page
    When User click on the Recruitment at sidebar
    Then User is navigated to Recruitment page
