/**
 * 
 */
package CRM.SubEditPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class PE_LocatorsConstants {
	
	/*-------------------------------------------------Prospect Edit Page Locators--------------------------------------------*/

	public static final String PE_COMPANY_NAME_TEXTFIELD = "div[class='container_main prospect_header'] div[class='mat-form-field-infix'] input[id='id_companyName']";
	public static final String PE_BUSINESS_TYPE_DROPDOWN = "div[class='container_main prospect_header'] div[class='mat-form-field-infix'] mat-select[id='id_customerBusinessTypeId'] div[class='mat-select-arrow']";
	public static final String PE_WEBSITE_TEXTFIELD = "div[class='container_main prospect_header'] div[class='mat-form-field-infix'] input[id='id_website']";
	public static final String PE_SALESREP_DROPDOWN = "div[class='container_main prospect_header'] div[class='mat-form-field-infix'] mat-select[id='id_salesRepId'] div[class='mat-select-arrow']";
	public static final String PE_PROSPECT_LEVELINDICATOR = "div[class='container_main prospect_card'] div[class='lead_details_slider_container'] div[class='flex_row slider_text_container']";
	public static final String PE_BUSINESS_UNIT_DROPDOWN = "div[class='container_main prospect_card'] div[class='mat-form-field-infix'] mat-select[id='id_businessUnitId'] div[class='mat-select-arrow']";
	public static final String PE_COMPETITOR_AGREEMENT_EXPIRY_DATE_TEXTFIELD = "div[class='container_main prospect_card'] div[class='mat-form-field-infix'] input[id='id_competitorAgreementExpiryDate']";
	public static final String PE_COMPETITOR_DROPDOWN = "div[class='prospect_card_sub'] div[class='mat-form-field-infix'] mat-select[id='id_competitorId'] div[class='mat-select-arrow']";
	public static final String PE_EXPIRY_DATE_OBTAINED_ON_TEXTFIELD = "div[class='container_main prospect_card'] div[class='mat-form-field-infix'] input[id='id_competitorAgreementExpiryDateObtainedOn']";
	public static final String PE_SERVICE_LINE_DROPODOWN = "div[class='container_main prospect_card'] prospect-lead-details prospect-service-estimation-collection button";
	public static final String PE_SERVICE_TYPE_DROPDOWN = "div[class='container_main prospect_card'] div[class='mat-form-field-infix'] mat-select[id='id_serviceTypeId'] div[class='mat-select-arrow']";
	public static final String PE_ESTIMATED_AMOUNT_TEXTFIELD = "div[class='container_main prospect_card'] div[class='mat-form-field-infix'] input[id='id_serviceEstimatedAmount']";
	public static final String PE_CONTAINER_SIZE_DROPDOWN = "div[class='container_main prospect_card'] div[class='mat-form-field-infix'] mat-select[id='id_containerSizeId'] div[class='mat-select-arrow']";
	public static final String PE_FREQUENCY_DROPDOWN = "div[class='container_main prospect_card'] div[class='mat-form-field-infix'] mat-select[id='id_serviceFrequencyId'] div[class='mat-select-arrow']";
	public static final String PE_ADD_CONTACT_BUTTON = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection mat-chip-list mat-chip[class='add_button mat-chip mat-primary mat-standard-chip']";
	public static final String PE_PRIMARY_CONTACT_CHECKBOX = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection wishes-contact mat-checkbox[formcontrolname='isPrimaryContact'] input";
	public static final String PE_CONTACT_NAME_TEXTFIELD = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection wishes-contact mat-form-field input[formcontrolname='contactName']";
	public static final String PE_CONTACT_POSITION_TEXTFIELD = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection wishes-contact mat-form-field input[formcontrolname='contactPosition']";
	public static final String PE_CONTACT_EMAIL_TEXTFIELD = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection wishes-contact mat-form-field input[formcontrolname='email']";
	public static final String PE_CONTACT_PRIMARY_PHONE_TEXTFIELD = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection wishes-contact mat-form-field input[formcontrolname='primaryPhoneNumber']";
	public static final String PE_CONTACT_PRIMARY_EXTN_TEXTFIELD = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection wishes-contact mat-form-field input[formcontrolname='primaryPhoneNumberExtension']";
	public static final String PE_CONTACT_SECONDARY_PHONE_TEXTFIELD = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection wishes-contact mat-form-field input[formcontrolname='secondaryPhoneNumber']";
	public static final String PE_CONTACT_SECONDARY_EXTN_TEXTFIELD = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection wishes-contact mat-form-field input[formcontrolname='secondaryPhoneNumberExtension']";
	public static final String PE_DELETE_CONTACT_BUTTON = "div[class='container_main prospect_card'] prospect-contact-details wishes-contact-collection button[class='button_main_red ng-star-inserted']";
	public static final String PE_COMPANY_LINE1_TEXTFIELD = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(1) wishes-address input[id='id_addressLine1']";
	public static final String PE_COMPANY_LINE2_TEXTFIELD = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(1) wishes-address input[id='id_addressLine2']";
	public static final String PE_COMPANY_CITY_TEXTFIELD = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(1) wishes-address input[id='id_city']";
	public static final String PE_COMPANY_ADDRESS_COUNTRY_DROPDOWN = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(1) wishes-address mat-select[id='id_countryId'] div[class='mat-select-arrow']";
	public static final String PE_COMPANY_ADDRESS_PROVINCE_DROPDOWN = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(1) wishes-address mat-select[id='id_stateProvinceRegionId'] div[class='mat-select-arrow']";
	public static final String PE_COMPANY_ADDRESS_ZIPCODE_TEXTFIELD = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(1) wishes-address input[id='id_zipPostalCode']";
	public static final String PE_BILLING_ADDRESS_SAME_CHECKBOX = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(2) mat-checkbox label div input";
	public static final String PE_BILLING_ADDRESS_LINE1_TEXTFIELD = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(2) wishes-address input[id='id_addressLine1']";
	public static final String PE_BILLING_ADDRESS_LINE2_TEXTFIELD = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(2) wishes-address input[id='id_addressLine2']";
	public static final String PE_BILLING_ADDRESS_CITY_TEXTFIELD = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(2) wishes-address input[id='id_city']";
	public static final String PE_BILLING_ADDRESS_COUNTRY_DROPDOWN = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(2) wishes-address mat-select[id='id_countryId'] div[class='mat-select-arrow']";
	public static final String PE_BILLING_ADDRESS_PROVINCE_DROPDOWN = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(2) wishes-address mat-select[id='id_stateProvinceRegionId'] div[class='mat-select-arrow']";
	public static final String PE_BILLING_ADDRESS_ZIPCODE_TEXTFIELD = "div[class='container_main prospect_card'] prospect-company-and-billing-address div div div:nth-child(2) wishes-address input[id='id_zipPostalCode']";
	public static final String PE_DISCARD_BUTTON = "div[class='buttons_sticky_bottom'] button:nth-child(1)";
	public static final String PE_SAVEANDSUBMIT_BUTTON = "div[class='buttons_sticky_bottom'] button:nth-child(2)";
	public static final String PE_SAVE_SUCCESS_BANNER = "div[class='cdk-overlay-container'] div[class='cdk-global-overlay-wrapper'] div[class='cdk-overlay-pane'] snack-bar-container success-snack-bar";
	public static final String PE_SAVE_FAILURE_BANNER = "div[class='cdk-overlay-container'] div[class='cdk-global-overlay-wrapper'] div[class='cdk-overlay-pane'] snack-bar-container validation-snack-bar";
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		Class<?> thisClass = null;
		try {
			thisClass = Class.forName(this.getClass().getName());

			Field[] aClassFields = thisClass.getDeclaredFields();
			/* sb.append(this.getClass().getSimpleName() + " [ "); */
			for (Field f : aClassFields) {
				String fName = f.getName();
				sb.append(fName + " = " + f.get(this) + ",");
			}
			/* sb.append("]"); */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sb.toString();
	}

}
