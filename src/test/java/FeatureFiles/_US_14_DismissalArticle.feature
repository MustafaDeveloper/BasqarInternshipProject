Feature: Dismissal Article Functionalities

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button



  @RegressionTest
  Scenario: create, edit, delete and control Dismissal Article


  Then User should be able to view Dismissal Articles page
 And User  should be able to create Dismissal Articles and view  successfully validating the message
    When searching by  name , the results should be matched the search terms.
  Then User should  be able to edit Dismissal Articles  and view  successfully validating the message
  And User should be able to delete  Dismissal Articles and view  successfully validating the message

