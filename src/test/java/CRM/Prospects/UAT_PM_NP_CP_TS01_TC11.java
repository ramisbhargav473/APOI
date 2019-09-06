package CRM.Prospects;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.AgreementIndex;
import CRM.MainPages.ProspectIndex;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.AgreementEdit;
import CRM.SubEditPages.ProspectCreate;
import CRM.SubEditPages.ProspectEdit;
import CRM.SubEditPages.ServiceLineCreate;
import CRM.SubEditPages.SiteCreate;
import CRM.TestDriver.DriverClass;
import CRM.ViewPages.AgreementView;
import CRM.ViewPages.ProspectView;

/**
 * Test case full description
 * 
 * PM - Prospect Management
 ****We are primarily dealing with the scenarios pertaining to prospects.
 * 
 * CP - Form Validation Failure
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
public class UAT_PM_NP_CP_TS01_TC11 extends DriverClass {
	
	/*
	 * ProspectIndex -> Prospect Create -> Prospect Edit -> Site Create -> Agreement Create -> Service Line Create 
	 * ProspectIndex -> Prospect View -> Prospect Edit -> Save at 50%
	 */

	public static ProspectIndex prospectIndex;
	public static ProspectCreate prospectCreate;
	public static ProspectEdit prospectEdit;
	public static ProspectView prospectView;
	public static AgreementIndex agreementIndex;
	public static AgreementCreate agreementCreate;
	public static AgreementEdit agreementEdit;
	public static SiteCreate siteCreate;
	public static AgreementView agreementView;
	public static ServiceLineCreate serviceLineCreate;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void PM_NP_CP_TS01_TC11(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {

		prospectIndex = sidePanel.clickProspects();
		MethodsUtil.customWait();
		logger.info("Clicked on the Prospects Tab from the Side Navigation");
		extentTest.pass(
				"Clicked on 'Prospects' tab from the Side Navigation bar and navigated to the Prospect Index page");
		
		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				
				if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_INDEX_SHEET)) {
				
					prospectCreate = prospectIndex.creatingANewProspect();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
				
					prospectView = prospectCreate.clickSaveAndSubmitSuccess();
					agreementCreate = prospectView.clickCreateAgreement();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CREATE_SHEET)) {
				
					serviceLineCreate = agreementCreate.clickOnAddService();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SL_CREATE_SHEET)) {
				
					agreementCreate = serviceLineCreate.clickOnAddServiceForNewAgreement();
					agreementView = agreementCreate.clickOnSaveAsQuote();
					agreementView.clickOnSaveAndSubmitConf();

				}
			}
		}
	}
	
	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void PM_NP_CP_TS01_TC11_Edited(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {

		prospectIndex = sidePanel.clickProspects();
		MethodsUtil.customWait();
		logger.info("Clicked on the Prospects Tab from the Side Navigation");
		extentTest.pass(
				"Clicked on 'Prospects' tab from the Side Navigation bar and navigated to the Prospect Index page");
		
		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
		
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				
				if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_INDEX_SHEET)) {
				
					prospectView = PageFactory.initElements(wwDriver, ProspectView.class);
					MethodsUtil.loaderWait();
					prospectEdit = prospectView.clickEditProspect();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_EDIT_SHEET)) {
				
					prospectEdit.clickOnSaveAndSubmitFailure();
					Assert.assertTrue(prospectEdit.prospectEditLocators.pe_save_failure_banner.isDisplayed());
					Assert.assertTrue(prospectEdit.prospectEditLocators.pe_saveandsubmit_button.isDisplayed());

				}
			}
		}
	}
}