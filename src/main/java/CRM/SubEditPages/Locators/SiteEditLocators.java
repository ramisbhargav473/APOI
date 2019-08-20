package CRM.SubEditPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.SubEditPages.Locators.Constants.SE_LocatorsConstants;

public class SiteEditLocators {

	@FindBy(css = SE_LocatorsConstants.SE_SLIDER_LEFT_BUTTON)
	public WebElement se_slider_left_button;
	@FindBy(css = SE_LocatorsConstants.SE_SEARCH_SITE_COMBOBOX)
	public WebElement se_search_site_combobox;
	@FindBy(css = SE_LocatorsConstants.SE_SLIDER_RIGHT_BUTTON)
	public WebElement se_slider_right_button;
	@FindBy(css = SE_LocatorsConstants.SE_DETAILS_TAB_BUTTON)
	public WebElement se_details_tab_button;
	@FindBy(css = SE_LocatorsConstants.SE_SITE_NAME_TEXTFIELD)
	public WebElement se_site_name_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_SALES_REP_DROPDOWN)
	public WebElement se_sales_rep_dropdown;
	@FindBy(css = SE_LocatorsConstants.SE_SITE_ADDRESS_SAME_CHECKBOX)
	public WebElement se_site_address_same_checkbox;
	@FindBy(css = SE_LocatorsConstants.SE_ADDRESS_LINE1_TEXTFIELD)
	public WebElement se_address_line1_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_ADDRESS_LINE2_TEXTFIELD)
	public WebElement se_address_line2_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_ADDRESS_CIY_TEXTFIELD)
	public WebElement se_address_ciy_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_ADDRESS_COUNTRY_DROPDOWN)
	public WebElement se_address_country_dropdown;
	@FindBy(css = SE_LocatorsConstants.SE_ADDRESS_PROVINCE_DROPDOWN)
	public WebElement se_address_province_dropdown;
	@FindBy(css = SE_LocatorsConstants.SE_ADDRESS_ZIPCODE_TEXTFIELD)
	public WebElement se_address_zipcode_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_CONTACT_TAB_BUTTON)
	public WebElement se_contact_tab_button;
	@FindBy(css = SE_LocatorsConstants.SE_CONTACT_NAME_TEXTFIELD)
	public WebElement se_contact_name_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_CONTACT_POSITION_TEXTFIELD)
	public WebElement se_contact_position_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_CONTACT_EMAIL_TEXTFIELD)
	public WebElement se_contact_email_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_CONTACT_PRIMARY_PHONE_TEXTFIELD)
	public WebElement se_contact_primary_phone_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_CONTACT_PRIMARY_EXTN_TEXTFIELD)
	public WebElement se_contact_primary_extn_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_CONTACT_SECONDARY_PHONE_TEXTFIELD)
	public WebElement se_contact_secondary_phone_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_CONTACT_SECONDARY_EXTN_TEXTFIELD)
	public WebElement se_contact_secondary_extn_textfield;
	@FindBy(css = SE_LocatorsConstants.SE_AGREEMENTS_TAB_BUTTON)
	public WebElement se_agreements_tab_button;
	@FindBy(css = SE_LocatorsConstants.SE_CREATE_REPORT_BUTTON)
	public WebElement se_create_report_button;
	@FindBy(css = SE_LocatorsConstants.SE_AGREEMENTS_RESULTS)
	public WebElement se_agreements_results;
	@FindBy(css = SE_LocatorsConstants.SE_DOCUMENTS_TAB_BUTTON)
	public WebElement se_documents_tab_button;
	@FindBy(css = SE_LocatorsConstants.SE_UPLOAD_DOCUMENTS_LINK)
	public WebElement se_upload_documents_link;
	@FindBy(css = SE_LocatorsConstants.SE_COMMENTS_TAB_BUTTON)
	public WebElement se_comments_tab_button;
	@FindBy(css = SE_LocatorsConstants.SE_HISTORY_TAB_BUTTON)
	public WebElement se_history_tab_button;
	@FindBy(css = SE_LocatorsConstants.SE_DISCARD_BUTTON)
	public WebElement se_discard_button;
	@FindBy(css = SE_LocatorsConstants.SE_SAVE_SITE_CHANGES_BUTTON)
	public WebElement se_save_site_changes_button;

}
