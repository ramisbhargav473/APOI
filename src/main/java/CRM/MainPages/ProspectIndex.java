package CRM.MainPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.MainPages.Locators.ProspectIndexLocators;
import CRM.MainPages.Locators.Constants.PI_LocatorsConstants;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.ProspectCreate;
import CRM.ViewPages.CustomerView;
import CRM.ViewPages.ProspectView;

/**
 * @author jteja
 *
 */
public class ProspectIndex extends SourcePage {

	public ProspectIndexLocators prospectIndexLocators;
	public PI_LocatorsConstants pi_locatorConstants;
	
	/**
	 * 
	 */
	public ProspectIndex() {
		this.prospectIndexLocators = new ProspectIndexLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.prospectIndexLocators);
		
		this.pi_locatorConstants = new PI_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators(){
		
		String pi_Variables = pi_locatorConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pi_Variables.split(",");
		for(int i=0; i<pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	/**
	 * @return
	 */
	public ProspectCreate creatingANewProspect() {
		KeywordsUtil.click(prospectIndexLocators.pi_create_prospect_proceed_button);
		MethodsUtil.loaderWait();
		return PageFactory.initElements(wwDriver, ProspectCreate.class);
	}
	
	/**
	 * @return
	 */
	public ProspectView navigateToExistingProspect() {
		KeywordsUtil.click(prospectIndexLocators.pi_create_prospect_proceed_button);
		MethodsUtil.loaderWait();
		return PageFactory.initElements(wwDriver, ProspectView.class);
	}
	
	/**
	 * @return
	 */
	public CustomerView navigateToExistingCustomer() {
		KeywordsUtil.click(prospectIndexLocators.pi_create_prospect_proceed_button);
		MethodsUtil.loaderWait();
		return PageFactory.initElements(wwDriver, CustomerView.class);
	}
	
}
