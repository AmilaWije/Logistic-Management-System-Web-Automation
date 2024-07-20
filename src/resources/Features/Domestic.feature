#Author: Amila_wijerathna
#Feature: Verify domestic completion flow
#Scenario: Verify full truck load completion flow
Feature: Verify that domestic full truck load flow

#  Background:
#    Given I open URL as "url_QA"
#    When User enter Username as "userName"
#    Then User enter Password as "password"
#    And User click login button

  @domestic @full
  Scenario: Verify that users can successfully create and complete Domestic flow
    Given User click create new job file button
    When User fill job file "domesticName"
    When User entering customer reference number
    When User select the operation "options1"
    When User select the job type
    When User select the load type
    Then User click the create button

  @domestic @full
  Scenario: Verify the user completing the job details form
    Given User select customer for continue truck load process
    When User select shipper for complete truck load process
    When User select consignee for complete truck load process
    When User input number of truck load complete truck load process
    Then User click next button to complete and move to next step of domestic process

    @domestic @full
    Scenario: Verify the user completing the Container Details form
      Given User click Fill Load Data button
      When User click first activity to expand it
      When User select location to complete first activity
      When User click second activity to expand it
      When User fill the location and date and time to complete the second activities
      When User complete the shipping line details using confirm
      When User duplicating the created truck load
      Then User click next button move forward to next step

      @domestic @full
      Scenario: Verify the user completing activities in the Job Summary
        Given User click Confirm button continue process
        When User select required rate card for internal agreement
        When User select rate card for external agreement
        Then User click Save button to complete job summary process

        @domestic @full
        Scenario: Verify the user completing activities in the scheduling
          Given User click Load 1 card to assign driver
          When User select assigned vehicle to deliver truck load 1

          @domestic @full
          Scenario: Verify the user completing the JPM activities based on the load type
            Given User click first activities in the JPM
            When User complete the start job activity
            When User complete the second activity in transit
            When User complete the third work order cargo loading activity
            When User complete the forth work order in transit activity
            When User complete the fifth work order of cargo unloading activity
            When User complete the Last end work order to complete the truck load

            @domestic @full
            Scenario: Verify the user complete the JPM View Update Invoice Information
              Given User click View Update Invoice Information Button
              When User complete View update invoice information to complete invoice creation
              When User complete contract information details in update information

              @domestic @full
              Scenario: Verify the internal commitment contract for completed job
                Given User click commitment contract from the side bar