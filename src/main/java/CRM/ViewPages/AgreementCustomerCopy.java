package CRM.ViewPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.ViewPages.Locators.AgreementCustomerCopyLocators;
import CRM.ViewPages.Locators.Constants.ACC_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class AgreementCustomerCopy extends SourcePage {

	public AgreementCustomerCopyLocators agreementCustomerCopyLocators;
	public ACC_LocatorsConstants acc_locatorsConstants;
	
	public AgreementCustomerCopy() {
		this.agreementCustomerCopyLocators = new AgreementCustomerCopyLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.agreementCustomerCopyLocators);
		
		this.acc_locatorsConstants = new ACC_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = acc_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	public AgreementCustomerCopy clickOnSubmitDocument() {
		KeywordsUtil.click(agreementCustomerCopyLocators.acc_submit_document_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, AgreementCustomerCopy.class);
	}
	
}
