package CRM.Customers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.CustomerIndex;
import CRM.MainPages.ProspectIndex;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.CustomerEdit;
import CRM.SubEditPages.ProspectCreate;
import CRM.SubEditPages.ProspectEdit;
import CRM.SubEditPages.ServiceLineCreate;
import CRM.SubEditPages.SiteCreate;
import CRM.TestDriver.DriverClass;
import CRM.ViewPages.AgreementCustomerCopy;
import CRM.ViewPages.AgreementView;
import CRM.ViewPages.CustomerView;
import CRM.ViewPages.ProspectView;

public class UAT_CM_EC_ECus_TS01_TC02 extends DriverClass {

	public static ProspectIndex prospectIndex;
	public static ProspectCreate prospectCreate;
	public static ProspectEdit prospectEdit;
	public static ProspectView prospectView;
	public static SiteCreate siteCreate;
	public static AgreementCreate agreementCreate;
	public static AgreementView agreementView;
	public static AgreementCustomerCopy agreementCustomerCopy;
	public static ServiceLineCreate serviceLineCreate;
	public static CustomerIndex customerIndex;
	public static CustomerEdit customerEdit;
	public static CustomerView customerView;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void CM_EC_ECus_TS01_TC02(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {

		prospectIndex = sidePanel.clickProspects();
		MethodsUtil.customWait();
		logger.info("Clicked on the Customers Tab from the Side Navigation");
		extentTest.pass(
				"Clicked on 'Customers' tab from the Side Navigation bar and navigated to the Customer Index page");

		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				MethodsUtil.customWait();
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_INDEX_SHEET)) {
					prospectCreate = prospectIndex.creatingANewProspect();
					Assert.assertTrue(prospectCreate.prospectCreateLocators.pc_company_name_textfield.isDisplayed());
					Thread.sleep(1000);
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_CREATE_SHEET)) {
					prospectView = prospectCreate.clickSaveAndSubmit();
					Assert.assertTrue(prospectView.prospectViewLocators.EditProspect_Button.isDisplayed());
					Thread.sleep(1000);
					prospectEdit = prospectView.clickEditProspect();
					Thread.sleep(1000);
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.PROSPECT_EDIT_SHEET)) {
					prospectView = prospectEdit.clickOnSaveAndSubmit();
					Assert.assertTrue(prospectView.prospectViewLocators.EditProspect_Button.isDisplayed());
					siteCreate = prospectView.clickCreateSite();
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SITE_CREATE_SHEET)) {
					prospectView = siteCreate.clickOnSaveSite();
					Assert.assertTrue(prospectView.prospectViewLocators.EditProspect_Button.isDisplayed());
					agreementCreate = prospectView.clickCreateAgreement();
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CREATE_SHEET)) {
					serviceLineCreate = agreementCreate.clickOnAddService();
					Thread.sleep(1000);
					Assert.assertTrue(serviceLineCreate.serviceLineCreateLocators.slc_agreements_link.isDisplayed());
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.SL_CREATE_SHEET)) {
					agreementCreate = serviceLineCreate.clickOnAddServiceForNewAgreement();
					Assert.assertTrue(agreementCreate.agreementCreateLocators.ac_save_as_quote_button.isDisplayed());
					agreementView = agreementCreate.clickOnSaveAsQuote();
					KeywordsUtil.click(agreementView.agreementViewLocators.av_save_and_submit_button);
					agreementView = agreementView.clickOnSaveAndSubmitConf();
					System.out.println("clicked on confirmation button");
					MethodsUtil.customWait();
					System.out.println("page load complete");
					System.out.println(agreementView.agreementViewLocators.av_status.getText());
					Assert.assertTrue(agreementView.agreementViewLocators.av_status.getText().toLowerCase().trim()
							.equalsIgnoreCase("approved"));
					agreementCustomerCopy = agreementView.clickOnCustomerCopy();
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.AGREEMENT_CUSTOMERCOPY_SHEET)) {
					agreementCustomerCopy = agreementCustomerCopy.clickOnSubmitDocument();
					MethodsUtil.customWait();
					System.out.println(agreementCustomerCopy.agreementCustomerCopyLocators.acc_status_display.getText().toLowerCase().trim());
					customerIndex = sidePanel.clickCustomers();
					MethodsUtil.customWait();
					Thread.sleep(1000);
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.CUSTOMER_INDEX_SHEET)) {
					customerView = PageFactory.initElements(wwDriver, CustomerView.class);
					MethodsUtil.customWait();
					Assert.assertTrue(customerView.customerViewLocators.editCustomer_Button.isDisplayed());
					customerEdit = customerView.clickEditCustomer();
					MethodsUtil.customWait();
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.CUSTOMER_EDIT_SHEET)) {
					customerView = customerEdit.clickSaveChanges();
					MethodsUtil.customWait();
					Assert.assertTrue(customerView.customerViewLocators.editCustomer_Button.isDisplayed());
				}
			}
		}
	}
}
