/**
 * 
 */
package CRM.Sites;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.AgreementIndex;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.SiteCreate;
import CRM.TestDriver.DriverClass;

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
 * TC06 - Test Case 6
 ****1. Agreement Create - Enter customer details in Agreement create and click on Add New Site button.
 ****2. Site Create - Save site with incomplete information - SAVE FAILURE
 * 
 * 
 * @author jteja
 *
 */
public class UAT_SM_NS_FVF_TC06 extends DriverClass{

	public static AgreementIndex agreementIndex;
	public static AgreementCreate agreementCreate;
	public static SiteCreate siteCreate;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void SM_NS_FVF_TC06(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {
		
		agreementIndex = sidePanel.clickAgreements();
		logger.info("clicked on 'Agreements' from the side navigation bar");
		
		agreementCreate = agreementIndex.clickOnNewAgreement();
		explicitWait.until(ExpectedConditions.urlContains("create"));
		
		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				
				if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CREATE_SHEET)) {
					
					siteCreate = agreementCreate.clickOnSiteCreate();
					explicitWait.until(ExpectedConditions.urlContains("site"));
				
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SITE_CREATE_SHEET)) {
					
					siteCreate.clickOnSaveSiteSuccess();
					Assert.assertTrue(siteCreate.siteCreateLocators.sc_save_failure_banner.isDisplayed(), "The Save Failure Banner is not displayed");
					
				}
			}
		}
	}
}


