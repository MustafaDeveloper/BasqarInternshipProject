Feature: _US_07_Notification Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @RegressionTest
  Scenario: Create a new Notification

    When Click on the element in the left class
      | messaging     |
      | notifications |
    Then Notification page control
    Then Click on the element in the content class
      | forTimeOut |
      | addButton  |
    When User sending the keys in the form content class
      | nameInput | Ali baba |
    Then Click on the element in the content class
      | typeButton      |
      | paymentDeadline |
    When User sending the keys in the form content class
      | description | Borc durumu |
    Then Click on the element in the content class
      | Save |
    Then Success message should be displayed
    Then Click on the element in the content class
      | backButton |
    When User sending the keys in the form content class
      | searchName | Ali baba |
    Then Click on the element in the content class
      | searchButton |
    Then Notification name page control

    Then Click on the element in the content class
      | forTimeOut |
      | editButton |
    When User sending the keys in the form content class
      | nameInput | asdfefdd |
    Then Click on the element in the content class
      | typeButton        |
      | examinationResult |
    Then Click on the element in the content class
      | Save |
    Then Success message should be displayed
    Then Click on the element in the content class
      | backButton |
    When User sending the keys in the form content class
      | searchName | asdfefdd |
    Then Click on the element in the content class
      | searchButton |
      | deleteButton |
      | yesButton    |
    Then Success message should be displayed
