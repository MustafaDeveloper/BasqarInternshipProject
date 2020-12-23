Feature: _US_13_Position Category

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @RegressionTest
  Scenario: Create a Position Category, edit und delete

    When Click on the element in the left classe
      | humanResources      |
      | humanResourcesSetup |
      | positionCategories  |
    And Position Category page  control
    Then Click on the element  Position Category the content class
      | bellButton  |
      | closeButton |
      | addPositionButton |
    And Send keys new Position Category in the content
      | nameInput | Grup8Categories |
    Then Click on the element  Position Category the content class
      | Save |
    And Success message should be displayed
    And Send keys new Position Category in the content
      | searchNameInput | Grup8Categories |
    Then Click on the element  Position Category the content class
      | searchNameButton |
      | bellButton  |
      | closeButton |
    And Position Category page search name control
    Then Click on the element  Position Category the content class
      | editButton |
    And Send keys new Position Category in the content
      | nameInput | Grup8CategoriesEdit |
    Then Click on the element  Position Category the content class
      | Save |
    And Success message should be displayed
    And Send keys new Position Category in the content
      | searchNameInput | Grup8CategoriesEdit |
    Then Click on the element  Position Category the content class
      | searchNameButton |
      | bellButton       |
      | closeButton      |
    Then Click on the element  Position Category the content class
      | deleteButton |
      | yesButton    |
    And Success message should be displayed
    #//son