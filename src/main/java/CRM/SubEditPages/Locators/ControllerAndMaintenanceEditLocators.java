/**
 * 
 */
package CRM.SubEditPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.SubEditPages.Locators.Constants.CnMEdit_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class ControllerAndMaintenanceEditLocators {

	@FindBy(css = CnMEdit_LocatorsConstants.CNM_EDIT_REGION_DROPDOWN)
	public WebElement cnm_edit_region_dropdown;
	@FindBy(css = CnMEdit_LocatorsConstants.CNM_EDIT_BUSINESS_UNIT_DROPDOWN)
	public WebElement cnm_edit_business_unit_dropdown;
	@FindBy(css = CnMEdit_LocatorsConstants.CNM_EDIT_APPROVALS_CHECKBOX)
	public WebElement cnm_edit_approvals_checkbox;
	@FindBy(css=CnMEdit_LocatorsConstants.CNM_EDIT_DISCARD_BUTTON)
	public WebElement cnm_edit_discard_button;
	@FindBy(css=CnMEdit_LocatorsConstants.CNM_EDIT_PUBLISH_BUTTON)
	public WebElement cnm_edit_publish_button;
	

}
