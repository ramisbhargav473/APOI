package CRM.SubEditPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.Locators.ProspectEditLocators;
import CRM.SubEditPages.Locators.Constants.PE_LocatorsConstants;
import CRM.ViewPages.ProspectView;

/**
 * @author jteja
 *
 */
public class ProspectEdit extends SourcePage{

	public ProspectEditLocators prospectEditLocators;
	public PE_LocatorsConstants pe_locatorsConstants;
	
	/**
	 * 
	 */
	public ProspectEdit() {
		this.prospectEditLocators = new ProspectEditLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.prospectEditLocators);
		
		this.pe_locatorsConstants = new PE_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = pe_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	/**
	 * @return
	 */
	public ProspectView clickOnDiscard() {
		KeywordsUtil.click(prospectEditLocators.pe_discard_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, ProspectView.class);
	}
	
	/**
	 * @return
	 */
	public ProspectView clickOnSaveAndSubmit() {
		KeywordsUtil.click(prospectEditLocators.pe_saveandsubmit_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, ProspectView.class);
	}
	
}
