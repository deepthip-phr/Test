Feature: Home Module

Scenario: Verify welcome page
Given User open application
When User on welcome screen
@android @home
  Scenario: Verify successful login
    Given User on welcome screen
    When I login with "username" and "password"
  @ios @home

   Scenario Outline: Verify login
     Then I login with "<username>" and "<password>"
     Examples:
     |username|password|
     |Joe     |  123      |
     |siva    |456        |
     |deepak    |456        |

     @web
   Scenario: Verify login failed
     Given I entered my credentials
     |Joe|123|
     Then I verify login failed