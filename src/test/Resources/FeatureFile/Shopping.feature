@shopping

Feature: Use the website to find products
  So that I can build a personalised gift list
  As a customer with an upcoming wedding
  I want to be able to find products to my taste
  Scenario: Search for products by description and budget
    Given I want candles in the £20-£39 price range
    When I search for “candles” and filter by price
    Then I should see some candles priced between £20-£39

