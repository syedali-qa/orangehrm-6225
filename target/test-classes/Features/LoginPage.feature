Feature: To test the login functionality

  Scenario Outline: To test the login functionality with valid credentials
    Given User opens chrome
    And navigates to orange hrm app
    When User enter valid <id> and <pwd>
    And User click on login
    Then User should be navigated to home page

    Examples: 
      | id    | pwd      |
      | Admin | admin123 |
      | Ali   | ali123   |
