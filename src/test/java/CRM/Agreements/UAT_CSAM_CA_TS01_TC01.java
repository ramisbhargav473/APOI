/**
 * 
 */
package CRM.Agreements;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import CRM.MainPages.AgreementIndex;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.ServiceLineCreate;
import CRM.TestDriver.DriverClass;

/**
 * @author jteja
 *
 */
public class UAT_CSAM_CA_TS01_TC01 extends DriverClass {

	public static AgreementIndex agreementIndex;
	public static AgreementCreate agreementCreate;
	public static ServiceLineCreate serviceLineCreate;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public static void CSAM_CA_TS01_TC01(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {
		
		agreementIndex = sidePanel.clickAgreements();
		MethodsUtil.customWait();
		explicitWait.until(ExpectedConditions.visibilityOf(agreementIndex.agreementIndexLocators.newAgreement_Button));
		agreementCreate = agreementIndex.clickOnNewAgreement();
		MethodsUtil.customWait();
		
		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				if(sheetName.equalsIgnoreCase("AgreementCreate")) {
					MethodsUtil.customWait();
					serviceLineCreate = agreementCreate.clickOnAddService();
					MethodsUtil.customWait();
				} else if(sheetName.equalsIgnoreCase("ServiceLineCreate")) {
					agreementCreate = serviceLineCreate.clickOnAddServiceForNewAgreement();
					MethodsUtil.customWait();
					agreementCreate.clickOnSaveAsQuote();
					MethodsUtil.customWait();
				}
			}
		}
		
	}

}
