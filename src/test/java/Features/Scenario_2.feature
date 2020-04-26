Feature: First Scenario

  Scenario: Checking PWC featured articles
    Given I navigate to the PwC Digital Pulse website
    When I am viewing the 'Home' page
    Then I am presented with a carousel displaying 3 featured articles
    And Clicking the 'Next' button on the carousel will load the next_featured articles
    And Clicking the 'Previous' button on the carousel will load the previous_featured articles
       