/**
 * 
 */
package CRM.SubEditPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.MainPages.ControllerAndMaintenance;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.SubEditPages.Locators.ControllerAndMaintenanceEditLocators;
import CRM.SubEditPages.Locators.Constants.CnMEdit_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class ControllerAndMaintenanceEdit extends SourcePage{
	
	public ControllerAndMaintenanceEditLocators controllerAndMaintenanceEditLocators;
	public CnMEdit_LocatorsConstants cnmEdit_locatorsConstants;
	
	public ControllerAndMaintenanceEdit() {
		this.controllerAndMaintenanceEditLocators = new ControllerAndMaintenanceEditLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.controllerAndMaintenanceEditLocators);
		
		this.cnmEdit_locatorsConstants = new CnMEdit_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = cnmEdit_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}

	/**
	 * 
	 */
	public ControllerAndMaintenance clickPublish() {
		KeywordsUtil.click(controllerAndMaintenanceEditLocators.cnm_edit_publish_button);
		return PageFactory.initElements(wwDriver, ControllerAndMaintenance.class);
		
	}

}
