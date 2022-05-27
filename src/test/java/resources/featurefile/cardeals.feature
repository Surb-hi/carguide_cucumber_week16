@test
Feature: Search functionality

  Scenario: Search the dealer name
    Given   I am on homepage
    When    I mouse hover on “buy+sell” tab
    And     I click 'Find a Dealer' link
    Then    I see the dealer lists
      | 3 Point Motors Epping |
      | 4WD Specialist Group |
      | 5 Star Auto |
      | A & M Car Sales Pty Ltd |
      | A1 MOTORS COMPANY |
      | ANDREA MOTORI SERVICE |
      | Oxford Motors|
