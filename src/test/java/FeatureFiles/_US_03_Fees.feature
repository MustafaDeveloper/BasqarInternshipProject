Feature: _US_03_Fees Create Edit Delete Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  @RegressionTest
  Scenario: Create a Fee Type
    Then go to Fees Page
    When Create a Fee Type name as "fee40" and code as "code30" and priority as "1"
    Then Success_03 message should be displayed

  @RegressionTest
  Scenario: Edit a Fee Type
    Then go to Fees Page
    When User edit the "fee40" to "fee80"
    Then Success_03 message should be displayed


  @RegressionTest
  Scenario: Delete a Fee Type
    Then go to Fees Page
    When User delete the "fee80"
    Then Success_03 message should be displayed