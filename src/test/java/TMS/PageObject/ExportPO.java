package TMS.PageObject;

import TMS.PageFactory.TMSPageFactory;
import TMS.Runner.CommonFunctions;
import TMS.Runner.TMSRunner;
import Utility.WebDriverHelper;
import com.aventstack.extentreports.Status;
import com.google.common.math.StatsAccumulator;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xssf.usermodel.XSSFPivotTable;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.net.ssl.TrustManagerFactorySpi;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Objects;

import static TMS.Runner.TMSRunner.extent;
import static TMS.Runner.TMSRunner.test;
import static Utility.WebDriverHelper.driver;
import static Utility.WebDriverHelper.getWebDriver;

public class ExportPO {

    CommonFunctions cF = new CommonFunctions();

    public void clickJobCreateBtn()throws InterruptedException {
        test = extent.createTest("Export Job Creating test Cases Executing");
        TMSPageFactory.pf.domesticCreateBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.jobFileNameID);
        if (Objects.equals(TMSPageFactory.pf.jobFileNameID.isDisplayed(), true)) {
            test.log(Status.PASS, "Create job button test case Passed");
        } else {
            test.log(Status.FAIL, "Create job button test case Failed");
        }
    }

    public void createExportJob(String jobName)throws InterruptedException {
        TMSPageFactory.pf.jobFileNameID.sendKeys(jobName + cF.generateNumber());
        String enterJobName = TMSPageFactory.pf.jobFileNameID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(enterJobName), true)) {
            test.log(Status.PASS, "Job name entering test case passed");
        } else {
            test.log(Status.FAIL, "Job name entering test case Failed");
        }
    }

    public void enterExportReferenceNumber()throws InterruptedException {
        TMSPageFactory.pf.cusReferenceNumberID.sendKeys("refHMATICEXPORT" + cF.generateNumber());
        String enterRefNumber = TMSPageFactory.pf.cusReferenceNumberID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(enterRefNumber), true)) {
            test.log(Status.PASS, "Customer reference number entering Passed");
        } else {
            test.log(Status.PASS, "Customer reference number entering Failed");
        }
    }

    public void selectOperation()throws InterruptedException {
        TMSPageFactory.pf.operationDropdownID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.operationsDefaultSelectID.click();
        Thread.sleep(1000);
        String selectedOperation = TMSPageFactory.pf.operationInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(selectedOperation), true)) {
            test.log(Status.PASS, "Operation selection test cases Passed");
        } else {
            test.log(Status.FAIL, "Operation selection test cases Failed");
        }
    }

    public void selectExportJobType()throws InterruptedException {
        TMSPageFactory.pf.exportJobTypeBoxID.click();
        if (Objects.equals(TMSPageFactory.pf.exportJobTypeBoxID.isDisplayed(), true)) {
            test.log(Status.PASS, "Export job type selection Passed");
        } else {
            test.log(Status.FAIL, "Export job type selection Failed");
        }
    }

    public void selectLoadType()throws InterruptedException {
        TMSPageFactory.pf.selectFCL.click();
        Thread.sleep(1000);
        if (Objects.equals(TMSPageFactory.pf.selectFCL.isDisplayed(), true)) {
            test.log(Status.PASS, "Load type selection Passed");
        } else {
            test.log(Status.FAIL, "Load type selection Failed");
        }
    }

    public void clickExportCreateBtn()throws InterruptedException {
        TMSPageFactory.pf.domCreateBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportPartiesCustomerInputID);
        if (Objects.equals(TMSPageFactory.pf.exportPartiesCustomerInputID.isDisplayed(), true)) {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Export Job Creation test case scenarios - PASSED:</span>");
        } else {
            test.log(Status.FAIL, "<span style='color: red; font-weight: bold;'>Export Job Creation test case scenarios - FAILED:</span>");
        }
    }

    public void selectCustomer()throws InterruptedException {
        Thread.sleep(2000);
        WebDriverHelper.getWebDriverHelper().waitForPageLoad();
        TMSPageFactory.pf.exportPartiesCustomerInputID.click();
        TMSPageFactory.pf.exportPartiesCustomerInputID.sendKeys("Sathosa");
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportCustomerSearchID);
        TMSPageFactory.pf.exportCustomerSearchID.click();
        String selectedCustomer = TMSPageFactory.pf.exportPartiesCustomerInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(selectedCustomer), true) && Objects.equals(selectedCustomer, "Sathosa")) {
            test.log(Status.PASS, "Container details customer selection test case Passed");
        } else {
            test.log(Status.FAIL, "Container details customer selection test case Failed");
        }

        TMSPageFactory.pf.exportShipperInputID.click();
        TMSPageFactory.pf.exportShipperInputID.sendKeys("RAS");
        Thread.sleep(3000);
        TMSPageFactory.pf.exportShipperSearchID.click();
        String selectedShipper = TMSPageFactory.pf.exportShipperInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(selectedShipper), true)) {
            test.log(Status.PASS, "Container details shipper selection test case Passed");
        } else {
            test.log(Status.FAIL, "Container details shipper selection test case Failed");
        }

        TMSPageFactory.pf.emptyContainerPickupInputID.click();
        TMSPageFactory.pf.emptyContainerPickupInputID.sendKeys("Green");
        TMSPageFactory.pf.emptyContainerPickupSearchID.click();
        String selectedEmptyContainerPickup = TMSPageFactory.pf.emptyContainerPickupInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(selectedEmptyContainerPickup), true) && Objects.equals(selectedEmptyContainerPickup, "Green Lanka Yard (PUBLIC) ")) {
            test.log(Status.PASS, "Empty container pickup location selection Passed");
        } else {
            test.log(Status.FAIL, "Empty Container pickup location selection Failed");
        }

        TMSPageFactory.pf.emptyPortLoadingInputID.click();
        TMSPageFactory.pf.emptyPortLoadingInputID.sendKeys("Port of Hambanthota(PUBLIC) ");
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.emptyPortLoadingSearchID);
        TMSPageFactory.pf.emptyPortLoadingSearchID.click();
        String selectedPortLoading = TMSPageFactory.pf.emptyPortLoadingInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(selectedPortLoading), true) && Objects.equals(selectedPortLoading, "Port of Hambanthota(PUBLIC) ")) {
            test.log(Status.PASS, "Empty container loading selection Passed");
        } else {
            test.log(Status.FAIL, "Empty container loading selection Failed");
        }

        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.containerUnloadingTerminalInputID);
        Thread.sleep(1000);
        TMSPageFactory.pf.containerUnloadingTerminalInputID.click();
        Thread.sleep(2000);
        TMSPageFactory.pf.containerUnloadingTerminalInputID.sendKeys("Litro Gas Terminal ");
        Thread.sleep(4000);
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.containerUnloadingTerminalSearchID);

        try {
            TMSPageFactory.pf.containerUnloadingTerminalSearchID.click();
        } catch (TimeoutException e) {
            TMSPageFactory.pf.emptyPortLoadingInputID.clear();
            TMSPageFactory.pf.emptyPortLoadingInputID.click();
            TMSPageFactory.pf.emptyPortLoadingInputID.sendKeys("Port of Hambanthota(PUBLIC) ");
            WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.emptyPortLoadingSearchID);
            TMSPageFactory.pf.emptyPortLoadingSearchID.click();
            String selectedPortLoading1 = TMSPageFactory.pf.emptyPortLoadingInputID.getAttribute("value");
            if (Objects.equals(StringUtils.isNotBlank(selectedPortLoading1), true) && Objects.equals(selectedPortLoading1, "Port of Hambanthota(PUBLIC) ")) {
                test.log(Status.PASS, "Empty container loading selection Passed");
            } else {
                test.log(Status.FAIL, "Empty container loading selection Failed");
            }

            TMSPageFactory.pf.containerUnloadingTerminalInputID.clear();
            WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.containerUnloadingTerminalInputID);
            Thread.sleep(1000);
            TMSPageFactory.pf.containerUnloadingTerminalInputID.click();
            Thread.sleep(2000);
            TMSPageFactory.pf.containerUnloadingTerminalInputID.sendKeys("Litro Gas Terminal ");
            Thread.sleep(4000);
            WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.containerUnloadingTerminalSearchID);
            TMSPageFactory.pf.containerUnloadingTerminalSearchID.click();
        }

//        if (TMSPageFactory.pf.containerUnloadingTerminalSearchID.isDisplayed()) {
//            System.out.println("1111111111111111111111111111");
//            TMSPageFactory.pf.containerUnloadingTerminalSearchID.click();
//        } else {
//            System.out.println("222222222222222222222222222");
//            TMSPageFactory.pf.emptyPortLoadingInputID.clear();
//            TMSPageFactory.pf.emptyPortLoadingInputID.click();
//            TMSPageFactory.pf.emptyPortLoadingInputID.sendKeys("Port of Hambanthota(PUBLIC) ");
//            WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.emptyPortLoadingSearchID);
//            TMSPageFactory.pf.emptyPortLoadingSearchID.click();
//            String selectedPortLoading1 = TMSPageFactory.pf.emptyPortLoadingInputID.getAttribute("value");
//            if (Objects.equals(StringUtils.isNotBlank(selectedPortLoading1), true) && Objects.equals(selectedPortLoading1, "Port of Hambanthota(PUBLIC) ")) {
//                test.log(Status.PASS, "Empty container loading selection Passed");
//            } else {
//                test.log(Status.FAIL, "Empty container loading selection Failed");
//            }
//
//            TMSPageFactory.pf.containerUnloadingTerminalInputID.clear();
//            WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.containerUnloadingTerminalInputID);
//            Thread.sleep(1000);
//            TMSPageFactory.pf.containerUnloadingTerminalInputID.click();
//            Thread.sleep(2000);
//            TMSPageFactory.pf.containerUnloadingTerminalInputID.sendKeys("Litro Gas Terminal ");
//            Thread.sleep(4000);
//            WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.containerUnloadingTerminalSearchID);
//            TMSPageFactory.pf.containerUnloadingTerminalSearchID.click();
//        }

        TMSPageFactory.pf.numberOfContainerInputID.sendKeys("1");
        String numberOfLoad = TMSPageFactory.pf.numberOfContainerInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(numberOfLoad), true)) {
            test.log(Status.PASS, "Number of load entering Passed");
        } else {
            test.log(Status.FAIL, "Number of load entering Failed");
        }

        TMSPageFactory.pf.shipmentDetailsInputID.click();
        TMSPageFactory.pf.shipmentDetailsSearchID.click();
        String selectedShipmentDetails = TMSPageFactory.pf.shipmentDetailsInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(selectedShipmentDetails), true)) {
            test.log(Status.PASS, "Shipment details entering Passed");
        } else {
            test.log(Status.FAIL, "Shipment details entering Failed");
        }

        TMSPageFactory.pf.customsChannelInputID.click();
        TMSPageFactory.pf.customChannelSearchID.click();
        String selectedChannel = TMSPageFactory.pf.customsChannelInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(selectedChannel), true)) {
            test.log(Status.PASS, "Custom channel selection Passed");
        } else {
            test.log(Status.FAIL, "Custom channel selection Failed");
        }

        String prevURL = WebDriverHelper.getWebDriver().getCurrentUrl();
        Thread.sleep(2000);
        TMSPageFactory.pf.containerDetailsNextBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportContainerDetailsSample);
        String currentURL = WebDriverHelper.getWebDriver().getCurrentUrl();
        if (Objects.equals(prevURL, currentURL)) {
            test.log(Status.FAIL, "<span style='color: red; font-weight: bold;'>Export Job container details completion test case scenarios - FAILED:</span>");
        } else {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Export Job container details completion test case scenarios - PASSED:</span>");
        }
    }

    public void clickFillContainerDataBtn()throws InterruptedException {
        TMSPageFactory.pf.exportLoadDetailsFillContainerDataBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportLoadDetailsSelectMethodBtnID);
        if (TMSPageFactory.pf.exportLoadDetailsSelectMethodBtnID.isDisplayed()) {
            test.log(Status.PASS, "Fill Container Data button functionality Passed");
        } else {
            test.log(Status.FAIL, "Fill Container Data button functionality Failed");
        }
    }

    public void selectSelectionMethodAndSize()throws InterruptedException {
        TMSPageFactory.pf.exportLoadDetailsSelectMethodBtnID.click();
        TMSPageFactory.pf.exportLoadDetailsSelectMethodSearchID.click();
        String selectedMethod = TMSPageFactory.pf.exportLoadDetailsSelectMethodBtnID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(selectedMethod), true) && Objects.equals(selectedMethod, " DRIVER ")) {
            test.log(Status.PASS, "Method selecting dropdown functionality Passed");
        } else {
            test.log(Status.FAIL, "Method selecting dropdown functionality Failed");
        }

        TMSPageFactory.pf.exportContainerDetailsTypeSizeInputID.click();
        TMSPageFactory.pf.exportContainerDetailsTypeSizeSearchID.click();
        String selectedTypeSize = TMSPageFactory.pf.exportContainerDetailsTypeSizeInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(selectedTypeSize), true) && Objects.equals(selectedTypeSize, " 40 ft. Dry Container ")) {
            test.log(Status.PASS, "Export Type and Size selection dropdown functionality Passed");
        } else {
            test.log(Status.FAIL, "Export type and size selection dropdown functionality Failed");
        }
    }

    public void expandContainerDetailsFirstActivity()throws InterruptedException {
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportContainerDetailsFirstActivityExpandID);
        Thread.sleep(2000);
        TMSPageFactory.pf.exportContainerDetailsFirstActivityExpandID.click();
        Thread.sleep(2000);
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportContainerDetailsFirstActivityEditBtnID);
        if (TMSPageFactory.pf.exportContainerDetailsFirstActivityEditBtnID.isDisplayed()) {
            test.log(Status.PASS, "First Activity expanding Passed");
        } else {
            test.log(Status.FAIL, "First activity expanding Failed");
        }
    }

    public void clickFirstActEditBtn()throws InterruptedException {
        TMSPageFactory.pf.exportContainerDetailsFirstActivityEditBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportContainerDetailsLocationBtnID);
        if (TMSPageFactory.pf.exportContainerDetailsLocationBtnID.isDisplayed()) {
            test.log(Status.PASS, "First activity edit button functionality Passed");
        } else {
            test.log(Status.FAIL, "First activity edit button functionality Failed");
        }
    }

    public void selectFirstActLocation()throws InterruptedException {
        TMSPageFactory.pf.exportFirstActLocationInputID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportFirstActLocationSearchBtnID);
        Thread.sleep(1500);
        TMSPageFactory.pf.exportFirstActLocationSearchBtnID.click();
    }

    public void selectDateAndTime()throws InterruptedException {
        TMSPageFactory.pf.exportFirstActDatePickerID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportFirstActFromDateSelectDateID);
        TMSPageFactory.pf.exportFirstActFromDateSelectDateID.click();
        TMSPageFactory.pf.exportFirstActTickBtnID.click();
        TMSPageFactory.pf.exportFirstActSaveBtnID.click();
        Thread.sleep(5000);
    }

    public void completeSecondAct()throws InterruptedException {
        TMSPageFactory.pf.exportSecondActExpandID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportSecondActEditBtnID);
        TMSPageFactory.pf.exportSecondActEditBtnID.click();
        TMSPageFactory.pf.exportSecondLocationInputBtnID.click();
        Thread.sleep(3000);
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportSecondLocationBtnSearchID);
        TMSPageFactory.pf.exportSecondLocationBtnSearchID.click();
        TMSPageFactory.pf.exportSecondLocationDatePickerID.click();
        TMSPageFactory.pf.exportSecondSecondFromDateBtnID.click();
        TMSPageFactory.pf.exportSecondSecondActTickBtnID.click();
        TMSPageFactory.pf.exportSecondActSaveBtnID.click();
        Thread.sleep(5000);
    }

    public void completeThirdAct()throws InterruptedException {
        TMSPageFactory.pf.exportThirdActExpandID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportThirdActEditBtnID);
        TMSPageFactory.pf.exportThirdActEditBtnID.click();
        TMSPageFactory.pf.exportThirdLocationInputBtnID.click();
        Thread.sleep(1000);
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportThirdLocationBtnSearchID);
        Thread.sleep(3000);
        TMSPageFactory.pf.exportThirdLocationBtnSearchID.click();
        TMSPageFactory.pf.exportThirdLocationDatePickerID.click();
        TMSPageFactory.pf.exportThirdSecondFromDateBtnID.click();
        TMSPageFactory.pf.exportThirdSecondActTickBtnID.click();
        TMSPageFactory.pf.exportThirdActSaveBtnID.click();
        Thread.sleep(8000);
    }

    public void clickContainerDetailsConfirmBtnID()throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(WebDriverHelper.getWebDriver(), 30);
        TMSPageFactory.pf.exportLoadDetailsConfirmBtnID.click();
        test.log(Status.PASS, "Container details Confirm button functionality Passed");
        Thread.sleep(5000);
    }

    public void clickDuplicateBtn()throws InterruptedException {
        for (int x = 0; x < 3; x++) {
            TMSPageFactory.pf.exportLoadDetailsDuplicateBtnID.click();
            Thread.sleep(1000);
            test.log(Status.PASS, "Truck load "+x+" duplicating Passed");
        }
        Thread.sleep(5000);
        test.log(Status.PASS, "Truck load overall duplication functionality Passed");
    }

    public void clickNextBtnCompleteLoadDetails()throws InterruptedException {
        TMSPageFactory.pf.exportLordDetailsNextBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJobSummaryPageVerifyID);
        Thread.sleep(5000);
        if (Objects.equals(TMSPageFactory.pf.exportLordDetailsNextBtnID.isEnabled(), true)) {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Export Job Load details completion test case scenarios - PASSED:</span>");
        } else {
            test.log(Status.FAIL, "<span style='color: red; font-weight: bold;'>Export Job load details completion test case scenarios - Failed:</span>");
        }
    }

    public void clickExportConfirmBtn()throws InterruptedException {
        TMSPageFactory.pf.exportJobSummaryConfirmButton.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJobSummaryPaymentTermDropdownID);
        Thread.sleep(1000);
        TMSPageFactory.pf.exportJobSummaryPaymentTermDropdownID.click();
        if (Objects.equals(TMSPageFactory.pf.exportJobSummaryRateCardInputID.isDisplayed(), true)) {
            test.log(Status.PASS, "Confirm button and Payment term drop down expand functionality Passed.");
        } else {
            test.log(Status.FAIL, "Confirm and payment term drop down functionality Passed");
        }

        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJobSummaryRateCardInputID);
        TMSPageFactory.pf.exportJobSummaryRateCardInputID.click();
        TMSPageFactory.pf.exportJobSummaryRateCardInputID.sendKeys("WJ-SATHOSA-COMM-1002");
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJobSummaryRateCardSearchID);
        TMSPageFactory.pf.exportJobSummaryRateCardSearchID.click();
        TMSPageFactory.pf.exportJobSummaryPaymentSelectionRadioBtnID.click();
        Thread.sleep(1500);
        TMSPageFactory.pf.exportJobSummaryJobBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportSchedulingVerifyID);
        if (Objects.equals(TMSPageFactory.pf.exportSchedulingVerifyID.isDisplayed(), true)) {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Export Job summary completion test case scenarios - PASSED:</span>");
        } else {
            test.log(Status.FAIL, "<span style='color: red; font-weight: bold;'>Export Job summary completion test case scenarios - FAILED:</span>");
        }
    }

    public void completeSchedulingProcess()throws InterruptedException {
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportSchedulingTruckLoadBtnID);
        if (Objects.equals(TMSPageFactory.pf.exportSchedulingTruckLoadBtnID.isDisplayed(), true)) {
            test.log(Status.PASS, "Truck load completely created and successfully appeared");
        } else {
            test.log(Status.FAIL, "Truck load completely not created and not appeared in the scheduling UI");
        }
        TMSPageFactory.pf.exportSchedulingTruckLoadBtnID.click();

        TMSPageFactory.pf.exportSchedulingAssignBtnId.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportScheduleAssignExternalToggle);
        TMSPageFactory.pf.exportAssignVehicleInputID.click();
        Thread.sleep(2000);
        TMSPageFactory.pf.exportVehicleAssignSearchID.click();
        String AssignedVehicle = TMSPageFactory.pf.exportAssignVehicleInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(AssignedVehicle), true)) {
            test.log(Status.PASS, "The user vehicle assign test case passed");
        } else {
            test.log(Status.FAIL, "The user vehicle assign test case Failed");
        }

        TMSPageFactory.pf.exportAssignDriverInputID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportAssignDriverSearchID);
        TMSPageFactory.pf.exportAssignDriverSearchID.click();
        String assignedDriver = TMSPageFactory.pf.exportAssignDriverInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(assignedDriver), true)) {
            test.log(Status.PASS, "The user vehicle assign driver assign test case passed");
        } else {
            test.log(Status.FAIL, "The user vehicle assign driver test case Failed");
        }

//        TMSPageFactory.pf.exportAssistantDriverInputID.click();
//        if (TMSPageFactory.pf.exportAssistantDriverInputID.isDisplayed()){
//            TMSPageFactory.pf.exportAssistantDriverSearchID.click();
//        } else {
//            String assignedAssistantDriver = TMSPageFactory.pf.exportAssistantDriverInputID.getAttribute("value");
//            if (Objects.equals(StringUtils.isNotBlank(assignedAssistantDriver), true)) {
//                test.log(Status.PASS, "The assistant driver assigning test case Passed");
//            } else {
//                test.log(Status.FAIL, "The assistant driver assigning test case Failed");
//            }
//        }

        TMSPageFactory.pf.exportAssignTrailerInputID.click();
        TMSPageFactory.pf.exportAssignTrailerSearchID.click();
        String assignedTrailer = TMSPageFactory.pf.exportAssignTrailerInputID.getAttribute("value");
        if (Objects.equals(StringUtils.isNotBlank(assignedTrailer), true)) {
            test.log(Status.PASS, "The truck trailer assigning test case Passed");
        } else {
            test.log(Status.FAIL, "The truck trailer assigning test case Failed");
        }
        TMSPageFactory.pf.exportAssignProcessSaveBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportSchedulingNotifyBtnID);
        Thread.sleep(5000);
        TMSPageFactory.pf.exportSchedulingNotifyBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportSchedulingNotifyYesBtnID);
        TMSPageFactory.pf.exportSchedulingNotifyYesBtnID.click();
        Thread.sleep(9000);
        if (Objects.equals(TMSPageFactory.pf.exportSchedulingTickMarkID.isDisplayed(), true)) {
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Export scheduling test cases - PASSED:</span>");
        } else {
            test.log(Status.FAIL, "<span style='color: red; font-weight: bold;'>Export scheduling test cases - FAILED:</span>");
        }
//        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportSchedulingTickMarkID);
        TMSPageFactory.pf.exportSchedulingJPMBtnID.click();
        Thread.sleep(7000);
    }

    public void expandFirstActJPM()throws InterruptedException {
        // first work order
        WebDriverHelper.getWebDriverHelper().waitForPageLoad();
        TMSPageFactory.pf.exportJPMFirstActExpandBtnID.click();
        Thread.sleep(4000);
        TMSPageFactory.pf.exportJPMFirstWOFirstActBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportJPMFirstWOFirstActOdometerInputID.sendKeys("100");
        TMSPageFactory.pf.exportFirstWOMarkAsDoneBtnID.click();
        Thread.sleep(8000);
        TMSPageFactory.pf.exportJPMFirstActExpandBtnID.click();

        // second work order
        TMSPageFactory.pf.exportJPMSecondWorkOrderExpandID.click();
        Thread.sleep(1000);
        WebDriverHelper.getWebDriverHelper().waitElementUntilClickable(TMSPageFactory.pf.exportSecondJPMSecondActTickBtnID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderTickBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(5000);
//        WebDriverHelper.getWebDriverHelper().waitElementUntilClickable(TMSPageFactory.pf.exportSecondJPMSecondActTickBtnID);
        TMSPageFactory.pf.exportSecondJPMSecondActTickBtnID.click();
        Thread.sleep(1000);
        // second work order 2nd activity
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMSecondWorkOrderExpandID.click();
        Thread.sleep(2000);
    }

    public void completeThirdWorkOrder()throws InterruptedException {
        TMSPageFactory.pf.exportJPMThirdWorkOrderExpandBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportJPMThirdWorkOrderFirstActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(4000);

        TMSPageFactory.pf.exportJPMThirdWorkOrderSecondActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportJPMFirstWOFirstActOdometerInputID.sendKeys("200");
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(5000);

        TMSPageFactory.pf.exportJPMThirdWorkOrderThirdActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMFirstWOFirstActOdometerInputID.sendKeys("6245");
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(5000);

        TMSPageFactory.pf.exportJPMThirdWorkOrderForthActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMThirdWorkOrderExpandBtnID.click();
        Thread.sleep(2000);
    }

    public void completeForthWorkOrder()throws InterruptedException {
        TMSPageFactory.pf.exportJPMForthWorkOrderExpandBtnID.click();
        Thread.sleep(1000);

        TMSPageFactory.pf.exportJPMForthWorkOrderFirstActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(3000);

        TMSPageFactory.pf.exportJPMForthWorkOrderSecondActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(3000);

        TMSPageFactory.pf.exportJPMForthWorkOrderExpandBtnID.click();
        Thread.sleep(5000);
    }

    public void completeFifthWorkOrder()throws InterruptedException {
        TMSPageFactory.pf.exportJPMFifthWorkOrderExpandBtnID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportJPMFifthWorkOrderFirstActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(6000);

//        TMSPageFactory.pf.exportJPMFifthWorkOrderExpandBtnID.click();
//        Thread.sleep(6000);
        TMSPageFactory.pf.exportJPMFifthWorkOrderSecondActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMFifthWorkOrderExpandBtnID.click();
        Thread.sleep(6000);
    }

    public void completeSixthWorkOrder()throws InterruptedException{
        TMSPageFactory.pf.exportJPMSixthWorkOrderExpandBtnID.click();
        Thread.sleep(6000);
        TMSPageFactory.pf.exportJPMSixthOrderFirstActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(6000);

        TMSPageFactory.pf.exportJPMSixthOrderSecondActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMSixthWorkOrderExpandBtnID.click();
        Thread.sleep(6000);
    }

    public void completeSeventhWorkOrder()throws InterruptedException{
        TMSPageFactory.pf.exportJPMSeventhWorkOrderExpandBtnID.click();
        Thread.sleep(6000);
        TMSPageFactory.pf.exportJPMSeventhOrderFirstActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(6000);

        TMSPageFactory.pf.exportJPMSevenOrderSecondActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(6000);

        TMSPageFactory.pf.exportJPMSevenOrderThirdActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMSeventhWorkOrderExpandBtnID.click();
        Thread.sleep(6000);
    }

    public void completeEightWorkOrder()throws InterruptedException{
        TMSPageFactory.pf.exportJPMEightWorkOrderExpandBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMEightOrderFirstActTickBtnID.click();
        Thread.sleep(1500);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(6000);

        TMSPageFactory.pf.exportJPMEightOrderSecondActTickBtnID.click();
        WebDriverHelper.getWebDriverHelper().waitPageLoad(TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMEightWorkOrderExpandBtnID.click();
        Thread.sleep(6000);
    }

    public void completeNinthWorkOrder()throws InterruptedException{
        TMSPageFactory.pf.exportJPMNinthWorkOrderExpandBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMNinthOrderFirstActTickBtnID.click();
        Thread.sleep(1500);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(6000);

        TMSPageFactory.pf.exportJPMNinthOrderSecondActTickBtnID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        TMSPageFactory.pf.exportJPMNinthWOFirstActOdometerInputID.sendKeys("300");
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(6000);

        TMSPageFactory.pf.exportJPMNinthOrderThirdActTickBtnID.click();
        Thread.sleep(2000);
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMNinthWorkOrderExpandBtnID.click();
        Thread.sleep(6000);
    }

    public void completeLastWorkOrder()throws InterruptedException{
        TMSPageFactory.pf.exportJPMTenthWorkOrderExpandBtnID.click();
        Thread.sleep(3000);
        TMSPageFactory.pf.exportJPMTenthOrderFirstActTickBtnID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDatePickerID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderDateNumberID.click();
        TMSPageFactory.pf.exportJPMSecondWorkOrderConfirmID.click();
        TMSPageFactory.pf.exportJPMNinthWOFirstActOdometerInputID.sendKeys("400");
        Thread.sleep(1000);
        TMSPageFactory.pf.exportSecondJPMWorkOrderMarkAsDoneBtnID.click();
        Thread.sleep(6000);
        if (Objects.equals(TMSPageFactory.pf.finalPercentageElement.getAttribute("Value"), "100")){
            test.log(Status.PASS, "<span style='color: green; font-weight: bold;'>Export All JPM Work Order test cases - PASSED:</span>");
        } else {
            test.log(Status.FAIL, "<span style='color: green; font-weight: bold;'>Export All JPM Work Order test cases - FAILED:</span>");
        }
    }

    public void completeCreateInvoice()throws InterruptedException{

    }
}
