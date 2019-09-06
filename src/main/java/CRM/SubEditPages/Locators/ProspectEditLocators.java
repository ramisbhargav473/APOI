package CRM.SubEditPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.SubEditPages.Locators.Constants.PC_LocatorsConstants;
import CRM.SubEditPages.Locators.Constants.PE_LocatorsConstants;

public class ProspectEditLocators {

	@FindBy(css = PE_LocatorsConstants.PE_COMPANY_NAME_TEXTFIELD)
	public WebElement pe_company_name_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_BUSINESS_TYPE_DROPDOWN)
	public WebElement pe_business_type_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_WEBSITE_TEXTFIELD)
	public WebElement pe_website_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_SALESREP_DROPDOWN)
	public WebElement pe_salesrep_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_PROSPECT_LEVELINDICATOR)
	public WebElement pe_prospect_levelindicator;
	@FindBy(css = PE_LocatorsConstants.PE_BUSINESS_UNIT_DROPDOWN)
	public WebElement pe_business_unit_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_COMPETITOR_AGREEMENT_EXPIRY_DATE_TEXTFIELD)
	public WebElement pe_competitor_agreement_expiry_date_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_COMPETITOR_DROPDOWN)
	public WebElement pe_competitor_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_EXPIRY_DATE_OBTAINED_ON_TEXTFIELD)
	public WebElement pe_expiry_date_obtained_on_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_SERVICE_LINE_DROPODOWN)
	public WebElement pe_service_line_dropodown;
	@FindBy(css = PE_LocatorsConstants.PE_SERVICE_TYPE_DROPDOWN)
	public WebElement pe_service_type_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_ESTIMATED_AMOUNT_TEXTFIELD)
	public WebElement pe_estimated_amount_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_CONTAINER_SIZE_DROPDOWN)
	public WebElement pe_container_size_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_FREQUENCY_DROPDOWN)
	public WebElement pe_frequency_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_ADD_CONTACT_BUTTON)
	public WebElement pe_add_contact_button;
	@FindBy(css = PE_LocatorsConstants.PE_PRIMARY_CONTACT_CHECKBOX)
	public WebElement pe_primary_contact_checkbox;
	@FindBy(css = PE_LocatorsConstants.PE_CONTACT_NAME_TEXTFIELD)
	public WebElement pe_contact_name_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_CONTACT_POSITION_TEXTFIELD)
	public WebElement pe_contact_position_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_CONTACT_EMAIL_TEXTFIELD)
	public WebElement pe_contact_email_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_CONTACT_PRIMARY_PHONE_TEXTFIELD)
	public WebElement pe_contact_primary_phone_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_CONTACT_PRIMARY_EXTN_TEXTFIELD)
	public WebElement pe_contact_primary_extn_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_CONTACT_SECONDARY_PHONE_TEXTFIELD)
	public WebElement pe_contact_secondary_phone_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_CONTACT_SECONDARY_EXTN_TEXTFIELD)
	public WebElement pe_contact_secondary_extn_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_DELETE_CONTACT_BUTTON)
	public WebElement pe_delete_contact_button;
	@FindBy(css = PE_LocatorsConstants.PE_COMPANY_LINE1_TEXTFIELD)
	public WebElement pe_company_line1_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_COMPANY_LINE2_TEXTFIELD)
	public WebElement pe_company_line2_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_COMPANY_CITY_TEXTFIELD)
	public WebElement pe_company_city_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_COMPANY_ADDRESS_COUNTRY_DROPDOWN)
	public WebElement pe_company_address_country_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_COMPANY_ADDRESS_PROVINCE_DROPDOWN)
	public WebElement pe_company_address_province_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_COMPANY_ADDRESS_ZIPCODE_TEXTFIELD)
	public WebElement pe_company_address_zipcode_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_BILLING_ADDRESS_SAME_CHECKBOX)
	public WebElement pe_billing_address_same_checkbox;
	@FindBy(css = PE_LocatorsConstants.PE_BILLING_ADDRESS_LINE1_TEXTFIELD)
	public WebElement pe_billing_address_line1_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_BILLING_ADDRESS_LINE2_TEXTFIELD)
	public WebElement pe_billing_address_line2_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_BILLING_ADDRESS_CITY_TEXTFIELD)
	public WebElement pe_billing_address_city_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_BILLING_ADDRESS_COUNTRY_DROPDOWN)
	public WebElement pe_billing_address_country_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_BILLING_ADDRESS_PROVINCE_DROPDOWN)
	public WebElement pe_billing_address_province_dropdown;
	@FindBy(css = PE_LocatorsConstants.PE_BILLING_ADDRESS_ZIPCODE_TEXTFIELD)
	public WebElement pe_billing_address_zipcode_textfield;
	@FindBy(css = PE_LocatorsConstants.PE_DISCARD_BUTTON)
	public WebElement pe_discard_button;
	@FindBy(css = PE_LocatorsConstants.PE_SAVEANDSUBMIT_BUTTON)
	public WebElement pe_saveandsubmit_button;
	@FindBy(css = PE_LocatorsConstants.PE_SAVE_SUCCESS_BANNER)
	public WebElement pe_save_success_banner;
	@FindBy(css = PE_LocatorsConstants.PE_SAVE_FAILURE_BANNER)
	public WebElement pe_save_failure_banner;

}
