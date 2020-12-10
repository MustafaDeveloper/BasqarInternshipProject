Feature: _US_08_Item Categories Page functionality(Inventory-Setup)

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  @RegressionTest
  Scenario: Create, Edit, Delete and Controlle Item Category
    When User should be able to view Item Categories Page
    Then User  should be able to create new Item Categorie  and view  successfully validating the message
    And  searching by  name, the results should be matched the search terms.
    Then User should be able to edit Item Categorie and view  successfully validating the message
    Then User should be able to delete  Item Categorie and view  successfully validating the message

