package CRM.Prospects;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.ProspectIndex;
import CRM.SubEditPages.ProspectCreate;
import CRM.SubEditPages.ProspectEdit;
import CRM.SubEditPages.SiteCreate;
import CRM.ViewPages.ProspectView;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.TestDriver.DriverClass;

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
 * TC07 - Test Case 7
 ****1. Prospect Index - New Prospect (lands on Prospect Create page)
 ****2. Prospect Create - Enter mandatory details and save the prospect at 0% / 25% by giving relavent information. NO SITE - Save Successful
 ****3. Site Create - Enter site information and save. - Save successful
 ****4. Prospect Edit - Change the prospect level to 50% - Save Failure.
 * 
 * @author jteja
 *
 */
public class UAT_PM_NP_CP_TS01_TC07 extends DriverClass {

	public static ProspectIndex prospectIndex;
	public static ProspectCreate prospectCreate;
	public static ProspectView prospectView;
	public static ProspectEdit prospectEdit;
	public static SiteCreate siteCreate;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void PM_NP_CP_TS01_TC07(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
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
