package CRM.MainPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.MainPages.Locators.CustomerIndexLocators;
import CRM.MainPages.Locators.Constants.CI_LocatorsConstants;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.ProspectCreate;
import CRM.ViewPages.CustomerView;
import CRM.ViewPages.ProspectView;

/**
 * @author jteja
 *
 */
public class CustomerIndex extends SourcePage {

	public CustomerIndexLocators customerIndexLocators;
	public CI_LocatorsConstants ci_locatorConstants;

	/**
	 * 
	 */
	public CustomerIndex() {
		this.customerIndexLocators = new CustomerIndexLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.customerIndexLocators);
		
		this.ci_locatorConstants = new CI_LocatorsConstants();
	}

	public LinkedHashMap<String, String> getLocators() {

		String pi_Variables = ci_locatorConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pi_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}

	/**
	 * @return
	 */
	public CustomerIndex clickDiscard() {
		KeywordsUtil.click(customerIndexLocators.ci_create_prospect_discard_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, CustomerIndex.class);
	}

	/**
	 * @return
	 */
	public ProspectCreate clickProceedNewProspect() {
		KeywordsUtil.click(customerIndexLocators.ci_create_prospect_proceed_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, ProspectCreate.class);
	}

	/**
	 * @return
	 */
	public ProspectView clickProceedExistingProspect() {
		KeywordsUtil.click(customerIndexLocators.ci_create_prospect_proceed_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, ProspectView.class);
	}

	/**
	 * @return
	 */
	public CustomerView clickProceedExistingCustomer() {
		KeywordsUtil.click(customerIndexLocators.ci_create_prospect_proceed_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, CustomerView.class);
	}

}
