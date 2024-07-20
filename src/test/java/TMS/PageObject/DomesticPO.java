package TMS.PageObject;

import TMS.PageFactory.TMSPageFactory;
import TMS.Runner.CommonFunctions;
import TMS.Runner.TMSRunner;
import Utility.UtilityHelper;
import Utility.WebDriverHelper;
import com.aventstack.extentreports.Status;
import org.hamcrest.core.IsNull;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;

public class DomesticPO extends TMSRunner {
    CommonFunctions cF = new CommonFunctions();

    public void clickCreateDomesticBtn()throws InterruptedException {
        test = extent.createTest("Domestic Job Creation Test Cases Executing");
        TMSPageFactory.pf.domesticCreateBtnID.click();
        Thread.sleep(3000);
        test.log(Status.PASS, "Create New Job File button functionality Passed");
    }

    public void enterJobName(String jobName)throws InterruptedException {
        TMSPageFactory.pf.jobFileNameID.sendKeys(jobName + cF.generateNumber());
        Thread.sleep(1000);
        if (TMSPageFactory.pf.jobFileNameID.getAttribute("value") == null) {
            test.log(Status.FAIL, "Domestic job Name Entering Failed");
        } else {
            test.log(Status.PASS, "Domestic job name entering Passed");
        }
    }

    public void enterReferenceNumber()throws InterruptedException {
        TMSPageFactory.pf.cusReferenceNumberID.sendKeys("refHMATIC" + cF.generateNumber());
        Thread.sleep(1000);
        if (TMSPageFactory.pf.cusReferenceNumberID.getAttribute("value") == null) {
            test.log(Status.FAIL, "Customer reference number entering Failed");
        } else {
            test.log(Status.PASS, "Customer reference number entering Passed");
        }
    }

    public void selectOperationsDropdown(String Option)throws InterruptedException {
        TMSPageFactory.pf.operationDropdownID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.operationsDefaultSelectID.click();
        Thread.sleep(1000);
        test.log(Status.PASS, "User operation selection Passed");
    }

    public void selectJobType()throws InterruptedException {
        TMSPageFactory.pf.jobTypeID.click();
        Thread.sleep(1000);
        test.log(Status.PASS, "User job type selection Passed");
    }

    public void selectLoadType()throws InterruptedException {
        TMSPageFactory.pf.loadTypeBtn.click();
        Thread.sleep(1000);
        test.log(Status.PASS, "User load type section Passed");
    }

    public void clickDomesticCreateBtn()throws InterruptedException {
        TMSPageFactory.pf.domCreateBtnID.click();
        Thread.sleep(10000);
        if (Objects.equals(WebDriverHelper.getWebDriver().getCurrentUrl(), "https://staging.app.haulmatic.com/dashboard")) {
            test.log(Status.FAIL, "User job creation test case Failed");
        } else {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Domestic Job Creation test case scenarios - PASSED:</span>");
        }
    }

    public void selectPartiesCustomer()throws InterruptedException {
        TMSPageFactory.pf.partiesCustomerID.click();
        TMSPageFactory.pf.partiesCustomerID.sendKeys("Sathosa");
        Thread.sleep(1000);
        TMSPageFactory.pf.partiesCustomerSearchID.click();
        if (Objects.equals(TMSPageFactory.pf.partiesCustomerInputID.getAttribute("value"), "Sathosa")) {
            test.log(Status.PASS, "Customer selecting using by dropdown Passed");
        } else {
            test.log(Status.FAIL, "Customer selecting using by dropdown Failed");
        }
    }

    public void selectPartiesShipper()throws InterruptedException {
        TMSPageFactory.pf.partiesShipperID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.partiesShipperSearchID.click();
        if (Objects.equals(TMSPageFactory.pf.partiesShipperID.getAttribute("value"), "RAS RANWALA")) {
            test.log(Status.PASS, "Shipper selecting by dropdown Passed");
        } else {
            test.log(Status.FAIL, "Shipper selecting by dropdown Failed");
        }
    }

    public void selectPartiesConsignee()throws InterruptedException {
        TMSPageFactory.pf.partiesConsigneeID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.partiesConsigneeSearchID.click();
        if (Objects.equals(TMSPageFactory.pf.partiesConsigneeID.getAttribute("value"), "Olympus (Pvt) Ltd")) {
            test.log(Status.PASS, "Consignee selecting by dropdown Passed");
        } else {
            test.log(Status.FAIL, "Consignee selecting by dropdown Failed");
        }
    }

    public void enterNumberOfLoad()throws InterruptedException {
        TMSPageFactory.pf.partiesNumberOfLoadsID.sendKeys("1");
        Thread.sleep(2000);
        if (Objects.equals(TMSPageFactory.pf.partiesNumberOfLoadsID.getAttribute("value"), "1")) {
            test.log(Status.PASS, "Entering number of loads Passed");
        } else {
            test.log(Status.FAIL, "Number of Load entering Failed");
        }
    }

    public void clickTruckDetailsNextBtn()throws InterruptedException {
        String jobDetailsUrl = WebDriverHelper.getWebDriver().getCurrentUrl();
        TMSPageFactory.pf.truckDetailsNextBtnID.click();
        Thread.sleep(3000);
        if (Objects.equals(WebDriverHelper.getWebDriver().getCurrentUrl(), jobDetailsUrl)) {
            test.log(Status.FAIL, "Job details test cases Failed");
        } else {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Job details test case scenarios - PASSED:</span>");
        }
    }

    public void clickFillDataBtn()throws InterruptedException {
        if (TMSPageFactory.pf.fillDataBtnID.isDisplayed()) {
            test.log(Status.PASS, "Fill Data button test case Passed");
        } else {
            test.log(Status.FAIL, "Fill Date button test case failed, because element is not visible");
        }
        TMSPageFactory.pf.fillDataBtnID.click();
        Thread.sleep(2000);
    }

    public void clickToExpand(int type)throws InterruptedException {
        if (type == 0) {
            WebDriver dr = WebDriverHelper.getWebDriver();
            JavascriptExecutor js = (JavascriptExecutor) dr;
            js.executeScript("arguments[0].scrollIntoView();", TMSPageFactory.pf.scrollBtn);

            TMSPageFactory.pf.expandFirstActivityID.click();
            Thread.sleep(1000);
            TMSPageFactory.pf.actEditBtnID.click();
            Thread.sleep(1000);
            test.log(Status.PASS, "First Activity expand and edit test case Passed");
        } else {
            TMSPageFactory.pf.expandSecondActivityID.click();
            Thread.sleep(1000);
            TMSPageFactory.pf.secondActEditButton.click();
            test.log(Status.PASS, "Second Activity expand and edit test case Passed");
            Thread.sleep(1000);
        }
    }

    public void selectFirstActLocation()throws InterruptedException {
        TMSPageFactory.pf.locationDropdownID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.locationDropdownSearchID.click();
        if (TMSPageFactory.pf.locationDropdownID.getAttribute("value") != null) {
            test.log(Status.PASS, "Location dropdown completion Passed");
        } else {
            test.log(Status.PASS, "Location dropdown completion Failed");
        }
        Thread.sleep(2000);
        TMSPageFactory.pf.dateTimePickerID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.pickDateNumberID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.tickBtnID.click();
        if (TMSPageFactory.pf.dateDropdownInputID.getAttribute("value") != null) {
            test.log(Status.PASS, "Job details, date time picker selection Passed");
        } else {
            test.log(Status.FAIL, "Job details, date time picker selection Failed");
        }
        Thread.sleep(1000);
        TMSPageFactory.pf.saveActBtnID.click();
        Thread.sleep(3000);
        if (TMSPageFactory.pf.jobDetailsFirstActSuccessTextID.isDisplayed()) {
            test.log(Status.PASS, "Job details first activity completion Passed");
        } else {
            test.log(Status.FAIL, "Job details first activity completion Failed");
        }
    }

    public void selectSecondActLocation() throws InterruptedException {
        TMSPageFactory.pf.secondActLocationID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.secondActLocationSearchID.click();
        Thread.sleep(1000);
        if (TMSPageFactory.pf.secondActLocationID.getAttribute("value") != null) {
            test.log(Status.PASS, "Second Activity location dropdown completion Passed");
        } else {
            test.log(Status.PASS, "Second Activity location dropdown completion Failed");
        }
        TMSPageFactory.pf.secondActDatePickerID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.secondActDateNumberPickID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.tickBtnID.click();
        if (TMSPageFactory.pf.secondActDateInputID.getAttribute("value") != null) {
            test.log(Status.PASS, "Second activity date time section Passed");
        } else {
            test.log(Status.PASS, "Second activity date time selection Failed");
        }
        Thread.sleep(1000);
        TMSPageFactory.pf.saveActBtnID.click();
        Thread.sleep(3000);
        if (TMSPageFactory.pf.secondActSuccessTestID.isDisplayed()) {
            test.log(Status.PASS, "Job details second activity completion Passed");
        } else {
            test.log(Status.FAIL, "Job details second activity completion Failed");
        }
    }

    public void clickShippingLineConfirmBtn()throws InterruptedException {
        try {
            TMSPageFactory.pf.shippingLineConfirmationBtnID.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "Job details activity completion Success");
        } catch (Exception e){
            test.log(Status.FAIL, e.getMessage());
        }
    }

    public void clickDuplicateBtn()throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            try {
                TMSPageFactory.pf.truckLoadDuplicateBtnID.click();
            } catch (Exception e) {
                test.log(Status.FAIL, "Container Load duplication " + i + "(" + e.getMessage() + ")");
            }
        }
        Thread.sleep(5000);
    }

    public void clickLoadDetailsNextBtn()throws InterruptedException {
        String preUrl = WebDriverHelper.getWebDriver().getCurrentUrl();
        TMSPageFactory.pf.loadDetailsNextBtnID.click();
        Thread.sleep(4000);
        if (Objects.equals(preUrl, WebDriverHelper.getWebDriver().getCurrentUrl())) {
            test.log(Status.FAIL, "<span style='color: red; font-weight: bold;'>Load details test case scenarios - FAILED:</span>");
        } else {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Load details test case scenarios - PASSED:</span>");
        }
    }

    public void clickJobSummaryConfirmBtn()throws InterruptedException {
        try {
            TMSPageFactory.pf.jobSummaryConfirmBtnID.click();
            Thread.sleep(1000);
            test.log(Status.PASS, "User click Job Summary confirmation button to complete the process Passed");
        } catch (Exception e) {
            test.log(Status.PASS, "User click Job Summary confirmation button to complete the process Failed"+"("+ e.getMessage() + ")");
        }
    }

    public void clickPaymentTermBtn()throws  InterruptedException {
        TMSPageFactory.pf.paymentTermBtnID.click();
        Thread.sleep(1000);
        test.log(Status.PASS, "Payment term expanding Passed");
    }

    public void clickRateCardInput()throws InterruptedException {
        TMSPageFactory.pf.rateCardBtnID.click();
        Thread.sleep(1000);
    }

    public void selectExternalContract()throws InterruptedException {
        TMSPageFactory.pf.rateCardNameID.click();
        Thread.sleep(1000);
        if (TMSPageFactory.pf.rateCardBtnID.getAttribute("value") != null) {
            test.log(Status.PASS, "External rate card selection Passed");
        } else {
            test.log(Status.FAIL, "External rate card selection Failed");
        }
    }

    public void clickPaymentTermType()throws InterruptedException {
        TMSPageFactory.pf.paymentImmediateBtnID.click();
        Thread.sleep(1000);
        if (TMSPageFactory.pf.rateCardBtnID.getAttribute("value") != null) {
            test.log(Status.PASS, "Payment term type selection Passed");
        } else {
            test.log(Status.FAIL, "Payment term type selection Passed, But rate card not selected");
        }
    }

    public void clickPaymentTermSaveBtn()throws InterruptedException {
        String prevUrl = WebDriverHelper.getWebDriver().getCurrentUrl();
        TMSPageFactory.pf.paymentTermSaveBtnID.click();
        Thread.sleep(1000);
        if (Objects.equals(prevUrl, WebDriverHelper.getWebDriver().getCurrentUrl())) {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Payment term and rate card selection test case scenarios - Passed:</span>");
        } else {
            test.log(Status.FAIL, "<span style='color: red; font-weight: bold;'>Payment term and rate card selection test case scenarios - Failed:</span>");
        }
    }

    public void clickLoad1Card()throws InterruptedException {
        TMSPageFactory.pf.loadCardID.click();
        Thread.sleep(2000);
        if (TMSPageFactory.pf.assignBtnID.isDisplayed()) {
            test.log(Status.PASS, "Load card selection Passed");
        } else {
            test.log(Status.FAIL, "Load card selection Failed");
        }
    }

    public void selectAssignedVehicle()throws InterruptedException {
        TMSPageFactory.pf.assignBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.assignVehicleID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.assignVehicleSearchID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.assignDriverDropdownID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.assignDriverSearchID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.assigneesSaveBtnID.click();
        Thread.sleep(4000);
        TMSPageFactory.pf.notifyBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.confirmNotifyYesBtnID.click();
        Thread.sleep(9000);
        String prevUrl = WebDriverHelper.getWebDriver().getCurrentUrl();
        TMSPageFactory.pf.controlTowerBtnID.click();
        Thread.sleep(16000);
        if (Objects.equals(prevUrl, WebDriverHelper.getWebDriver().getCurrentUrl())) {
            test.log(Status.FAIL, "<span style='color: red; font-weight: bold;'>Scheduling test case scenarios - Failed:</span>");
        } else {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Scheduling test case scenarios - Passed:</span>");
        }
    }

    public void expandFirstJPMAct()throws InterruptedException {
        TMSPageFactory.pf.firstJPMActivityID.click();
        Thread.sleep(2000);
    }

    public void completeFirstJPMAct()throws InterruptedException {
        TMSPageFactory.pf.firstActCompleteButtonID.click();
        Thread.sleep(1000);

        Date currentDate= new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy, HH:mm:ss");
        String currentDateFormat = dateFormat.format(currentDate);
        TMSPageFactory.pf.firstJPMActCalendarBtnID.sendKeys(Keys.CONTROL, Keys.chord("a"));
        TMSPageFactory.pf.firstJPMActCalendarBtnID.sendKeys(Keys.BACK_SPACE);
        TMSPageFactory.pf.firstJPMActCalendarBtnID.sendKeys(currentDateFormat);
        Thread.sleep(1000);

        TMSPageFactory.pf.odometerInputID.sendKeys("100");
        Thread.sleep(1000);
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(4000);
        TMSPageFactory.pf.firstJPMActivityID.click();
        Thread.sleep(4000);
        System.out.println("before");
        TMSPageFactory.pf.firstJPMActivityID.sendKeys(Keys.TAB, Keys.ENTER);
        System.out.println("after");
        Thread.sleep(2000);
    }

    public void expandSecondJPMAct()throws InterruptedException {
        TMSPageFactory.pf.startJourneyID.click();
        Thread.sleep(2000);
        Date currentDate= new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy, HH:mm:ss");
        String currentDateFormat = dateFormat.format(currentDate);
        TMSPageFactory.pf.startJourneyDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"));
        TMSPageFactory.pf.startJourneyDateInputID.sendKeys(Keys.BACK_SPACE);
        TMSPageFactory.pf.startJourneyDateInputID.sendKeys(currentDateFormat);
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(4000);
        TMSPageFactory.pf.endJourneyBtnID.click();
        Thread.sleep(2000);
        TMSPageFactory.pf.endJourneyDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"));
        TMSPageFactory.pf.endJourneyDateInputID.sendKeys(Keys.BACK_SPACE);
        TMSPageFactory.pf.endJourneyDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(5000);
        TMSPageFactory.pf.secondWorkOrderExpandBtnID.click();
        Thread.sleep(1000);
    }

    public void expandThirdJPMAct()throws InterruptedException {
        TMSPageFactory.pf.thirdWorkOrderExpandBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.enterThirdLocationBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.enterThirdLocationDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a", Keys.BACK_SPACE));
        TMSPageFactory.pf.enterThirdLocationDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.enterStartOrderMeterReadingBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.enterStartOrderMeterReadingDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.enterStartOrderMeterReadingDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.enterStartOrderMeterID.sendKeys("200");
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.cargoLoadingStartBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.cargoLoadingDateInputBtnID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.cargoLoadingDateInputBtnID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.cargoLoadingCompletedBtnId.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.cargoLoadingCompleteDateInputBtnID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.cargoLoadingCompleteDateInputBtnID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.thirdWorkOrderExitLocationBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.thirdWorOrderExitLocationDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.thirdWorOrderExitLocationDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(5000);
        TMSPageFactory.pf.thirdWorkOrderExpandBtnID.click();
        Thread.sleep(2000);
    }

    public void expandForthWorkOrder()throws InterruptedException {
        TMSPageFactory.pf.forthWorkOrderExpandBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.forthWorkOrderStartJourneyBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.forthWorkOrderStartJourneyDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.forthWorkOrderStartJourneyDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.forthWorkOrderEndJourneyBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.forthWorkOrderEndJourneyDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.forthWorkOrderEndJourneyDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(4000);
        TMSPageFactory.pf.forthWorkOrderExpandBtnID.click();
        Thread.sleep(2000);
    }

    public void expandFifthWorkOrder()throws InterruptedException {
        TMSPageFactory.pf.fifthWorkOrderExpandBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.fifthWorkOrderEnterLocationBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.fifthWorkOrderEnterLocationDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.fifthWorkOrderEnterLocationDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.fifthWorkOrderCargoUnloadingStartedBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.fifthWorkOrderCargoUnloadingDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.fifthWorkOrderCargoUnloadingDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.fifthWorkOrderCargoUnloadingCompletedBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.fifthWorkOrderCargoUnloadingCompletedDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.fifthWorkOrderCargoUnloadingCompletedDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.fifthWorkOrderEnterEndOdometerReadingBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.fifthWorkOrderEnterEndOdometerDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.fifthWorkOrderEnterEndOdometerDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.fifthWorkOrderEnterEndOdometerInputID.sendKeys("400");
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.fifthWorkOrderExitLocationBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.fifthWorkOrderExitLocationDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.fifthWorkOrderExitLocationDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.fifthWorkOrderExpandBtnID.click();
        Thread.sleep(1000);
    }

    public void expandFinalWorkOrder()throws InterruptedException {
        TMSPageFactory.pf.endWorkOrderExpandBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.endWorkOrderEndOdometerBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.endWorkOrderEndOdometerDateInputID.sendKeys(Keys.CONTROL, Keys.chord("a"), Keys.BACK_SPACE);
        TMSPageFactory.pf.endWorkOrderEndOdometerDateInputID.sendKeys(cF.datePickerLogic());
        TMSPageFactory.pf.endWorkOrderEndOdometerOdometerInputID.sendKeys("500");
        TMSPageFactory.pf.markAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.endWorkOrderExpandBtnID.click();
        Thread.sleep(8000);
    }

    public void clickViewUpdateInvoiceInformationBtn()throws InterruptedException {
        TMSPageFactory.pf.viewUpdateInvoiceInformationBtnID.click();
        Thread.sleep(2000);
    }

    public void completeViewUpdateInvoiceInformation()throws InterruptedException {
        try {
            TMSPageFactory.pf.completeTripOdometerBtnID.click();
            TMSPageFactory.pf.updateInvoiceInformationSaveBtnID.click();
            Thread.sleep(6000);
            test.log(Status.PASS, "Complete odometer selection Passed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Complete trp odometer update invoice test case Failed ->" +e.getMessage());
        }
    }

    public void completeContractDetails()throws InterruptedException {
        TMSPageFactory.pf.viewUpdateInvoiceInformationBtnID.click();
        Thread.sleep(1500);
        TMSPageFactory.pf.updateContractInvoiceTabBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.updateInvoiceInformationSaveBtnID.click();
        Thread.sleep(1000);
    }

    public void clickInvoiceSideBar()throws InterruptedException {
        String jobName = TMSPageFactory.pf.createdJobName.getText();
        try {
            TMSPageFactory.pf.invoiceSideNav.click();
            Thread.sleep(6000);
            TMSPageFactory.pf.internalCommitmentContract.click();
            Thread.sleep(6000);
            TMSPageFactory.pf.commitmentContractExpandBtnID.click();
            Thread.sleep(1000);
            TMSPageFactory.pf.commitmentContractSearchBtnID.sendKeys(jobName);
            TMSPageFactory.pf.commitmentContractSearchBtnID.click();
            Thread.sleep(2000);
            TMSPageFactory.pf.commitmentContractSearchBtnID.sendKeys(Keys.TAB, Keys.ENTER);
            Thread.sleep(3000);
            test.log(Status.PASS, "Commitment Contract Creating Passed");
        } catch (Exception e) {
            test.log(Status.FAIL, "Commitment Contract creating Failed -> "+e.getMessage());
        }
    }
}
