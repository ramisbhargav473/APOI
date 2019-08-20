package CRM.MainPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.MainPages.Locators.ControllerAndMaintenanceLocators;
import CRM.MainPages.Locators.Constants.CnM_LocatorsConstants;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.SubEditPages.ControllerAndMaintenanceEdit;

/**
 * @author jteja
 *
 */
public class ControllerAndMaintenance extends SourcePage{

	public ControllerAndMaintenanceLocators controllerAndMaintenanceLocators;
	public CnM_LocatorsConstants cnm_locatorsConstants;
	
	public ControllerAndMaintenance() {
		this.controllerAndMaintenanceLocators = new ControllerAndMaintenanceLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.controllerAndMaintenanceLocators);
		
		this.cnm_locatorsConstants = new CnM_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = cnm_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	public ControllerAndMaintenanceEdit clickEdit() {
		KeywordsUtil.click(controllerAndMaintenanceLocators.cnm_edit_button);
		return PageFactory.initElements(wwDriver, ControllerAndMaintenanceEdit.class);
	}

}
