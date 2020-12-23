Feature:_US_05_GradeLevels page functionality


  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @RegressionTest
  Scenario: create a new Grade levels
    When Navigate to Grade levels  page
    Then Create a Grade
    And Success message  should be displayed
    Then Edit a Grade levels
    Then  Success message should be  displayed
    Then Delete a Grade levels
    And  Success  message  should be displayed