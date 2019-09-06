package CRM.Prospects;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.ProspectIndex;
import CRM.SubEditPages.ProspectCreate;
import CRM.SubEditPages.ProspectEdit;
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
 * TC04 - Test Case 4
 ****1. Prospect Index - New Prospect (lands on Prospect Create page)
 ****2. Prospect Create - Enter mandatory details.(name, sales Rep, BU) - Save successful.
 ****3. Prospect Edit - Save the contact information and indicate prospect level as 25% - Save successful.
 * 
 * @author jteja
 *
 */
public class UAT_PM_NP_CP_TS01_TC04 extends DriverClass {

	public ProspectIndex prospectIndex;
	public ProspectCreate prospectCreate;
	public ProspectView prospectView;
	public ProspectEdit prospectEdit;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void PM_NP_CP_TS01_TC04(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
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
					prospectEdit = prospectView.clickEditProspect();
					
				} else if(sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_EDIT_SHEET)) {
					
					prospectView = prospectEdit.clickOnSaveAndSubmitSuccess();
					Assert.assertTrue(prospectView.prospectViewLocators.pe_save_success_banner.isDisplayed());
					Assert.assertTrue(prospectView.prospectViewLocators.EditProspect_Button.isDisplayed());
					
				}
			}
		}
	}
}
