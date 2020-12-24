Feature: _US_02_Nationalities functionalities

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  @SmokeTest@RegressionTest
    Scenario: create edit and delete Nationalities
    When User should be able to create new Nationalites
    Then User should not be able to create a Nationality that is exists with similar name
    Then User should be able to update an existant Nationality
    Then User should be able to delete an existant Nationality



