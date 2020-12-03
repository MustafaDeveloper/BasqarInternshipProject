Feature: Fees functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    When navigate to Fees page

  Scenario: create a Fee
    Then create Fee
      | nameInput | selmm|
      | codeInput | bismi |
    And  click on the element
      | saveButton  |
    And success or error message should  be displayed
      |  msjContainer| success |
