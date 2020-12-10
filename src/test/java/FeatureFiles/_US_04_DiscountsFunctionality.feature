Feature: _US_04_Discounts Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @RegressionTest
  Scenario Outline: :  Create a Discount
    When Navigate to the Discounts page
    Then  input discount's name is "<Description>" code is "<Code>" and priority is "<Priority>"
    Examples:
      | Description   | Code | Priority |
      | New Year 2021 | 1905 | 5        |


  @RegressionTest
  Scenario: Delete created Discount
    And Navigate to Discounts page
    When delete created the discount name as "New Year 2021"



