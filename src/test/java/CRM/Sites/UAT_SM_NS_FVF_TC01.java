/**
 * 
 */
package CRM.Sites;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.ProspectIndex;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.ProspectCreate;
import CRM.SubEditPages.SiteCreate;
import CRM.TestDriver.DriverClass;
import CRM.ViewPages.ProspectView;

/**
 * Test case full description
 * 
 * SM - Site Management
 ****We are primarily dealing with the validations pertaining to sites in various sections from where we have access to the sites module.
 * 
 * NS - New Site
 ****All the test cases with this notation deal with a 'New Site' creation from various modules.
 *
 * FVF - Form Validation Failure
 ****This means that in this test case, we are purposefully making the validation to be triggered. So we will be checking for validation
 ****failure messages to be triggered at the end of test case. If it is triggered, then the test is a PASS.
 *
 * TC01 - Test Case 1
 ****1. Prospect Index - New prospect from the pop-up.
 ****2. Prospect Create - Save prospect without site information.
 ****3. Site Create - Save site with incomplete information - SAVE FAILURE
 * 
 * 
 * @author jteja
 *
 */
public class UAT_SM_NS_FVF_TC01 extends DriverClass{

	public static ProspectIndex prospectIndex;
	public static ProspectView prospectView;
	public static ProspectCreate prospectCreate;
	public static SiteCreate siteCreate;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void SM_NS_FVF_TC01(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {
		
		prospectIndex = sidePanel.clickProspects();
		logger.info("clicked on 'Prospects' from the side navigation bar");
		
		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				
				if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_INDEX_SHEET)) {
					
					prospectCreate = prospectIndex.creatingANewProspect();
					explicitWait.until(ExpectedConditions.urlContains("create"));
				
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
					
					prospectView = prospectCreate.clickSaveAndSubmit();
					explicitWait.until(ExpectedConditions.urlContains("view"));
					
					siteCreate = prospectView.clickCreateSite();
					explicitWait.until(ExpectedConditions.urlContains("site"));
				
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SITE_CREATE_SHEET)) {
					
					siteCreate.clickOnSaveSite();
					Assert.assertTrue(siteCreate.siteCreateLocators.sc_save_failure_banner.isDisplayed(), "The Save Failure Banner is not displayed");
					
				}
			}
		}
	}
}
