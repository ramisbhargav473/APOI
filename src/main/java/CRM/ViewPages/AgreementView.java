/**
 * 
 */
package CRM.ViewPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.ViewPages.Locators.AgreementViewLocators;
import CRM.ViewPages.Locators.Constants.AV_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class AgreementView extends SourcePage {
	
	public AgreementViewLocators agreementViewLocators;
	public AV_LocatorsConstants av_locatorsConstants;
	
	public AgreementView() {
		this.agreementViewLocators = new AgreementViewLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.agreementViewLocators);
		
		this.av_locatorsConstants = new AV_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = av_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	public AgreementCustomerCopy clickOnCustomerCopy() {
		KeywordsUtil.click(agreementViewLocators.av_customer_copy_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, AgreementCustomerCopy.class);
	}
	
	public AgreementView clickOnSaveAndSubmitConf() {
		KeywordsUtil.click(agreementViewLocators.av_save_and_submit_button);
		KeywordsUtil.click(agreementViewLocators.av_submit_conf_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, AgreementView.class);
	}
}
