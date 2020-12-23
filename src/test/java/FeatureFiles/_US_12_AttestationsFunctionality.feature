Feature: Attestations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

    Scenario Outline: :  Create a Attestation
      When Navigate to the Attestations page
      Then  input Attestation's name "<Name>"
      #And success message should be displayed.
      Examples:
        |  Name   |
        |  Okay   |

      Scenario: Edit the created Attestation
        When Navigate to the Attestations page
        Then check the created "Okay" name
        When edit the created name
        And success message should be displayed.

    Scenario: Delete created Attestation
      And Navigate to Attestations page
      When delete teh created attestation name as "Okay"






