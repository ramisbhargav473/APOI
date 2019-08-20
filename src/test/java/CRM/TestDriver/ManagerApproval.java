/**
 * 
 */
package CRM.TestDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import CRM.Base.SourcePage;
import CRM.MainPages.AgreementIndex;
import CRM.ReusableComponents.ExcelUtility;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;

/**
 * @author jteja
 *
 */
public class ManagerApproval extends DriverClass{

	public static AgreementIndex agreementIndex;
	public static void managerApproval(String agreementID) {
		
		SourcePage.initialConfigurations();
		explicitWait = new WebDriverWait(wwDriver, 10);
		
		excel = new ExcelUtility();
		logger.info("Test Data excel is loaded");
		
		//Logging in to WISHES application using using the AD login screens.
		adLogin.loginToWishes(wwDriver, "https://wishes-qa.azurewebsites.net", "capex_test_approver@gflenv.com", "C@pex1234");
		logger.info("Logged into Wishes Application");
		MethodsUtil.customWait();
		agreementIndex = sidePanel.clickAgreements();
		agreementIndex.agreementIndexLocators.amazonSearch_TextField.sendKeys(agreementID);
		KeywordsUtil.click(agreementIndex.agreementIndexLocators.amazonSearch_Search_Button);
		KeywordsUtil.selectResult("agreementGrid_Results", "div[class='table-container'] table tbody tr td a", agreementID);
	}
	
	
	
}
