Feature: PwC's Digital Pulse website

  Scenario: Checking PWC featured articles
    Given I navigate to the PwC Digital Pulse website
    When I am viewing the 'Home' page
    Then I am presented with a carousel displaying 3 featured articles
    And Clicking the 'Next' button on the carousel will load the next_featured articles
    And Clicking the 'Previous' button on the carousel will load the previous_featured articles

  Scenario: Checking HamBurger Menu
    Given I navigate to the PwC Digital Pulse website
    When I select 'Contact us' from the hamburger menu
    Then I am taken to the 'Contact us' page
    And I am presented with the below options for contacts

  Scenario Outline: Checking Magnifying glass search
    Given I navigate to the PwC Digital Pulse website
    When I click on the 'Magnifying glass' icon to perform a search
    And I enter the text 'Single page applications' in "<Search>"
    And I submit the search
    Then I am taken to the search results page
    And I am presented with at least one search result

    Examples: 
      | Search                   |
      | Single Page Applications |
