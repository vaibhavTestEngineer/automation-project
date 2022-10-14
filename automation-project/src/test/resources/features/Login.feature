@Login @Customer
Feature: Login feature
  @SC01 @Sanity @Manager
  Scenario: Login with valid credentials 1
    Given I Open application url in browser
    When Enter I enter 'test@ttt', 1234 and click on login
    Then Login should be successful
  @SC02
  Scenario: Login with valid credentials 2
    Given I Open application url in browser
    When Enter I enter username, password and click on login
    Then Login should be successful
  @SC03
  Scenario: Login with valid credentials 3
    Given I Open application url in browser
    When Enter I enter username, password and click on login

    Then Login should be successful