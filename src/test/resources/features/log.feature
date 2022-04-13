@LoginWebsite
Feature: Login feature scenario of the SauceLab

@Sanity
  Scenario Outline: Verify login functionality with correct username and password
    Given user launch the Swag Labs website
    When user enters username "<usrnm>"
    Then user enters password "<pswd>"
    And user clicks on login button
    Then user should be landed on the products page

    Examples: 
      | usrnm         | pswd         |
      | standard_user | secret_sauce |

@Regression
  Scenario Outline: Verify login functionality with incorrect username and password
    Given user launch the Swag Labs website
    When user enters username "<usrnm>"
    Then user enters password "<pswd>"
    And user clicks on login button
    Then user should see "<Error>"

    Examples: 
      | usrnm         | pswd   | Error                                                                     |
      | standard_user | secret | Epic sadface: Username and password do not match any user in this service |
