#Author: Amila_wijerathna
#Feature: Verify Login and Logout
#Scenario: Verify Login and Logout
Feature: Verify that user can login to the TMS web application logout an an exist member
  I want to verify login and logout
  So that i can perform activities


  Background:
    Given I open URL as "url_QA"

  @export
  Scenario: Verify that users can successfully login to TMS system
    When User enter Username as "userName"
    Then User enter Password as "password"
    And User click login button