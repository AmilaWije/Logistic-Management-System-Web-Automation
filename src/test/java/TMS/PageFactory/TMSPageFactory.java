package TMS.PageFactory;

import Utility.WebDriverHelper;
import org.apache.pdfbox.contentstream.operator.text.ShowText;
import org.apache.poi.sl.extractor.SlideShowExtractor;
import org.apache.poi.sl.usermodel.SlideShowProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TMSPageFactory {

    public static TMSPageFactory pf = PageFactory.initElements(WebDriverHelper.getWebDriver(), TMSPageFactory.class);

    @FindBy(how = How.TAG_NAME, using = "body")
    public WebElement bodyTabName;
//  Login Form
    @FindBy(how = How.ID, using = "mat-input-0")
    public WebElement userNameID;
    @FindBy(how = How.ID, using = "mat-input-1")
    public WebElement passwordID;
    @FindBy(how = How.XPATH, using = "/html/body/hmt-root/hmt-login/div/div/div[3]/button")
    public WebElement loginBtnID;

    // Domestic
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'CREATE NEW JOB FILE')]")
    public WebElement domesticCreateBtnID;

    @FindBy(how = How.ID, using = "mat-input-3")
    public WebElement jobFileNameID;

    @FindBy(how = How.ID, using = "mat-input-37")
    public WebElement selectGroupDropdownID;

    @FindBy(how = How.ID, using = "mat-input-5")
    public WebElement cusReferenceNumberID;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-0\"]/hmt-create-job-file/div/div/div[2]/form/div[2]/div[2]/mat-form-field")
    public WebElement operationDropdownID;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Default')]")
    public WebElement operationsDefaultSelectID;

    @FindBy(how = How.ID, using = "mat-input-6")
    public WebElement operationInputID;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-0\"]/hmt-create-job-file/div/div/div[2]/form/div[4]/div[2]/div[3]")
    public WebElement jobTypeID;

    @FindBy(how = How.ID, using = "mat-radio-3")
    public WebElement loadTypeBtn;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Create')]")
    public WebElement domCreateBtnID;
    //domestic second page
    @FindBy(how = How.ID, using = "mat-input-16")
    public WebElement partiesCustomerID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sathosa')]")
    public WebElement partiesCustomerSearchID;
    @FindBy(how = How.ID, using = "mat-input-16")
    public WebElement partiesCustomerInputID;

    @FindBy(how = How.ID, using = "mat-input-17")
    public WebElement partiesShipperID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'RAS RANWALA')]")
    public WebElement partiesShipperSearchID;

    @FindBy(how = How.ID, using = "mat-input-18")
    public WebElement partiesConsigneeID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Olympus (Pvt) Ltd ')]")
    public WebElement partiesConsigneeSearchID;

    @FindBy(how = How.ID, using = "mat-input-12")
    public WebElement partiesNumberOfLoadsID;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Next') and @class='mat-button-wrapper']")
    public WebElement truckDetailsNextBtnID;

    //Container details
    @FindBy(how = How.XPATH, using = "//span[contains(text(), ' FILL Load DATA* ') and @class='mat-button-wrapper']")
    public WebElement fillDataBtnID;

    @FindBy(how = How.XPATH, using = "//div[@class='scroll']")
    public WebElement scrollBtn;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-expansion-panel-header-5']/span/div/div/div[1]/div[1]")
    public WebElement expandFirstActivityID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Edit') and @class='mat-button-wrapper']")
    public WebElement actEditBtnID;
    @FindBy(how = How.ID, using = "mat-input-32")
    public WebElement locationDropdownID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'CVT - Orugodawatta(PUBLIC)') and @class='mat-option-text']")
    public WebElement locationDropdownSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-dialog-2']/hmt-add-activity/div/div[2]/div/form/div[2]/div[2]/div/mat-form-field[1]/div/div[1]/div[2]/mat-datepicker-toggle/button")
    public WebElement dateTimePickerID;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-datepicker-4']/div/ngx-mat-month-view/table/tbody/tr[3]/td[6]/div")
    public WebElement pickDateNumberID;
    @FindBy(how = How.XPATH, using = "//mat-icon[contains(text(), 'done') and @class='mat-icon notranslate material-icons mat-icon-no-color']")
    public WebElement tickBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-input-28\"]")
    public WebElement dateDropdownInputID;
    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator save-btn mat-flat-button mat-button-base mat-primary']")
    public WebElement saveActBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-expansion-panel-header-37\"]/span/div/div/div[1]/div[1]")
    public WebElement secondActSuccessTestID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-expansion-panel-header-19\"]/span/div/div/div[1]/div")
    public WebElement jobDetailsFirstActSuccessTextID;

    @FindBy(how = How.XPATH, using = "//*[@id='mat-expansion-panel-header-20']/span/div/div/div[1]/div[1]")
    public WebElement expandSecondActivityID;
    @FindBy(how = How.XPATH, using = "//*[@id='cdk-accordion-child-20']/div/div[4]/button[3]/span")
    public WebElement secondActEditButton;
    @FindBy(how = How.ID, using = "mat-input-40")
    public WebElement secondActLocationID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Green Lanka Yard (PUBLIC)') and @class='mat-option-text']")
    public WebElement secondActLocationSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-3\"]/hmt-add-activity/div/div[2]/div/form/div[2]/div[2]/div/mat-form-field[1]/div/div[1]/div[2]/mat-datepicker-toggle/button")
    public WebElement secondActDatePickerID;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-datepicker-7']/div/ngx-mat-month-view/table/tbody/tr[3]/td[7]/div")
    public WebElement secondActDateNumberPickID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-input-36\"]")
    public WebElement secondActDateInputID;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'CONFIRM')]")
    public WebElement shippingLineConfirmationBtnID;

    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator duplicate mat-button mat-button-base mat-accent ng-star-inserted']")
    public WebElement truckLoadDuplicateBtnID;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Next')]")
    public WebElement loadDetailsNextBtnID;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Confirm')]")
    public WebElement jobSummaryConfirmBtnID;
    @FindBy(how = How.XPATH, using = "//h4[contains(text(), 'Select a Contract and a Payment Term')]")
    public WebElement paymentTermBtnID;
    @FindBy(how = How.ID, using = "mat-input-43")
    public WebElement rateCardBtnID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),' SATHOSA-COMMITE-1000 ')]")
    public WebElement rateCardNameID;
    @FindBy(how = How.XPATH, using = "//*[@id='radioImmediatelyCompletion']/label/div[2]")
    public WebElement paymentImmediateBtnID;
    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator save-exit-btn mat-button mat-button-base']")
    public WebElement paymentTermSaveBtnID;

    //Scheduling
    @FindBy(how = How.XPATH, using = "//div[@class='leg-detail font-size-12 wrap-text' and contains(text(), ' Load 1')]")
    public WebElement loadCardID;
    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator button-bold assign-button mat-flat-button mat-button-base mat-primary']")
    public WebElement assignBtnID;
    @FindBy(how = How.ID, using = "mat-input-46")
    public WebElement assignVehicleID;
    @FindBy(how = How.XPATH, using = "//mat-option[@class='mat-option mat-focus-indicator select-label ng-star-inserted'][1]")
    public WebElement assignVehicleSearchID;
    @FindBy(how = How.ID, using = "mat-input-47")
    public WebElement assignDriverDropdownID;
    @FindBy(how = How.XPATH, using = "//mat-option[@class='mat-option mat-focus-indicator select-label ng-star-inserted'][1]")
    public WebElement assignDriverSearchID;
    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator button-dimensions save mat-raised-button mat-button-base mat-primary'][1]")
    public WebElement assigneesSaveBtnID;
    @FindBy(how = How.XPATH, using = "//span[@class='mat-button-wrapper' and contains(text(), 'Notify')]")
    public WebElement notifyBtnID;
    @FindBy(how = How.XPATH, using = "//span[@class='mat-button-wrapper' and contains(text(), 'Yes')]")
    public WebElement confirmNotifyYesBtnID;
    @FindBy(how = How.XPATH, using = "//span[@class='mat-button-wrapper' and contains(text(), 'JPM ')]")
    public WebElement controlTowerBtnID;

    //JPM
    // First Work Order
    @FindBy(how = How.ID, using = "collapse-button")
    public WebElement firstJPMActivityID;
    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator mark-as-done mat-mini-fab mat-button-base mat-accent'][1]")
    public WebElement firstActCompleteButtonID;
    @FindBy(how = How.XPATH, using = "//input[@id='mat-input-51']")
    public WebElement firstJPMActCalendarBtnID;
    @FindBy(how = How.ID, using = "mat-input-53")
    public WebElement odometerInputID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Mark as done')]")
    public WebElement markAsDoneBtnID;
    //second work order
    @FindBy(how = How.XPATH, using = "//button[@class='mat-focus-indicator mark-as-done mat-mini-fab mat-button-base mat-accent']")
    public WebElement startJourneyID;
    @FindBy(how = How.XPATH, using = "//*[@id='mat-input-54']")
    public WebElement startJourneyDateInputID;
    @FindBy(how = How.XPATH, using = "//*[@id='activity-1']/div/div/div[3]/div[5]/hmt-task-line-item/div/div[1]/div[1]/button")
    public WebElement endJourneyBtnID;
    @FindBy(how = How.ID, using = "mat-input-56")
    public WebElement endJourneyDateInputID;
    @FindBy(how = How.XPATH, using = "//*[@id='activity-1']/div/div[1]/div[2]/div[2]/button[3]/span[1]")
    public WebElement secondWorkOrderExpandBtnID;
    //Third work order
    @FindBy(how = How.XPATH, using = "//*[@id='activity-2']/div/div[1]/div[2]/div[2]/button[3]/span[1]")
    public WebElement thirdWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id='activity-2']/div/div[1]/div[3]/div[4]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement enterThirdLocationBtnID;
    @FindBy(how = How.ID, using = "mat-input-58")
    public WebElement enterThirdLocationDateInputID;
    @FindBy(how = How.XPATH, using = "//*[@id='activity-2']/div/div[1]/div[3]/div[5]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement enterStartOrderMeterReadingBtnID;
    @FindBy(how = How.ID, using = "mat-input-60")
    public WebElement enterStartOrderMeterReadingDateInputID;
    @FindBy(how = How.ID, using = "mat-input-62")
    public WebElement enterStartOrderMeterID;
    @FindBy(how = How.XPATH, using = "//*[@id='activity-2']/div/div[1]/div[3]/div[6]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement cargoLoadingStartBtnID;
    @FindBy(how = How.ID, using = "mat-input-63")
    public WebElement cargoLoadingDateInputBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id='activity-2']/div/div[1]/div[3]/div[7]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement cargoLoadingCompletedBtnId;
    @FindBy(how = How.ID, using = "mat-input-65")
    public WebElement cargoLoadingCompleteDateInputBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id='activity-2']/div/div[1]/div[3]/div[8]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement thirdWorkOrderExitLocationBtnID;
    @FindBy(how = How.ID, using = "mat-input-67")
    public WebElement thirdWorOrderExitLocationDateInputID;
    // forth work order
    @FindBy(how = How.XPATH, using = "//*[@id='activity-3']/div/div[1]/div[2]/div[2]/button[3]/span[1]")
    public WebElement forthWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"activity-3\"]/div/div[1]/div[3]/div[4]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement forthWorkOrderStartJourneyBtnID;
    @FindBy(how = How.ID, using = "mat-input-69")
    public WebElement forthWorkOrderStartJourneyDateInputID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"activity-3\"]/div/div[1]/div[3]/div[5]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement forthWorkOrderEndJourneyBtnID;
    @FindBy(how = How.ID, using = "mat-input-71")
    public WebElement forthWorkOrderEndJourneyDateInputID;
    // fifth work order
    @FindBy(how = How.XPATH, using = "//*[@id='activity-4']/div/div[1]/div[2]/div[2]/button[3]/span[1]")
    public WebElement fifthWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"activity-4\"]/div/div[1]/div[3]/div[4]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement fifthWorkOrderEnterLocationBtnID;
    @FindBy(how = How.ID, using = "mat-input-73")
    public WebElement fifthWorkOrderEnterLocationDateInputID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"activity-4\"]/div/div[1]/div[3]/div[5]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement fifthWorkOrderCargoUnloadingStartedBtnID;
    @FindBy(how = How.ID, using = "mat-input-75")
    public WebElement fifthWorkOrderCargoUnloadingDateInputID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"activity-4\"]/div/div[1]/div[3]/div[6]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement fifthWorkOrderCargoUnloadingCompletedBtnID;
    @FindBy(how = How.ID, using = "mat-input-77")
    public WebElement fifthWorkOrderCargoUnloadingCompletedDateInputID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"activity-4\"]/div/div[1]/div[3]/div[7]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement fifthWorkOrderEnterEndOdometerReadingBtnID;
    @FindBy(how = How.ID, using = "mat-input-79")
    public WebElement fifthWorkOrderEnterEndOdometerDateInputID;
    @FindBy(how = How.ID, using = "mat-input-81")
    public WebElement fifthWorkOrderEnterEndOdometerInputID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"activity-4\"]/div/div[1]/div[3]/div[8]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement fifthWorkOrderExitLocationBtnID;
    @FindBy(how = How.ID, using = "mat-input-82")
    public WebElement fifthWorkOrderExitLocationDateInputID;
    // end work order
    @FindBy(how = How.XPATH, using = "//*[@id='activity-5']/div/div[1]/div[2]/div[2]/button[3]/span[1]")
    public WebElement endWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"activity-5\"]/div/div/div[3]/div[4]/hmt-task-line-item/div/div[1]/div[1]/button/span/div/mat-icon")
    public WebElement endWorkOrderEndOdometerBtnID;
    @FindBy(how = How.ID, using = "mat-input-84")
    public WebElement endWorkOrderEndOdometerDateInputID;
    @FindBy(how = How.ID, using = "mat-input-86")
    public WebElement endWorkOrderEndOdometerOdometerInputID;
    // view update invoice information
    @FindBy(how = How.XPATH, using = "//span[contains(text(),' View Update Invoice Information ')]")
    public WebElement viewUpdateInvoiceInformationBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-radio-45\"]/label/div[2]")
    public WebElement completeTripOdometerBtnID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    public WebElement updateInvoiceInformationSaveBtnID;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'CONTRACT DETAILS')]")
    public WebElement updateContractInvoiceTabBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-control-tower/div/div[1]/hmt-container-pane/div/div[1]/hmt-job-details/div[1]")
    public WebElement createdJobName;

    // Invoice
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav/div/ul/li[9]")
    public WebElement invoiceSideNav;
    // Invoice internal
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-invoice-management/div/div[1]/mat-list/mat-list[1]/mat-list-item[2]/div/div[3]")
    public WebElement internalCommitmentContract;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-tab-content-8-0\"]/div/div/div/hmt-contract-organization[1]/div/mat-expansion-panel")
    public WebElement commitmentContractExpandBtnID;
    @FindBy(how = How.ID, using = "mat-input-123")
    public WebElement commitmentContractSearchBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cdk-accordion-child-181\"]/div/div/div[2]/div[6]/button/span")
    public WebElement commitmentContractViewBtnID;

    // Export ---------------
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-0\"]/hmt-create-job-file/div/div/div[2]/form/div[4]/div[2]/div[2]")
    public WebElement exportJobTypeBoxID;
    @FindBy(how = How.ID, using = "mat-radio-2")
    public WebElement selectFCL;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-wizard/div/div[1]/div[2]/hmt-job-file/div[2]/hmt-dynamic-form/form/div[1]/div/div[2]/div/div/div/hmt-form-drop-down/mat-form-field/div[1]/div/div/input")
    public WebElement exportPartiesCustomerInputID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Sathosa')]")
    public WebElement exportCustomerSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-wizard/div/div[1]/div[2]/hmt-job-file/div[2]/hmt-dynamic-form/form/div[1]/div/div[2]/div[1]/div[3]/div/hmt-form-drop-down/mat-form-field/div/div/div/input")
    public WebElement exportShipperInputID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'RAS RANWALA')]")
    public WebElement exportShipperSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-wizard/div/div[1]/div[2]/hmt-job-file/div[2]/hmt-dynamic-form/form/div[2]/div/div[2]/div/div[1]/div/hmt-form-drop-down/mat-form-field/div/div/div/input")
    public WebElement emptyContainerPickupInputID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Green Lanka Yard')]")
    public WebElement emptyContainerPickupSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-wizard/div/div[1]/div[2]/hmt-job-file/div[2]/hmt-dynamic-form/form/div[2]/div/div[2]/div/div[2]/div/hmt-form-drop-down/mat-form-field/div/div/div/input")
    public WebElement emptyPortLoadingInputID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Port of Hambanthota(PUBLIC) ')]")
    public WebElement emptyPortLoadingSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-wizard/div/div[1]/div[2]/hmt-job-file/div[2]/hmt-dynamic-form/form/div[2]/div/div[2]/div/div[3]/div/hmt-form-drop-down/mat-form-field/div/div/div/input")
    public WebElement containerUnloadingTerminalInputID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Litro Gas Terminal ')]")
    public WebElement containerUnloadingTerminalSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-wizard/div/div[1]/div[2]/hmt-job-file/div[2]/hmt-dynamic-form/form/div[2]/div/div[2]/div[2]/div[1]/hmt-form-input/mat-form-field/div/div/div/input")
    public WebElement numberOfContainerInputID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-wizard/div/div[1]/div[2]/hmt-job-file/div[2]/hmt-dynamic-form/form/div[2]/div/div[2]/div[2]/div[2]//div/div/div/input")
    public WebElement shipmentDetailsInputID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'BOI ')]")
    public WebElement shipmentDetailsSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-wizard/div/div[1]/div[2]/hmt-job-file/div[2]/hmt-dynamic-form/form/div[2]/div/div[2]/div[2]/div[3]//div/div/div/input")
    public WebElement customsChannelInputID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'GREEN ')]")
    public WebElement customChannelSearchID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Next')]")
    public WebElement containerDetailsNextBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-toggle\"]/mat-sidenav-container/mat-sidenav-content/div/hmt-wizard/div/div[1]/div[3]/div/hmt-validation-message-card/div/div/p")
    public WebElement exportContainerDetailsSample;
    // export load details
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-expansion-panel-header-0\"]/span/div/div/button[1]")
    public WebElement exportLoadDetailsFillContainerDataBtnID;
    @FindBy(how = How.XPATH, using = "//*[@class='header-button-group']/button[2]/span")
    public WebElement exportLoadDetailsDuplicateBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-expansion-panel-header-0\"]/span/div/div/button[3]")
    public WebElement exportLoadDetailsRemoveBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-1\"]/hmt-add-container-info/div/div[2]/div/form/div/div/div[2]/div/div[1]/div[2]/mat-form-field[1]/div/div/div/mat-select/div/div")
    public WebElement exportLoadDetailsSelectMethodBtnID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), ' DRIVER ')]")
    public WebElement exportLoadDetailsSelectMethodSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-1\"]/hmt-add-container-info/div/div[2]/div/form/div/div/div[2]/div/div[1]/div[2]/mat-form-field[2]/div/div/div/mat-select/div/div")
    public WebElement exportContainerDetailsTypeSizeInputID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), ' 40 ft. Dry Container ')]")
    public WebElement exportContainerDetailsTypeSizeSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-1\"]/hmt-add-container-info/div/div[2]/div/form/div/div/div[2]/div/div[5]/hmt-activity-box/div/mat-expansion-panel/mat-expansion-panel-header/span/div/div/div/div")
    public WebElement exportContainerDetailsFirstActivityExpandID;
    @FindBy(how = How.XPATH, using = "//div[@class='custom-channel-container ng-star-inserted']/hmt-activity-box/div/mat-expansion-panel/div/div/div[4]/button[3]/span")
    public WebElement exportContainerDetailsFirstActivityEditBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-2\"]/hmt-add-activity/div/div[2]/div/form/div[1]/div[2]/div/mat-form-field[2]/div/div/div/label/input")
    public WebElement exportContainerDetailsLocationBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='location-row']/div[2]/div[1]/mat-form-field[2]/div/div/div/label")
    public WebElement exportFirstActLocationInputID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cdk-overlay-14\"]/div/mat-option[1]/span")
    public WebElement exportFirstActLocationSearchBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-2\"]/hmt-add-activity/div/div[2]/div/form/div[2]/div[2]/div/mat-form-field[1]/div/div/div[2]")
    public WebElement exportFirstActDatePickerID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-datepicker-10\"]/div/ngx-mat-month-view/table/tbody/tr[2]/td[2]")
    public WebElement exportFirstActFromDateSelectDateID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-datepicker-10\"]/div/ngx-mat-month-view/table/tbody/tr[2]/td[3]")
    public WebElement exportFistActToDateSelectID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cdk-overlay-15\"]/ngx-mat-datetime-content/div[2]/button/span/mat-icon")
    public WebElement exportFirstActTickBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-2\"]/hmt-add-activity/div/div[3]/button[2]")
    public WebElement exportFirstActSaveBtnID;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-1\"]/hmt-add-container-info/div/div[2]/div/form/div/div/div[2]/div/div[6]/hmt-activity-box/div/mat-expansion-panel/mat-expansion-panel-header/span/div/div/div/div")
    public WebElement exportSecondActExpandID;
    @FindBy(how = How.XPATH, using = "//div[@class='custom-channel-container ng-star-inserted'][2]/hmt-activity-box/div/mat-expansion-panel/div/div/div[4]/button[3]/span")
    public WebElement exportSecondActEditBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-3\"]/hmt-add-activity/div/div[2]/div/form/div[1]/div[2]/div/mat-form-field[2]/div/div/div/label/input")
    public WebElement exportSecondLocationInputBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-autocomplete-19\"]/mat-option/span")
    public WebElement exportSecondLocationBtnSearchID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-3\"]/hmt-add-activity/div/div[2]/div/form/div[2]/div[2]/div/mat-form-field/div/div/div[2]")
    public WebElement exportSecondLocationDatePickerID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-datepicker-13\"]/div/ngx-mat-month-view/table/tbody/tr[2]/td[3]")
    public WebElement exportSecondSecondFromDateBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cdk-overlay-19\"]/ngx-mat-datetime-content/div[2]/button/span")
    public WebElement exportSecondSecondActTickBtnID;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-3\"]/hmt-add-activity/div/div[3]/button[2]")
    public WebElement exportSecondActSaveBtnID;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-1\"]/hmt-add-container-info/div/div[2]/div/form/div/div/div[2]/div/div[7]/hmt-activity-box/div/mat-expansion-panel/mat-expansion-panel-header/span/div/div/div/div")
    public WebElement exportThirdActExpandID;
    @FindBy(how = How.XPATH, using = "//div[@class='custom-channel-container ng-star-inserted'][3]/hmt-activity-box/div/mat-expansion-panel/div/div/div[4]/button[3]/span")
    public WebElement exportThirdActEditBtnID;
    @FindBy(how = How.XPATH, using = "//*[@class='location']/div/mat-form-field[2]/div/div/div/label/input")
    public WebElement exportThirdLocationInputBtnID;
    @FindBy(how = How.XPATH, using = "//*[@class=\"cdk-overlay-pane\"]/div/mat-option/span")
    public WebElement exportThirdLocationBtnSearchID;
    @FindBy(how = How.XPATH, using = "//*[@class=\"key-dates-row\"]/div[2]/div/mat-form-field/div/div/div[2]/mat-datepicker-toggle/button")
    public WebElement exportThirdLocationDatePickerID;
    @FindBy(how = How.XPATH, using = "//*[@class=\"mat-calendar-content\"]/ngx-mat-month-view/table/tbody/tr[2]/td[4]")
    public WebElement exportThirdSecondFromDateBtnID;
    @FindBy(how = How.XPATH, using = "//*[@class='cdk-overlay-pane mat-datepicker-popup']/ngx-mat-datetime-content/div[2]/button/span")
    public WebElement exportThirdSecondActTickBtnID;
    @FindBy(how = How.XPATH, using = "//*[@class='container-bottom']/button[2]/span")
    public WebElement exportThirdActSaveBtnID;
    @FindBy(how = How.XPATH, using = "//*[@class='button-row-column-2']/button")
    public WebElement exportLoadDetailsConfirmBtnID;
    @FindBy(how = How.XPATH, using = "//*[@class='button-group']/button[3]/span")
    public WebElement exportLordDetailsNextBtnID;

    // export job summary page
    @FindBy(how = How.XPATH, using = "//h2[contains(text(), 'JOB SUMMARY')]")
    public WebElement exportJobSummaryPageVerifyID;
    @FindBy(how = How.XPATH, using = "//div[@class='button-group']/button[4]/span")
    public WebElement exportJobSummaryConfirmButton;
    @FindBy(how = How.XPATH, using = "//div[@class='main-sec']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/h4")
    public WebElement exportJobSummaryPaymentTermDropdownID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane custom-dialog-container']/mat-dialog-container/hmt-manage-rate-card/div/mat-accordion/mat-expansion-panel/div/div/div[2]/form/mat-form-field/div/div/div/input")
    public WebElement exportJobSummaryRateCardInputID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-connected-position-bounding-box']/div/div/mat-option/span")
    public WebElement exportJobSummaryRateCardSearchID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane custom-dialog-container']/mat-dialog-container/hmt-manage-rate-card/div/mat-accordion/mat-expansion-panel/div/div/div[2]/div/hmt-payment-terms/div/form/mat-radio-group/div[2]/mat-radio-button/label/div[1]")
    public WebElement exportJobSummaryPaymentSelectionRadioBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane custom-dialog-container']/mat-dialog-container/hmt-manage-rate-card/div/mat-accordion/mat-expansion-panel/div/div/div[3]/button/span")
    public WebElement exportJobSummaryJobBtnID;

    //export scheduling
    @FindBy(how = How.XPATH, using = "//div[@class='tab-view']/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]/div")
    public WebElement exportSchedulingVerifyID;
    @FindBy(how = How.XPATH, using = "//div[@class='container-grid-item']/hmt-leg/div/div/div[2]")
    public WebElement exportSchedulingTruckLoadBtnID;
    @FindBy(how = How.XPATH, using ="//div[@class='sub-container-details']/div[2]/button[4]/span")
    public WebElement exportSchedulingAssignBtnId;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane']/mat-dialog-container/hmt-assign-schedule/div/div[2]/form/div/div/mat-slide-toggle/label/div/input")
    public WebElement exportScheduleAssignExternalToggle;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane']/mat-dialog-container/hmt-assign-schedule/div/div[2]/form/div[2]/div/div/mat-form-field/div/div/div/input")
    public WebElement exportAssignVehicleInputID;
    @FindBy(how = How.XPATH, using = "//div[@class='mat-autocomplete-panel mat-autocomplete ng-star-inserted mat-autocomplete-visible']/mat-option/span")
    public WebElement exportVehicleAssignSearchID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane']/mat-dialog-container/hmt-assign-schedule/div/div[2]/form/div[2]/div/div[2]/mat-form-field/div/div/div/input")
    public WebElement exportAssignDriverInputID;
    @FindBy(how = How.XPATH, using = "//div[@class='mat-autocomplete-panel mat-autocomplete ng-star-inserted mat-autocomplete-visible']/mat-option/span")
    public WebElement exportAssignDriverSearchID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane']/mat-dialog-container/hmt-assign-schedule/div/div[2]/form/div[2]/div/div[3]/mat-form-field/div/div/div/input")
    public WebElement exportAssistantDriverInputID;
    @FindBy(how = How.XPATH, using = "//div[@class='mat-autocomplete-panel mat-autocomplete ng-star-inserted mat-autocomplete-visible']/mat-option/span")
    public WebElement exportAssistantDriverSearchID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane']/mat-dialog-container/hmt-assign-schedule/div/div[2]/form/div[2]/div/div[4]/mat-form-field/div/div/div/input")
    public WebElement exportAssignTrailerInputID;
    @FindBy(how = How.XPATH, using = "//div[@class='mat-autocomplete-panel mat-autocomplete ng-star-inserted mat-autocomplete-visible']/mat-option/span")
    public WebElement exportAssignTrailerSearchID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane']/mat-dialog-container/hmt-assign-schedule/div/div[2]/form/div[3]/div[2]/button/span")
    public WebElement exportAssignProcessSaveBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='container-details']/div[5]/div[2]/button[5]/span")
    public WebElement exportSchedulingNotifyBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-global-overlay-wrapper']/div/mat-dialog-container/hmt-alert-dialog/div/div[3]/button[2]/span")
    public WebElement exportSchedulingNotifyYesBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='container-grid-item']/hmt-leg/div/div/div[3]")
    public WebElement exportSchedulingTickMarkID;
    @FindBy(how = How.XPATH, using = "//div[@class='footer-container ng-star-inserted']/div[3]/div/button[4]/span")
    public WebElement exportSchedulingJPMBtnID;

    // JPM
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMFirstActExpandBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='time common-dimensions']/span[2]")
    public WebElement exportJPMCompleteTimeDimensionID;
    // first act
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMFirstWOFirstActBtnID;
    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Mark as done')]")
    public WebElement exportFirstWOMarkAsDoneBtnID;
    // second work order
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[2]/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMSecondWorkOrderExpandID;
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[2]/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMSecondWorkOrderTickBtnID;
    // ----------- common use in JPM
    @FindBy(how = How.XPATH, using = "//div[@class='mark-as-done-form']/form/div/mat-form-field/div/div/div[2]/mat-datepicker-toggle")
    public WebElement exportJPMSecondWorkOrderDatePickerID;
    @FindBy(how = How.XPATH, using = "//table[@class='mat-calendar-table']/tbody/tr[2]/td[3]")
    public WebElement exportJPMSecondWorkOrderDateNumberID;
    @FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-pane mat-datepicker-popup']/ngx-mat-datetime-content/div[2]/button/span")
    public WebElement exportJPMSecondWorkOrderConfirmID;
    @FindBy(how = How.XPATH, using = "//div[@class='mark-as-done-form']/form/hmt-dynamic-form/form/div/hmt-form-input/mat-form-field/div/div/div/input")
    public WebElement exportJPMFirstWOFirstActOdometerInputID;
    @FindBy(how = How.XPATH, using = "//mat-dialog-content[@class='mat-dialog-content full-height']/div/div/div[3]/div[2]/button[2]/span")
    public WebElement exportSecondJPMWorkOrderMarkAsDoneBtnID;
    // ----------------- common use in JPM
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[2]/div/div[3]/div[5]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportSecondJPMSecondActTickBtnID;
    //Third work Order
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[3]/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMThirdWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[3]/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMThirdWorkOrderFirstActTickBtnID;
    // second activity
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[3]/div/div[3]/div[5]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMThirdWorkOrderSecondActTickBtnID;
    // Third activity
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[3]/div/div[3]/div[6]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMThirdWorkOrderThirdActTickBtnID;
    // Forth Activity
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[3]/div/div[3]/div[7]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMThirdWorkOrderForthActTickBtnID;

    // Forth work order
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[4]/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMForthWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[4]/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMForthWorkOrderFirstActTickBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[4]/div/div[3]/div[5]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMForthWorkOrderSecondActTickBtnID;

    //Fifth work order
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[5]/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMFifthWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[5]/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMFifthWorkOrderFirstActTickBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[5]/div/div[3]/div[5]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMFifthWorkOrderSecondActTickBtnID;

    //Sixth work order
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[6]/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMSixthWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[6]/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMSixthOrderFirstActTickBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[6]/div/div[3]/div[5]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMSixthOrderSecondActTickBtnID;

    //seventh work order
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[7]/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMSeventhWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[7]/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMSeventhOrderFirstActTickBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[7]/div/div[3]/div[5]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMSevenOrderSecondActTickBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[7]/div/div[3]/div[6]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMSevenOrderThirdActTickBtnID;

    //eight work order
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[8]/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMEightWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[8]/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMEightOrderFirstActTickBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[8]/div/div[3]/div[5]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMEightOrderSecondActTickBtnID;

    //ninth work order
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[9]/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMNinthWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[9]/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMNinthOrderFirstActTickBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[9]/div/div[3]/div[5]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMNinthOrderSecondActTickBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='mark-as-done-form']/form/hmt-dynamic-form/form/div/hmt-form-input/mat-form-field/div/div/div/input")
    public WebElement exportJPMNinthWOFirstActOdometerInputID;
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[9]/div/div[3]/div[6]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMNinthOrderThirdActTickBtnID;

    //last work order
    @FindBy(how = How.XPATH, using = "//div[@class='navigation-component']/div[2]/div/hmt-major-task/div/div[10]/div/div[2]/div[2]/button[3]/span")
    public WebElement exportJPMTenthWorkOrderExpandBtnID;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll-box ng-star-inserted']/div/hmt-major-task/div/div[10]/div/div[3]/div[4]/hmt-task-line-item/div/div/div/button/span")
    public WebElement exportJPMTenthOrderFirstActTickBtnID;

    // Job completion percentage
    @FindBy(how = How.XPATH, using = "//div[@class='panel selected-background']/div[2]/div[2]/div/div/mat-progress-spinner")
    public WebElement finalPercentageElement;

    // create invoice using view update invoice information
    @FindBy(how = How.XPATH, using = "")
    public WebElement updateInvoiceInformationBtn;
}
