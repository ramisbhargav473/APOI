/**
 * 
 */
package CRM.ViewPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.ViewPages.Locators.Constants.AV_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class AgreementViewLocators {
	
	@FindBy(css = AV_LocatorsConstants.AV_STATUS)
	public WebElement av_status;
	
	@FindBy(css = AV_LocatorsConstants.AV_CUSTOMER_COPY_BUTTON)
	public WebElement av_customer_copy_button;
	
	@FindBy(css = AV_LocatorsConstants.AV_EDIT_AGREEMENT_BUTTON)
	public WebElement av_edit_agreement_button;

	@FindBy(css=AV_LocatorsConstants.AV_SAVE_AND_SUBMIT_BUTTON)
	public WebElement av_save_and_submit_button;
	
	@FindBy(css = AV_LocatorsConstants.AV_DISCARD_CONF_BUTTON)
	public WebElement av_discard_conf_button;
	
	@FindBy(css = AV_LocatorsConstants.AV_EDIT_QUOTE_BUTTON)
	public WebElement av_edit_quote_button;
	
	@FindBy(css = AV_LocatorsConstants.AV_SUBMIT_CONF_BUTTON)
	public WebElement av_submit_conf_button;
	
}
