/**
 * 
 */
package CRM.Sites;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.CustomerIndex;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.SiteCreate;
import CRM.TestDriver.DriverClass;
import CRM.ViewPages.CustomerView;

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
 * TC08 - Test Case 8
 ****1. Customer Index - Search for an existing customer from the search results grid. (Click Create Agreement from customer view)
 ****2. Agreement Create - Enter any information needed in Agreement create and click on Add New Site button.
 ****3. Site Create - Save site with incomplete information - SAVE FAILURE
 * 
 * 
 * @author jteja
 *
 */
public class UAT_SM_NS_FVF_TC08 extends DriverClass{

	public static CustomerIndex customerIndex;
	public static CustomerView customerView;
	public static AgreementCreate agreementCreate;
	public static SiteCreate siteCreate;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void SM_NS_FVF_TC08(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {
		
		customerIndex = sidePanel.clickCustomers();
		logger.info("clicked on 'Customers' from the side navigation bar");
		explicitWait.until(ExpectedConditions.urlContains("customers"));
		
		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				
				if (sheetName.equalsIgnoreCase(ConstantsUtil.CUSTOMER_INDEX_SHEET)) {
					
					customerView = PageFactory.initElements(wwDriver, CustomerView.class);
					explicitWait.until(ExpectedConditions.urlContains("view"));
					
					agreementCreate = customerView.clickCreateAgreement();
					explicitWait.until(ExpectedConditions.urlContains("agreement"));
				
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CREATE_SHEET)) {
					
					siteCreate = agreementCreate.clickOnSiteCreate();
					explicitWait.until(ExpectedConditions.urlContains("site"));
				
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SITE_CREATE_SHEET)) {
					
					siteCreate.clickOnSaveSite();
					Assert.assertTrue(siteCreate.siteCreateLocators.sc_save_failure_banner.isDisplayed(), "The Save Failure Banner is not displayed");
					
				}
			}
		}
	}
}


