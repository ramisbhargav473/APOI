package CRM.SubEditPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.Locators.CustomerEditLocators;
import CRM.SubEditPages.Locators.Constants.CE_LocatorsConstants;
import CRM.ViewPages.CustomerView;

/**
 * @author jteja
 *
 */
public class CustomerEdit extends SourcePage {

	public CustomerEditLocators customerEditLocators;
	public CE_LocatorsConstants ce_locatorConstants;

	/**
	 * 
	 */
	public CustomerEdit() {
		this.customerEditLocators = new CustomerEditLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.customerEditLocators);

		this.ce_locatorConstants = new CE_LocatorsConstants();
	}

	public LinkedHashMap<String, String> getLocators() {

		String pi_Variables = ce_locatorConstants.toString();
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
	public CustomerView clickSaveChanges() {
		KeywordsUtil.click(customerEditLocators.ce_save_changes_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, CustomerView.class);
	}

	/**
	 * @return
	 */
	public CustomerView clickDiscard() {
		KeywordsUtil.click(customerEditLocators.ce_discard_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, CustomerView.class);
	}

}
