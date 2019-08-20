package CRM.SubEditPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.MainPages.ProspectIndex;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.Locators.ProspectCreateLocators;
import CRM.SubEditPages.Locators.Constants.PC_LocatorsConstants;
import CRM.ViewPages.ProspectView;

/**
 * @author jteja
 *
 */
public class ProspectCreate extends SourcePage {

	public ProspectCreateLocators prospectCreateLocators;
	public PC_LocatorsConstants pc_locatorsConstants;

	/**
	 * 
	 */
	public ProspectCreate() {
		this.prospectCreateLocators = new ProspectCreateLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.prospectCreateLocators);

		this.pc_locatorsConstants = new PC_LocatorsConstants();
	}

	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = pc_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	public ProspectView clickSaveAndSubmit() {
		prospectCreateLocators.pc_save_and_submit_button.click();
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, ProspectView.class);
	}
	
	public ProspectIndex clickDiscard() {
		prospectCreateLocators.pc_discard_button.click();
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, ProspectIndex.class);
	}
	
}
