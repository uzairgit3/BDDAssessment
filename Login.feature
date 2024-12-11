#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login feature
  

  @tag1
  Scenario: Sucessfull Login
    Given User launch browser
    When User opens URL "https://admin-demo.nopcommerce.com/login/"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And click on Login buuton
    Then Page Title should be "Your Store. Login"
 