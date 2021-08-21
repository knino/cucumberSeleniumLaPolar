@MercadoLibre
Feature: Test functionality of search from mercadolibre site

  Scenario: Searching product page in mercadolibre
     Given Navigate in mercadolibre
     When Enter Search criteria
     And Click on search button
     Then Result match the criteria


  Scenario: Testing full utility button
      Given Navigate for products list page in mercado libre
      When I click in Full button Bar
      Then I take the class of the bar button to check that it is activated
