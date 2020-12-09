Feature: Fees Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  Scenario: Create a Fee Type
    Then go to Fees Page
    When Create a Fee Type name as "fee4" and code as "code3" and priority as "1"
    Then Success message should be displayed

  Scenario: Edit a Fee Type
    Then go to Fees Page
    When User edit the "fee4" to "fee8"
    Then Success message should be displayed

  Scenario: Delete a Fee Type
    Then go to Fees Page
    When User delete the "fee8"
    Then Success message should be displayed