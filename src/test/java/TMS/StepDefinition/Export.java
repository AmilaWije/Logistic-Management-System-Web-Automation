package TMS.StepDefinition;

import TMS.PageObject.ExportPO;
import Utility.PropertyFileHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Export {

    ExportPO extPO = new ExportPO();

    @When("User click create new job file button to create Export Job")
    public void user_click_create_new_job_file_button()throws InterruptedException {
        extPO.clickJobCreateBtn();
    }

    @Given("User enter all the required inputs and create export job {string}")
    public void user_enter_all_the_required_inputs_and_create_export_job(String exportName)throws InterruptedException {
        extPO.createExportJob(PropertyFileHandler.readProperty(exportName));
    }

    @When("User enter reference number")
    public void user_enter_reference_number()throws InterruptedException {
        extPO.enterExportReferenceNumber();
    }

    @When("User select Operation from the Dropdown")
    public void user_select_operation_from_the_dropdown()throws InterruptedException {
        extPO.selectOperation();
    }

    @When("User select job type as a Export")
    public void user_select_job_type_as_a_Export()throws InterruptedException {
        extPO.selectExportJobType();
    }

    @When("User select load type as a FCL")
    public void user_select_load_type_as_a_FCL()throws InterruptedException {
        extPO.selectLoadType();
    }

    @When("User create export job using create button")
    public void user_create_export_job_using_create_button()throws InterruptedException {
        extPO.clickExportCreateBtn();
    }

    @When("User complete Load Details and complete the flow")
    public void user_complete_load_details_and_complete_the_flow()throws InterruptedException {
        extPO.selectCustomer();
    }

    @When("User click fill container data button to view container details model")
    public void user_click_fill_container_data_button_to_view_container_details_model()throws InterruptedException {
        extPO.clickFillContainerDataBtn();
    }

    @When("User complete selection method and File sizes from the dropdown")
    public void user_complete_selection_method_and_file_sizes_from_the_dropdown()throws InterruptedException {
        extPO.selectSelectionMethodAndSize();
    }

    @When("User expand first activity in container details")
    public void user_expand_first_activity_in_container_details()throws InterruptedException {
        extPO.expandContainerDetailsFirstActivity();
    }

    @When("User click first activity edit button in container details")
    public void user_click_first_activity_edit_button_in_container_details()throws InterruptedException {
        extPO.clickFirstActEditBtn();
    }

    @When("User select location using location dropdown")
    public void user_select_location_using_location_dropdown()throws InterruptedException {
        extPO.selectFirstActLocation();
    }

    @When("User complete the first activity in export flow")
    public void user_complete_the_first_activity_in_export_flow()throws InterruptedException {
        extPO.selectDateAndTime();
    }

    @When("User complete the second activity in export flow")
    public void user_complete_the_second_activity_in_export_flow()throws InterruptedException {
        extPO.completeSecondAct();
    }

    @When("User complete the third activity in export flow")
    public void user_complete_the_third_activity_in_export_flow()throws InterruptedException {
        extPO.completeThirdAct();
    }

    @When("User complete the Container details flow using confirm button")
    public void user_complete_the_Container_details_flow_using_confirm_button()throws InterruptedException {
        extPO.clickContainerDetailsConfirmBtnID();
    }

    @When("User complete the duplicate functionality")
    public void user_complete_the_duplicate_functionality()throws InterruptedException {
        extPO.clickDuplicateBtn();
    }

    @When("User click next button to complete container details flow")
    public void user_click_next_button_to_complete_container_details_flow()throws InterruptedException {
        extPO.clickNextBtnCompleteLoadDetails();
    }

    @When("User complete the Job Summary flow")
    public void user_complete_the_Job_Summary_flow()throws InterruptedException {
        extPO.clickExportConfirmBtn();
    }

    @When("User click truck load and assign that driver and complete the scheduling process")
    public void user_click_truck_load_and_assign_that_driver_and_complete_the_scheduling_process()throws InterruptedException {
        extPO.completeSchedulingProcess();
    }

    @When("user click first activity expand button")
    public void user_click_first_activity_expand_button()throws InterruptedException {
        extPO.expandFirstActJPM();
    }

    @When("user click third work order expand button to complete")
    public void user_click_third_work_order_expand_button_to_complete()throws InterruptedException {
        extPO.completeThirdWorkOrder();
    }

    @When("user click forth work order expand button to complete")
    public void user_click_forth_work_order_expand_button_to_complete()throws InterruptedException {
        extPO.completeForthWorkOrder();
    }

    @When("user click fifth work order expand button to complete")
    public void user_click_fifth_work_order_expand_button_to_complete()throws InterruptedException {
        extPO.completeFifthWorkOrder();
    }

    @When("user click sixth work order expand button to complete")
    public void user_click_sixth_work_order_expand_button_to_complete()throws InterruptedException {
        extPO.completeSixthWorkOrder();
    }

    @When("user click Seventh work order expand button to complete")
    public void user_click_Seventh_work_order_expand_button_to_complete()throws InterruptedException {
        extPO.completeSeventhWorkOrder();
    }

    @When("user click eight work order expand button to complete")
    public void user_click_eight_work_order_expand_button_to_complete()throws InterruptedException {
        extPO.completeEightWorkOrder();
    }

    @When("user click ninth work order expand button to complete")
    public void user_click_ninth_work_order_expand_button_to_complete()throws InterruptedException{
        extPO.completeNinthWorkOrder();
    }

    @When("user click tenth work order expand button to complete")
    public void user_click_tenth_work_order_expand_button_to_complete()throws InterruptedException {
        extPO.completeLastWorkOrder();
    }

    @When("user click view update invoice infromation button to create invoice for completed work order")
    public void user_click_view_update_invoice_infromation_button_to_create_invoice_for_completed_work_order()throws InterruptedException {
        extPO.completeCreateInvoice();
    }
}
