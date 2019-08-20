/**
 * 
 */
package CRM.MainPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.MainPages.Locators.Constants.CnM_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class ControllerAndMaintenanceLocators {

	@FindBy(css = CnM_LocatorsConstants.CNM_REGION_DROPDOWN)
	public WebElement cnm_region_dropdown;
	@FindBy(css = CnM_LocatorsConstants.CNM_BUSINESS_UNIT_DROPDOWN)
	public WebElement cnm_business_unit_dropdown;
	@FindBy(css = CnM_LocatorsConstants.CNM_EDIT_BUTTON)
	public WebElement cnm_edit_button;

}
