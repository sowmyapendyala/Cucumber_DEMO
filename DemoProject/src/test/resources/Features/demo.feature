Feature: Check the login function

  Scenario: Verify login page with positive credentials
    Given Launch a web page in the browser
    Then Enter the username and password
    And Click on submit button
    Then Check if home page is displayed
