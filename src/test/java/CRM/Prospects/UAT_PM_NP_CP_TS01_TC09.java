package CRM.Prospects;

import java.util.LinkedHashMap;
import java.util.Map;

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

public class UAT_PM_NP_CP_TS01_TC09 extends DriverClass {
	
	/*
	 * ProspectIndex -> Prospect Create -> Prospect Edit -> Site Create -> Agreement Create -> Service Line Create 
	 * ProspectIndex -> Prospect View -> Prospect Edit -> Save at 50%
	 */

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
					MethodsUtil.customWait();
					Assert.assertTrue(prospectCreate.prospectCreateLocators.pc_company_name_textfield.isDisplayed());
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
					prospectView = prospectCreate.clickSaveAndSubmit();
					MethodsUtil.customWait();
					Assert.assertTrue(prospectView.prospectViewLocators.EditProspect_Button.isDisplayed());
					prospectEdit = prospectView.clickEditProspect();
					MethodsUtil.customWait();
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_EDIT_SHEET)) {
					prospectView = prospectEdit.clickOnSaveAndSubmit();
					MethodsUtil.customWait();
					Assert.assertTrue(prospectView.prospectViewLocators.EditProspect_Button.isDisplayed());
					siteCreate = prospectView.clickCreateSite();
					MethodsUtil.customWait();
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SITE_CREATE_SHEET)) {
					prospectView = siteCreate.clickOnSaveSite();
					MethodsUtil.customWait();
					Assert.assertTrue(prospectView.prospectViewLocators.EditProspect_Button.isDisplayed());
					agreementCreate = prospectView.clickCreateAgreement();
					MethodsUtil.customWait();
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CREATE_SHEET)) {
					serviceLineCreate = agreementCreate.clickOnAddService();
					MethodsUtil.customWait();
					Assert.assertTrue(serviceLineCreate.serviceLineCreateLocators.slc_agreements_link.isDisplayed());
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SL_CREATE_SHEET)) {
					agreementCreate = serviceLineCreate.clickOnAddServiceForNewAgreement();
					MethodsUtil.customWait();
					Assert.assertTrue(agreementCreate.agreementCreateLocators.ac_save_as_quote_button.isDisplayed());
					agreementCreate.clickOnSaveAsQuote();
					MethodsUtil.customWait();
				}
			}
		}
	}
}
