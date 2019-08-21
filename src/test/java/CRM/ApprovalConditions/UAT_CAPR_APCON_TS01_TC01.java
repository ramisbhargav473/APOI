/**
 * 
 */
package CRM.ApprovalConditions;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.ControllerAndMaintenance;
import CRM.MainPages.ProspectIndex;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.ControllerAndMaintenanceEdit;
import CRM.SubEditPages.ProspectCreate;
import CRM.SubEditPages.ServiceLineCreate;
import CRM.TestDriver.DriverClass;
import CRM.ViewPages.AgreementView;
import CRM.ViewPages.ProspectView;

/**
 * This test case is designed to check if the agreement goes for manager approval.
 * 
 * 1. CnM - Mark the desired conditon - Publish successful
 * 2. Prospect Index
 * 3. Prospect Create - Create a prospect with site and contact information.
 * 4. Agreement Create - Create an agreement for the created prospect.
 * 5. Service Line Create - Create a service line such that it triggers the approval conditions.
 * 6. Agreement View - Save and submit - Agreement status should be under review.
 * 
 * @author jteja
 *
 */
public class UAT_CAPR_APCON_TS01_TC01 extends DriverClass {
	
	public static ProspectIndex prospectIndex;
	public static ProspectCreate prospectCreate;
	public static ProspectView prospectView;
	public static AgreementCreate agreementCreate;
	public static AgreementView agreementView;
	public static ServiceLineCreate serviceLineCreate;
	public static ControllerAndMaintenance controllerAndMaintenance;
	public static ControllerAndMaintenanceEdit controllerAndMaintenanceEdit;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void CAPR_APCON_TS01_TC01(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {

		controllerAndMaintenance = sidePanel.clickControllerAndMaintenance();
		MethodsUtil.customWait();
		Thread.sleep(2000);
		controllerAndMaintenanceEdit = controllerAndMaintenance.clickEdit();

		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				MethodsUtil.customWait();
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				if(sheetName.equalsIgnoreCase("CntNMntEdit")) {
					controllerAndMaintenanceEdit.clickPublish();
					MethodsUtil.customWait();
					prospectIndex = sidePanel.clickProspects();
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_INDEX_SHEET)) {
					prospectCreate = prospectIndex.creatingANewProspect();
					Assert.assertTrue(prospectCreate.prospectCreateLocators.pc_company_name_textfield.isDisplayed());
					Thread.sleep(2000);
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
					prospectView = prospectCreate.clickSaveAndSubmit();
					Assert.assertTrue(prospectView.prospectViewLocators.EditProspect_Button.isDisplayed());
					Thread.sleep(1000);
					agreementCreate = prospectView.clickCreateAgreement();
					Thread.sleep(1000);
				}else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CREATE_SHEET)) {
					serviceLineCreate = agreementCreate.clickOnAddService();
					Thread.sleep(1000);
					Assert.assertTrue(serviceLineCreate.serviceLineCreateLocators.slc_agreements_link.isDisplayed());
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SL_CREATE_SHEET)) {
					agreementCreate = serviceLineCreate.clickOnAddServiceForNewAgreement();
					Assert.assertTrue(agreementCreate.agreementCreateLocators.ac_save_as_quote_button.isDisplayed());
					agreementView = agreementCreate.clickOnSaveAsQuote();
					KeywordsUtil.click(agreementView.agreementViewLocators.av_save_and_submit_button);
					agreementView = agreementView.clickOnSaveAndSubmitConf();
					MethodsUtil.customWait();
					System.out.println(agreementView.agreementViewLocators.av_status.getText());
					Assert.assertTrue(agreementView.agreementViewLocators.av_status.getText().toLowerCase().trim()
							.equalsIgnoreCase("under review"));
				} 
			}
		}
	}
}
