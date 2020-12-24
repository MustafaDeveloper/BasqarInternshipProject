Feature:  _US_01_Citizenships Page functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  @SmokeTest@RegressionTest
  Scenario: create edit and delete Nationalities
    When Navigate to citizionshippage
   Then User should be able to create new citizionships with required informations
    Then User should be able to update an existant citizenship
    Then User should be able to delete an existant citizenship
    And User should not be able to delete non existant citizenship