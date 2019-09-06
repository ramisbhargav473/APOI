package CRM.Customers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.CustomerIndex;
import CRM.MainPages.ProspectIndex;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.CustomerEdit;
import CRM.SubEditPages.ProspectCreate;
import CRM.SubEditPages.ProspectEdit;
import CRM.SubEditPages.ServiceLineCreate;
import CRM.SubEditPages.SiteCreate;
import CRM.TestDriver.DriverClass;
import CRM.ViewPages.AgreementCustomerCopy;
import CRM.ViewPages.AgreementView;
import CRM.ViewPages.CustomerView;
import CRM.ViewPages.ProspectView;

/**
 * Test case full description
 * 
 * PM - Prospect Management
 ****We are primarily dealing with the scenarios pertaining to prospects.
 * 
 * CM - Customer Management
 ****This means that in this test case, we are purposefully making the validation to be triggered. So we will be checking for validation
 ****failure messages to be triggered at the end of test case. If it is triggered, then the test is a PASS.
 *
 * TS01 - Test Scenario 1
 ****1. Prospect Index - New Prospect (lands on Prospect Create page)
 ****2. Prospect Create - Save prospect successfully with site information. (lands on Prospect View page)
 ****3. Site Edit - Save site with incomplete information. (Checks to be done in all the possible tabs)
 *
 * TC11 - Test Case 11
 ****1. Prospect Index - New Prospect (lands on Prospect Create page)
 ****2. Prospect Create - Enter mandatory details and save the prospect with site information - Save Successful
 ****3. Agreement Create - Create an agreement
 ****4. Service Line Create - Create a service line and save the agreement (APPROVED/UNDER REVIEW)
 *
 *TC11_Edited - Edit scenario test steps
 ****1. Prospect Index - Search for the prospect that is just created.
 ****2. Prospect Edit - Edit the prospect and change the prospect level to 50/75 - Save successful.
 * 
 * @author jteja
 *
 */
public class UAT_CM_EC_ECus_TS01_TC02 extends DriverClass {

	public static ProspectIndex prospectIndex;
	public static ProspectCreate prospectCreate;
	public static ProspectEdit prospectEdit;
	public static ProspectView prospectView;
	public static SiteCreate siteCreate;
	public static AgreementCreate agreementCreate;
	public static AgreementView agreementView;
	public static AgreementCustomerCopy agreementCustomerCopy;
	public static ServiceLineCreate serviceLineCreate;
	public static CustomerIndex customerIndex;
	public static CustomerEdit customerEdit;
	public static CustomerView customerView;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void CM_EC_ECus_TS01_TC02(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {

		prospectIndex = sidePanel.clickProspects();
		MethodsUtil.customWait();
		logger.info("Clicked on the Customers Tab from the Side Navigation");
		extentTest.pass(
				"Clicked on 'Customers' tab from the Side Navigation bar and navigated to the Customer Index page");

		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				
				if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_INDEX_SHEET)) {
				
					prospectCreate = prospectIndex.creatingANewProspect();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
				
					prospectView = prospectCreate.clickSaveAndSubmitSuccess();
					prospectEdit = prospectView.clickEditProspect();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_EDIT_SHEET)) {
				
					prospectView = prospectEdit.clickOnSaveAndSubmitSuccess();
					siteCreate = prospectView.clickCreateSite();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SITE_CREATE_SHEET)) {
				
					prospectView = siteCreate.clickOnSaveSiteSuccess();
					agreementCreate = prospectView.clickCreateAgreement();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CREATE_SHEET)) {
				
					serviceLineCreate = agreementCreate.clickOnAddService();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SL_CREATE_SHEET)) {
				
					agreementCreate = serviceLineCreate.clickOnAddServiceForNewAgreement();
					agreementView = agreementCreate.clickOnSaveAsQuote();
					agreementView = agreementView.clickOnSaveAndSubmitConf();
					agreementCustomerCopy = agreementView.clickOnCustomerCopy();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CUSTOMERCOPY_SHEET)) {
				
					agreementCustomerCopy = agreementCustomerCopy.clickOnSubmitDocument();
					customerIndex = sidePanel.clickCustomers();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.CUSTOMER_INDEX_SHEET)) {
				
					customerView = PageFactory.initElements(wwDriver, CustomerView.class);
					customerEdit = customerView.clickEditCustomer();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.CUSTOMER_EDIT_SHEET)) {
					
					customerView = customerEdit.clickSaveChanges();
				}
			}
		}
	}
}
