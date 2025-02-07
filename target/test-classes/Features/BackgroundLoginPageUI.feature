Feature: OrangeHrm Login page UI verification

  Background: 
    Given User opens the chrome browser
    When User is on orange hrm login page

  Scenario: Verify Orangehrm branding is seen on login page
    And wait for Orangehrm branding
    Then User should see Orangehrm branding on the login page

  Scenario: Verify login button seen on login page
    And wait for login button
    Then User should see login button on the login page

  Scenario: Verify forgot password link seen on login page
    And wait for forgot password link
    Then User should see forgot password link on the login page

  Scenario: Verify copyright symbol seen on login page
    And wait for forgot copyright symbol
    Then User should see copyright symbol on the login page
