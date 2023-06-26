Feature: Probar la busqueda en Google

Scenario: search on google
    Given I am on the google search page
    When I enter a search criteria
    And click on the search button
    Then the results match the criteria