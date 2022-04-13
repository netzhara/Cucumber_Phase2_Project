
Feature: Validate feature scenario of the Product prices

  Background: Open the Swag Labs application
    Given user launch the website
    When user enters username "standard_user" and password "secret_sauce"
    Then user clicks on login
@Regression
  Scenario: Validate the product prices
    When user on products page
    Then user start compare the products price
      | Sauce Labs Backpack   | $29.99 |
      | Sauce Labs Bike Light | $9.99  |
