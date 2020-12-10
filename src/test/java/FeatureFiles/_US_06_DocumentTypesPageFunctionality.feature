Feature: _US_06_Document Type Page functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  Scenario: create a new Document
    When navigate to Document types page
    Then create a new Document
    And success message should be displayed
    When navigate to Document types page
    Then edit a Document
    And success message  should  be  displayed
    When navigate to Document types page
    Then delete a Document account
    And success message should   be   displayed