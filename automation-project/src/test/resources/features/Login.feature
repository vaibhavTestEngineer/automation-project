@Login @Customer
Feature: Login feature
  @SC01 @Sanity @Manager
  Scenario: Login with valid credentials 1
  Given I Open application url in browser
   When Enter I enter 'mngr447030', 'AhEvYtA' and click on login
    Then Login should be successful
