Feature: _US_11_Nation Keys functionality


  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @RegressionTest
  Scenario: create a new Notation Keys
    When navigate to Notation Keys  page
    Then create a new Notation Keys
    And success message  should be displayed
    Then edit a Notation Keys
    And  success message should be  displayed
    Then delete a Notation Keys account
    And  success  message  should be displayed