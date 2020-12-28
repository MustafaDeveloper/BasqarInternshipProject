Feature: _US_06_Document Type Page functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  @RegressionTest
  Scenario: create a new Document
    When navigate to Document types page
    Then create a new Document
    And success message should be displayed

    Then edit a Document
    And success message  should  be  displayed

    Then delete a Document account
    And success message should   be   displayed