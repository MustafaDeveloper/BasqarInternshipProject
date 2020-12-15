Feature: Position Category

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  Scenario: Create a Position Category, edit und delete

    When Click on the element in the left classe
      | humanResources      |
      | humanResourcesSetup |
      | positionCategories  |
    Then Click on the element  Position Category the content class
      | addPositionButton |
   And Send keys new Position Category in the content
 #   Then Click on the element  Position Category the content class
 #     | Save |
 #   And Send keys new Position Category in the content class
 #     | searchNameInput | Grup8Categories |
 #   Then Click on the element  Position Category in the content class
 #     | searchNameButton |  | editButton |
 #   And Send keys new Position Category in the content class
 #     | nameInput | Grup8CategoriesEdit |
 #   Then Click on the element  Position Category in the content class
 #     | Save |