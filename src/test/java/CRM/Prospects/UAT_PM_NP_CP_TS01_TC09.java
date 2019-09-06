package CRM.Prospects;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
 * TC09 - Test Case 9
 ****1. Prospect Index - New Prospect (lands on Prospect Create page)
 ****2. Prospect Create - Enter mandatory details and save the prospect at 0% without a contact, NO SITE - Save Successful
 ****3. Site Create - Enter site information and save. - Save successful
 ****4. Agreement Create - Save an agreement as quote - save successful.
 *
 *TC09_Edited - Edit scenario test steps
 ****1. Prospect Index - Search for the prospect that is just created.
 ****2. Prospect Edit - Edit the prospect and change the prospect level at 50% no contact - Save failure.
 * 
 * @author jteja
 *
 */
public class UAT_PM_NP_CP_TS01_TC09 extends DriverClass {

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
	public void PM_NP_CP_TS01_TC09(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
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
					Assert.assertTrue(prospectCreate.prospectCreateLocators.pc_save_success_banner.isDisplayed());
					siteCreate = prospectView.clickCreateSite();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SITE_CREATE_SHEET)) {
				
					prospectView = siteCreate.clickOnSaveSiteSuccess();
					Assert.assertTrue(siteCreate.siteCreateLocators.sc_save_success_banner.isDisplayed());
					agreementCreate = prospectView.clickCreateAgreement();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CREATE_SHEET)) {

					agreementCreate.clickOnSaveAsQuote();
					Assert.assertTrue(agreementCreate.agreementCreateLocators.ac_save_success_banner.isDisplayed());
				
				}
			}
		}
	}

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void PM_NP_CP_TS01_TC09_Edited(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
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
					explicitWait.until(ExpectedConditions.urlContains("view"));
					prospectEdit = prospectView.clickEditProspect();

				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_EDIT_SHEET)) {
		
					prospectEdit.clickOnSaveAndSubmitFailure();
					Assert.assertTrue(prospectEdit.prospectEditLocators.pe_save_failure_banner.isDisplayed());

				}
			}
		}
	}
}