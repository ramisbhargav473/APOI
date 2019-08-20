package CRM.MainPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author jteja
 *
 */
public class AgreementIndexLocators {
	
	/********************** BreadCrumb Container **************************************/

	@FindBy(css="div[class='bread_crumbs_container'] button")
	public WebElement newAgreement_Button;
	
	@FindBy(css="div[class='bread_crumbs_container'] div[class='title_container'] div[class='bread_crumbs'] a")
	public WebElement home_Link;
	
	/********************** Amazon Search Filter **************************************/
	
	@FindBy(css="div[class='container_main'] filters mat-form-field mat-select[formcontrolname='searchBy'] div[class='mat-select-arrow']")
	public WebElement amazonSearch_Dropdown_Button;
	
	@FindBy(css="div[class='cdk-overlay-container'] div[class='cdk-overlay-connected-position-bounding-box'] div[class='cdk-overlay-pane']")
	public WebElement amazonSearch_Dropdown_Options;
	
	@FindBy(css = "filters div[class='filters_group input-group'] input[formcontrolname='searchValue']")
	public WebElement amazonSearch_TextField;
	
	@FindBy(css="filters div[class='filters_group input-group'] div[class='input-group-append'] button")
	public WebElement amazonSearch_Search_Button;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-expansion-panel-header mat-panel-title")
	public WebElement moreFilters_Button;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-expansion-panel-header div[class='mat-expansion-panel-body'] div[formgroupname='status']")
	public WebElement agreementStatus_Multiselect;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-expansion-panel-header div[class='mat-expansion-panel-body'] div[formgroupname='cdeQueueStatus']")
	public WebElement cdeQueueStatus_Multiselect;
	
	@FindBy(css="div[class='container_main'] filters mat-form-field mat-select[formcontrolname='businessUnitId'] div[class='mat-select-arrow']")
	public WebElement businessUnit_Dropdow_Button;
	
	@FindBy(css="div[class='cdk-overlay-container'] div[class='cdk-overlay-connected-position-bounding-box'] div[class='cdk-overlay-pane']")
	public WebElement businessUnit_Dropdown_Options;
	
	@FindBy(css="div[class='container_main'] filters mat-form-field mat-select[formcontrolname='serviceTypeId'] div[class='mat-select-arrow']")
	public WebElement serviceType_Dropdown_Button;
	
	@FindBy(css="div[class='cdk-overlay-container'] div[class='cdk-overlay-connected-position-bounding-box'] div[class='cdk-overlay-pane']")
	public WebElement serviceType_Dropdown_Options;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-form-field input[form='expireFrom']")
	public WebElement agreementExpiryDate_From_TextField;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-form-field input[form='expireTo']")
	public WebElement agreementExpiryDate_To_TextField;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-form-field input[form='marginFrom']")
	public WebElement actualMargin_From_TextField;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-form-field input[form='marginTo']")
	public WebElement actualMargin_To_TextField;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-form-field input[form='totalservicepriceFrom']")
	public WebElement totalServiceCharge_From_TextField;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-form-field input[form='totalservicepriceTo']")
	public WebElement totalServiceCharge_To_TextField;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-expansion-panel-header div[class='filters_search_wrapper'] button:nth-child(1)")
	public WebElement resetFilters_Button;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-expansion-panel-header div[class='filters_search_wrapper'] button:nth-child(2)")
	public WebElement moreFilters_Search_Button;
	
	@FindBy(css="div[class='container_main'] filters mat-accordion mat-expansion-panel mat-expansion-panel-header mat-panel-title")
	public WebElement lessFilters_Button;
	
	@FindBy(css="div[class='container_main'] div[class='pagination_header_container'] mat-form-field mat-select div[class='mat-select-arrow']")
	public WebElement searchResultsLimit_Dropdown_Button;
	
	@FindBy(css="div[class='cdk-overlay-container'] div[class='cdk-overlay-connected-position-bounding-box'] div[class='cdk-overlay-pane']")
	public WebElement searchResultsLimit_Dropdown_Options;

	@FindBy(css="div[class='container_main'] div[class='div[class='pagination_header_container'] button_container_right'] button:nth-child(1)")
	public WebElement download_Button;
	
	@FindBy(css="div[class='container_main'] div[class='div[class='pagination_header_container'] button_container_right'] button:nth-child(1)")
	public WebElement createReport_Button;
	
	/********************** Grid Section **************************************/
	
	@FindBy(css="div[class='table-container'] table tbody tr td a")
	public WebElement agreementGrid_Results;
	
}
