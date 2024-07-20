package TMS.StepDefinition;

import TMS.PageObject.DomesticPO;
import TMS.Runner.CommonFunctions;
import Utility.PropertyFileHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Domestic {
    DomesticPO domesticPO = new DomesticPO();

    @Given("User click create new job file button")
    public void user_click_create_new_job_file_button()throws InterruptedException {
        domesticPO.clickCreateDomesticBtn();
    }

    @When("User fill job file {string}")
    public void user_fill_job_file_name(String jobFileName)throws InterruptedException {
        domesticPO.enterJobName(PropertyFileHandler.readProperty(jobFileName));
    }

    @When("User entering customer reference number")
    public void user_entering_customer_reference_number()throws InterruptedException {
        domesticPO.enterReferenceNumber();
    }

    @When("User select the operation {string}")
    public void user_select_the_operation(String option)throws  InterruptedException {
        domesticPO.selectOperationsDropdown(option);
    }

    @When("User select the job type")
    public void user_select_the_job_type()throws InterruptedException {
        domesticPO.selectJobType();
    }

    @When("User select the load type")
    public void user_select_the_load_type()throws InterruptedException {
        domesticPO.selectLoadType();
    }

    @Then("User click the create button")
    public void user_click_the_create_button()throws InterruptedException {
        domesticPO.clickDomesticCreateBtn();
    }

    @Given("User select customer for continue truck load process")
    public void user_select_customer_for_continue_truck_load_process()throws InterruptedException {
        domesticPO.selectPartiesCustomer();
    }

    @When("User select shipper for complete truck load process")
    public void user_select_shipper_for_complete_truck_load_process()throws InterruptedException {
        domesticPO.selectPartiesShipper();
    }

    @When("User select consignee for complete truck load process")
    public void user_select_consignee_for_complete_truck_load_process()throws InterruptedException {
        domesticPO.selectPartiesConsignee();
    }

    @When("User input number of truck load complete truck load process")
    public void user_input_number_of_truck_load_complete_truck_load_process()throws InterruptedException {
        domesticPO.enterNumberOfLoad();
    }

    @When("User click next button to complete and move to next step of domestic process")
    public void user_click_next_button_to_complete_and_move_to_next_step_of_domestic_process()throws InterruptedException {
        domesticPO.clickTruckDetailsNextBtn();
    }

    @Given("User click Fill Load Data button")
    public void user_click_Fill_Load_Data_button()throws InterruptedException {
        domesticPO.clickFillDataBtn();
    }

    @When("User click first activity to expand it")
    public void user_click_first_activity_to_expand_it()throws InterruptedException {
        domesticPO.clickToExpand(0);
    }

    @When("User select location to complete first activity")
    public void user_select_location_to_complete_first_activity()throws InterruptedException {
        domesticPO.selectFirstActLocation();
    }

    @When("User click second activity to expand it")
    public void user_click_second_activity_to_expand_it()throws InterruptedException {
        domesticPO.clickToExpand(1);
    }

    @When("User fill the location and date and time to complete the second activities")
    public void user_fill_the_location_and_date_and_time_to_complete_the_second_activities()throws InterruptedException {
        domesticPO.selectSecondActLocation();
    }

    @When("User complete the shipping line details using confirm")
    public void user_complete_the_shipping_line_details_using_confirm()throws InterruptedException {
        domesticPO.clickShippingLineConfirmBtn();
    }

    @When("User duplicating the created truck load")
    public void user_duplicating_the_created_truck_load()throws InterruptedException {
        domesticPO.clickDuplicateBtn();
    }

    @When("User click next button move forward to next step")
    public void user_click_next_button_move_forward_to_next_step()throws InterruptedException {
        domesticPO.clickLoadDetailsNextBtn();
    }

    @When("User click Confirm button continue process")
    public void user_click_Confirm_button_continue_process()throws InterruptedException {
        domesticPO.clickJobSummaryConfirmBtn();
    }

    @When("User select required rate card for internal agreement")
    public void user_select_required_rate_card_for_internal_agreement()throws InterruptedException {
        domesticPO.clickPaymentTermBtn();
    }

    @When("User select rate card for external agreement")
    public void user_select_rate_card_for_external_agreement()throws InterruptedException {
        domesticPO.clickRateCardInput();
        domesticPO.selectExternalContract();
        domesticPO.clickPaymentTermType();
    }

    @When("User click Save button to complete job summary process")
    public void user_click_Save_button_to_complete_job_summary_process()throws InterruptedException {
        domesticPO.clickPaymentTermSaveBtn();
    }

    @Given("User click Load 1 card to assign driver")
    public void user_click_Load_1_card_to_assign_driver() throws InterruptedException {
        domesticPO.clickLoad1Card();
    }

    @Given("User select assigned vehicle to deliver truck load 1")
    public void user_select_assigned_vehicle_to_deliver_truck_load_1()throws InterruptedException {
        domesticPO.selectAssignedVehicle();
    }

    @Given("User click first activities in the JPM")
    public void user_click_first_activities_in_the_JPM()throws InterruptedException {
        domesticPO.expandFirstJPMAct();
    }

    @When("User complete the start job activity")
    public void user_complete_the_start_job_activity()throws InterruptedException {
        domesticPO.completeFirstJPMAct();
    }

    @When("User complete the second activity in transit")
    public void user_complete_the_second_activity_in_transit()throws InterruptedException {
        domesticPO.expandSecondJPMAct();
    }

    @When("User complete the third work order cargo loading activity")
    public void user_complete_the_third_work_order_cargo_loading_activity()throws InterruptedException {
        domesticPO.expandThirdJPMAct();
    }

    @When("User complete the forth work order in transit activity")
    public void user_complete_the_forth_work_order_in_transit_activity()throws InterruptedException {
        domesticPO.expandForthWorkOrder();
    }

    @When("User complete the fifth work order of cargo unloading activity")
    public void user_complete_the_fifth_work_order_of_cargo_unloading_activity()throws InterruptedException {
        domesticPO.expandFifthWorkOrder();
    }

    @When("User complete the Last end work order to complete the truck load")
    public void user_complete_the_last_end_work_order_to_complete_the_truck_load()throws InterruptedException {
        domesticPO.expandFinalWorkOrder();
    }

    @Given("User click View Update Invoice Information Button")
    public void user_click_view_update_invoice_information_button()throws InterruptedException {
        domesticPO.clickViewUpdateInvoiceInformationBtn();
    }

    @When("User complete View update invoice information to complete invoice creation")
    public void user_complete_view_update_invoice_information_to_complete_invoice_creation()throws InterruptedException {
        domesticPO.completeViewUpdateInvoiceInformation();
    }

    @When("User complete contract information details in update information")
    public void user_complete_contract_information_details_in_update_information()throws InterruptedException {
        domesticPO.completeContractDetails();
    }

    @When("User click commitment contract from the side bar")
    public void user_click_commitment_contract_from_the_side_bar()throws InterruptedException {
        domesticPO.clickInvoiceSideBar();
    }
}