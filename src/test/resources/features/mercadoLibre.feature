Feature: Test functionality of search from mercadolibre site

  Scenario: Searching products in mercadolibre
     Given Navigate in mercadolibre
     When Enter Search criteria
     And Click on search button
     Then Result match the criteria
    And Close Browser

    Example: Search cheapest nintendo Switch console