Feature: Account Creation

Scenario: Creating an account and log in
    Given Users navigate to the account creation page
    When User fill the registration form with valid details
    And User submit the form
    Then User should see the confirmation message
    When User log in with the newly created account
    Then User should see the account dashboard