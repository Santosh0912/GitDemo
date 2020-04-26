Feature: Third Scenario

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