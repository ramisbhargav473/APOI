package CRM.Customers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CRM.MainPages.CustomerIndex;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.CustomerEdit;
import CRM.TestDriver.DriverClass;
import CRM.ViewPages.CustomerView;

public class UAT_CM_EC_ECus_TS01_TC03 extends DriverClass{
	
	public static CustomerIndex customerIndex;
	public static CustomerEdit customerEdit;
	public static CustomerView customerView;

	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void CM_EC_ECus_TS01_TC03(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {

		customerIndex = sidePanel.clickCustomers();
		MethodsUtil.customWait();
		logger.info("Clicked on the Customers Tab from the Side Navigation");
		extentTest.pass(
				"Clicked on 'Customers' tab from the Side Navigation bar and navigated to the Customer Index page");

		for (String testCaseID : finalDataMap.keySet()) {
			for (String sheetName : finalDataMap.get(testCaseID).keySet()) {
				MethodsUtil.customWait();
				MethodsUtil.selector(finalDataMap, testCaseID, sheetName);
				if (sheetName.equalsIgnoreCase(ConstantsUtil.CUSTOMER_INDEX_SHEET)) {
					customerView = PageFactory.initElements(wwDriver, CustomerView.class);
					Assert.assertTrue(customerView.customerViewLocators.editCustomer_Button.isDisplayed());
					customerEdit = customerView.clickEditCustomer();
				} else if (sheetName.equalsIgnoreCase(ConstantsUtil.CUSTOMER_EDIT_SHEET)) {
					customerView = customerEdit.clickDiscard();
					Assert.assertTrue(customerView.customerViewLocators.editCustomer_Button.isDisplayed());
				}
			}
		}
	}
}
