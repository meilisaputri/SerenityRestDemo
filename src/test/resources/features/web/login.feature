@login

Feature: Login
  Background:
    Given user is on login page

  @positive
  Scenario: Success Login
    And user input username data
    And user input valid password data
    When user click login button
    Then user should be directed to homepage

  @negative
  Scenario: Failed Login
    And user input username data
    And user input invalid password data
    When user click login button
    Then user should be able to see warning message

  @negative
  Scenario: Failed Login 2
    And user input invalid username data
    And user input valid password data
    When user click login button
    Then user should be able to see warning message

  @positive
  Scenario: Login using google account
    When user click login with google
    Then user should be redirected to google page