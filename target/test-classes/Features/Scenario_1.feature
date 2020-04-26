Feature: Second Scenario
  
  Scenario: Checking HamBurger Menu
    Given I navigate to the PwC Digital Pulse website
    When I select 'Contact us' from the hamburger menu
    Then I am taken to the 'Contact us' page
    And I am presented with the below options for contacts   