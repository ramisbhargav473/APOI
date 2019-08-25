/**
 * 
 */
package CRM.SubEditPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.SubEditPages.Locators.Constants.SC_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class SiteCreateLocators {

	@FindBy(css = SC_LocatorsConstants.SC_ADDRESS_CIY_TEXTFIELD)
	public WebElement sc_address_ciy_textfield;
	@FindBy(css = SC_LocatorsConstants.SC_ADDRESS_COUNTRY_DROPDOWN)
	public WebElement sc_address_country_dropdown;
	@FindBy(css = SC_LocatorsConstants.SC_ADDRESS_PROVINCE_DROPDOWN)
	public WebElement sc_address_province_dropdown;
	@FindBy(css = SC_LocatorsConstants.SC_ADDRESS_ZIPCODE_TEXTFIELD)
	public WebElement sc_address_zipcode_textfield;
	@FindBy(css = SC_LocatorsConstants.SC_CONTACT_NAME_TEXTFIELD)
	public WebElement sc_contact_name_textfield;
	@FindBy(css = SC_LocatorsConstants.SC_CONTACT_POSITION_TEXTFIELD)
	public WebElement sc_contact_position_textfield;
	@FindBy(css = SC_LocatorsConstants.SC_CONTACT_EMAIL_TEXTFIELD)
	public WebElement sc_contact_email_textfield;
	@FindBy(css = SC_LocatorsConstants.SC_CONTACT_PRIMARY_PHONE_TEXTFIELD)
	public WebElement sc_contact_primary_phone_textfield;
	@FindBy(css = SC_LocatorsConstants.SC_CONTACT_PRIMARY_EXTN_TEXTFIELD)
	public WebElement sc_contact_primary_extn_textfield;
	@FindBy(css = SC_LocatorsConstants.SC_CONTACT_SECONDARY_PHONE_TEXTFIELD)
	public WebElement sc_contact_secondary_phone_textfield;
	@FindBy(css = SC_LocatorsConstants.SC_CONTACT_SECONDARY_EXTN_TEXTFIELD)
	public WebElement sc_contact_secondary_extn_textfield;
	@FindBy(css = SC_LocatorsConstants.SC_DISCARD_BUTTON)
	public WebElement sc_discard_button;
	@FindBy(css = SC_LocatorsConstants.SC_SAVEANDSUBMIT_BUTTON)
	public WebElement sc_saveandsubmit_button;
	@FindBy(css = SC_LocatorsConstants.SC_SAVE_SUCCESS_BANNER)
	public WebElement sc_save_success_banner;
	@FindBy(css = SC_LocatorsConstants.SC_SAVE_FAILURE_BANNER)
	public WebElement sc_save_failure_banner;

}
