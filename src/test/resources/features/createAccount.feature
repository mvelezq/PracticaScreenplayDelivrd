#Author: mvelezq19@gmail.com

@CreateAccount
Feature: CreateAccount

  Background: login in home page
   Given the 'user' open de navegator
    When the user enter url page
    Then the should see the principal page 'Sign In'


  @tag1
  Scenario: Title of your scenario
    Given the user is in the register page
    When the user enter de necesary information
    Then the user will be registered in the page


 