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
 * 1. Prospect Index 
 * 2. Prospect Create - Save at 0% - Save successful 
 * 3. Site Create - Save successful 
 * 4. Agreement Create - Save as Quote - Successful
 * 
 * Edited 
 * 1. Prospect Index (Search from grid) 
 * 2. Prospect Edit - Save at 50% - Save failure
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
					MethodsUtil.customWait();
					Assert.assertTrue(wwDriver.getCurrentUrl().contains("create"));
					Assert.assertTrue(prospectCreate.prospectCreateLocators.pc_save_and_submit_button.isDisplayed());
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
					prospectView = prospectCreate.clickSaveAndSubmit();
					MethodsUtil.customWait();
					Assert.assertTrue(wwDriver.getCurrentUrl().contains("view"));
					Assert.assertTrue(prospectView.prospectViewLocators.CreateSite_Button.isDisplayed());
					siteCreate = prospectView.clickCreateSite();
					MethodsUtil.customWait();
					Assert.assertTrue(wwDriver.getCurrentUrl().contains("site"));
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SITE_CREATE_SHEET)) {
					prospectView = siteCreate.clickOnSaveSite();
					MethodsUtil.customWait();
					Assert.assertTrue(wwDriver.getCurrentUrl().contains("view"));
					Assert.assertTrue(prospectView.prospectViewLocators.CreateSite_Button.isDisplayed());
					agreementCreate = prospectView.clickCreateAgreement();
					MethodsUtil.customWait();
					Assert.assertTrue(wwDriver.getCurrentUrl().contains("agreement"));
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CREATE_SHEET)) {
					agreementCreate.clickOnSaveAsQuote();
					MethodsUtil.customWait();
					Assert.assertTrue(wwDriver.getCurrentUrl().contains("view"));
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
					prospectEdit = prospectView.clickEditProspect();
					MethodsUtil.customWait();
					Assert.assertTrue(wwDriver.getCurrentUrl().contains("edit"));
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_EDIT_SHEET)) {
					prospectEdit.clickOnSaveAndSubmit();
					MethodsUtil.customWait();
					Assert.assertTrue(wwDriver.getCurrentUrl().contains("edit"));
					Assert.assertTrue(prospectEdit.prospectEditLocators.pe_saveandsubmit_button.isEnabled());
				}
			}
		}
	}
}