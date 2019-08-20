package CRM.Prospects;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.ProspectIndex;
import CRM.SubEditPages.ProspectCreate;
import CRM.ViewPages.ProspectView;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.TestDriver.DriverClass;

public class UAT_PM_NP_CP_TS01_TC03 extends DriverClass {

	public static ProspectCreate prospectCreate;
	public static ProspectIndex prospectIndex;
	public static ProspectView prospectView;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void PM_NP_CP_TS01_TC03(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {

		prospectIndex = sidePanel.clickProspects();
		MethodsUtil.customWait();
		logger.info("Clicked on the Prospects Tab from the Side Navigation");
		extentTest.pass("Clicked on 'Prospects' tab from the Side Navigation bar and navigated to the Prospect Index page");
		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_INDEX_SHEET)) {
					prospectCreate = prospectIndex.creatingANewProspect();
					MethodsUtil.customWait();
					Assert.assertTrue(prospectCreate.prospectCreateLocators.pc_company_name_textfield.isDisplayed());
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
					prospectCreate.clickSaveAndSubmit();
					MethodsUtil.customWait();
					Assert.assertTrue(prospectCreate.prospectCreateLocators.pc_save_and_submit_button.isDisplayed());
				}
			}
		}
	}
}
