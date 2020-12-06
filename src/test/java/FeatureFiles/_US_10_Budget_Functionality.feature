Feature: Budget functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  @SmokeTest
  Scenario: create a budget incomplete form

    When navigate to budget
    Then create a budget with incomplete form
    And save button can not be clicked


  @RegressionTest
  Scenario Outline: create a budget with complete form

    When navigate to budget
    Then create a budget with "<Description>" and "<Year>"
    And success message should  be displayed
    Examples:
      | Description | Year |
      | Group88     | 2021 |


  @RegressionTest
  Scenario: delete a budget

    When navigate to budget
    Then edit a budget
    Then delete a budget
    And success message should  be displayed





