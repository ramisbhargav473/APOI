package CRM.Prospects;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.ProspectIndex;
import CRM.SubEditPages.ProspectCreate;
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
 * TC02 - Test Case 2
 ****1. Prospect Index - New Prospect (lands on Prospect Create page)
 ****2. Prospect Create - Enter minimum details (name, sales Rep, BU) - Save successful.
 * 
 * @author jteja
 *
 */
public class UAT_PM_NP_CP_TS01_TC02 extends DriverClass {
	
	public static ProspectCreate prospectCreate;
	public static ProspectIndex prospectIndex;
	public static ProspectView prospectView;
	
	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void PM_NP_CP_TS01_TC02(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {

		prospectIndex = sidePanel.clickProspects();
		explicitWait.until(ExpectedConditions.urlContains("prospects"));
		logger.info("Clicked on the Prospects Tab from the Side Navigation");
	
		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
		
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				
				if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_INDEX_SHEET)) {
				
					prospectCreate = prospectIndex.creatingANewProspect();
				
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
				
					prospectView = prospectCreate.clickSaveAndSubmitSuccess();
					Assert.assertTrue(prospectCreate.prospectCreateLocators.pc_save_success_banner.isDisplayed());
					Assert.assertTrue(prospectView.prospectViewLocators.EditProspect_Button.isEnabled());
				
				}
			}
		}
	}
}
