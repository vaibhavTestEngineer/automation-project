@Login @Manager
Feature: Add Account feature
  @Sanity
  Scenario: Add account happy path 1
    Given I Open application url in browser
    When Enter I enter username, password and click on login
    Then Login should be successful
  Scenario: Add account happy path 2
    Given I do something

    When I do something else
    Then I should see something