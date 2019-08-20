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

public class UAT_PM_NP_CP_TS01_TC07 extends DriverClass {

	public static ProspectIndex prospectIndex;
	public static ProspectCreate prospectCreate;
	public static ProspectView prospectView;
	public static ProspectEdit prospectEdit;
	public static SiteCreate siteCreate;
	
	/**
	 * prospect index
	 * prospect create - 25
	 * site create - create a site
	 * prospect edit - 50
	 * 
	 * error message saying that quote is required
	 * 
	 * 
	 * @param finalDataMap
	 * @throws InterruptedException
	 */
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
				if(sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_INDEX_SHEET)) {
					prospectCreate = prospectIndex.creatingANewProspect();
					Thread.sleep(2000);
					Assert.assertTrue(prospectCreate.prospectCreateLocators.pc_save_and_submit_button.isDisplayed());
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
					 prospectView= prospectCreate.clickSaveAndSubmit();
					 Thread.sleep(2000);
					 Assert.assertTrue(prospectView.prospectViewLocators.CreateSite_Button.isDisplayed());
					 siteCreate = prospectView.clickCreateSite();
					Thread.sleep(2000);
				} else if(sheetName.equalsIgnoreCase(ConstantsUtil.SITE_CREATE_SHEET)) {
					prospectView = siteCreate.clickOnSaveSite();
					Thread.sleep(2000);
					Assert.assertTrue(prospectView.prospectViewLocators.CreateSite_Button.isDisplayed());
					prospectEdit = prospectView.clickEditProspect();
					Thread.sleep(2000);
				}else if(sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_EDIT_SHEET)) {
					prospectEdit.clickOnSaveAndSubmit();
					Thread.sleep(2000);
					Assert.assertTrue(prospectEdit.prospectEditLocators.pe_saveandsubmit_button.isDisplayed());
				}
			}
		}
	}
}
