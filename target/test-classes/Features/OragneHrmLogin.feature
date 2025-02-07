Feature: Test the login functionality of the orange hrm app

  Scenario: Validate login functionality with valid credentials
    Given User is navigated to orange hrm login page
    When User enter valid id and pwd
    And click on login
    Then Verify user should be navigated to orange hrm home page
