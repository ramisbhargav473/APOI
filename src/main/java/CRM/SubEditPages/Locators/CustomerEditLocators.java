package CRM.SubEditPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.SubEditPages.Locators.Constants.CE_LocatorsConstants;

public class CustomerEditLocators {

	@FindBy(css = CE_LocatorsConstants.CE_MARK_FAVOURITE_CHECKBOX)
	public WebElement ce_mark_favourite_checkbox;
	@FindBy(css = CE_LocatorsConstants.CE_CUSTOMER_NAME_TEXTFIELD)
	public WebElement ce_customer_name_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_COMPANY_LINE1_TEXTFIELD)
	public WebElement ce_company_line1_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_COMPANY_LINE2_TEXTFIELD)
	public WebElement ce_company_line2_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_COMPANY_COUNTRY_DROPDOWN)
	public WebElement ce_company_country_dropdown;
	@FindBy(css = CE_LocatorsConstants.CE_COMPANY_PROVINCE_DROPDOWN)
	public WebElement ce_company_province_dropdown;
	@FindBy(css = CE_LocatorsConstants.CE_COMPANY_CITY_TEXTFIELD)
	public WebElement ce_company_city_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_COMPANY_ZIPCODE_TEXTFIELD)
	public WebElement ce_company_zipcode_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_BILLING_ADDRESS_SAME_CHECKBOX)
	public WebElement ce_billing_address_same_checkbox;
	@FindBy(css = CE_LocatorsConstants.CE_BILLING_LINE1_TEXTFIELD)
	public WebElement ce_billing_line1_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_BILLING_LINE2_TEXTFIELD)
	public WebElement ce_billing_line2_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_BILLING_COUNTRY_DROPDOWN)
	public WebElement ce_billing_country_dropdown;
	@FindBy(css = CE_LocatorsConstants.CE_BILLING_PROVINCE_DROPDOWN)
	public WebElement ce_billing_province_dropdown;
	@FindBy(css = CE_LocatorsConstants.CE_BILLING_CITY_TEXTFIELD)
	public WebElement ce_billing_city_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_BILLING_ZIPCODE_TEXTFIELD)
	public WebElement ce_billing_zipcode_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_BILLING_CURRENCY_DROPDOWN)
	public WebElement ce_billing_currency_dropdown;
	@FindBy(css = CE_LocatorsConstants.CE_CONTACT_CHIP)
	public WebElement ce_contact_chip;
	@FindBy(css = CE_LocatorsConstants.CE_PRIMARY_CONTACT_CHECKBOX)
	public WebElement ce_primary_contact_checkbox;
	@FindBy(css = CE_LocatorsConstants.CE_CONTACT_NAME_TEXTFIELD)
	public WebElement ce_contact_name_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_CONTACT_POSITION_TEXTFIELD)
	public WebElement ce_contact_position_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_CONTACT_EMAIL_TEXTFIELD)
	public WebElement ce_contact_email_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_PRIMARY_PHONE_TEXTFIELD)
	public WebElement ce_primary_phone_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_PRIMARY_EXTN_TEXTFIELD)
	public WebElement ce_primary_extn_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_SECONDARY_PHONE_TEXTFIELD)
	public WebElement ce_secondary_phone_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_SECONDARY_EXTN_TEXTFIELD)
	public WebElement ce_secondary_extn_textfield;
	@FindBy(css = CE_LocatorsConstants.CE_DISCARD_BUTTON)
	public WebElement ce_discard_button;
	@FindBy(css = CE_LocatorsConstants.CE_SAVE_CHANGES_BUTTON)
	public WebElement ce_save_changes_button;

}
