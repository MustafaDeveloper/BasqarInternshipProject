Feature: _US_09_BudgetSetup Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @RegressionTest
  Scenario: User should be create, delete and control to BudgetSetup
    When User should be able to view Budget Projects page
    Then User should be able to Budget Projects and view successfully validating the message
    And User should be not able to add without Code
    When User should be able to delete Budget Projects and view successfully validating the message


