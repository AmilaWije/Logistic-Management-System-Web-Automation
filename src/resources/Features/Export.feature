#Author: Amila_wijerathna
#Feature: Verify Login and Logout
#Scenario: Verify Login and Logout
Feature: Verify that user can login to the TMS web application logout an an exist member
  I want to verify Export Work Flow

#  Background:
#    Given I open URL as "url_QA"
#    When User enter Username as "userName"
#    Then User enter Password as "password"
#    And User click login button

  @export @full
  Scenario: Verify that users can successfully create an complete export workflow
    When User click create new job file button to create Export Job
    Given User enter all the required inputs and create export job "exportName"
    When User enter reference number
    When User select Operation from the Dropdown
    When User select job type as a Export
    When User select load type as a FCL
    When User create export job using create button

    @export @full
    Scenario: Verify that users can successfully complete container details process
      When User complete Load Details and complete the flow

      @export @full
      Scenario: Verify that users can successfully complete container details process
        When User click fill container data button to view container details model
        When User complete selection method and File sizes from the dropdown
        When User expand first activity in container details
        When User click first activity edit button in container details
        When User select location using location dropdown
        When User complete the first activity in export flow
        When User complete the second activity in export flow
        When User complete the third activity in export flow
        When User complete the Container details flow using confirm button
        When User complete the duplicate functionality
        When User click next button to complete container details flow
        When User complete the Job Summary flow

        @export @full
        Scenario: Verify that users can successfully complete scheduling process
          When User click truck load and assign that driver and complete the scheduling process

          @export @full
          Scenario: Verify that users can successfully complete JPM process
            When user click first activity expand button
            When user click third work order expand button to complete
            When user click forth work order expand button to complete
            When user click fifth work order expand button to complete
            When user click sixth work order expand button to complete
            When user click Seventh work order expand button to complete
            When user click eight work order expand button to complete
            When user click ninth work order expand button to complete
            When user click tenth work order expand button to complete
            When user click view update invoice infromation button to create invoice for completed work order