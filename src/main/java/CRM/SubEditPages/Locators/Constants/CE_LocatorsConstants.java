/**
 * 
 */
package CRM.SubEditPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class CE_LocatorsConstants {

	public static final String CE_MARK_FAVOURITE_CHECKBOX = "edit-customer mat-checkbox[formcontrolname='isFavourite'] input";
	public static final String CE_CUSTOMER_NAME_TEXTFIELD = "edit-customer mat-form-field input[formcontrolname='name']";
	public static final String CE_COMPANY_LINE1_TEXTFIELD = "edit-customer div[formgroupname='address'] mat-form-field input[formcontrolname='line1']";
	public static final String CE_COMPANY_LINE2_TEXTFIELD = "edit-customer div[formgroupname='address'] mat-form-field input[formcontrolname='line2']";
	public static final String CE_COMPANY_COUNTRY_DROPDOWN = "edit-customer div[formgroupname='address'] mat-select[formcontrolname='countryId'] div[class='mat-select-arrow']";
	public static final String CE_COMPANY_PROVINCE_DROPDOWN = "edit-customer div[formgroupname='address'] mat-select[formcontrolname='provinceId'] div[class='mat-select-arrow']";
	public static final String CE_COMPANY_CITY_TEXTFIELD = "edit-customer div[formgroupname='address'] mat-form-field input[formcontrolname='city']";
	public static final String CE_COMPANY_ZIPCODE_TEXTFIELD = "edit-customer div[formgroupname='address'] mat-form-field input[formcontrolname='postalCode']";
	public static final String CE_BILLING_ADDRESS_SAME_CHECKBOX = "edit-customer div[formgroupname='billingAddress'] mat-checkbox div[class='mat-checkbox-inner-container'] input[type='checkbox']";
	public static final String CE_BILLING_LINE1_TEXTFIELD = "edit-customer div[formgroupname='billingAddress'] mat-form-field input[formcontrolname='line1']";
	public static final String CE_BILLING_LINE2_TEXTFIELD = "edit-customer div[formgroupname='billingAddress'] mat-form-field input[formcontrolname='line2']";
	public static final String CE_BILLING_COUNTRY_DROPDOWN = "edit-customer div[formgroupname='billingAddress'] mat-select[formcontrolname='countryId'] div[class='mat-select-arrow']";
	public static final String CE_BILLING_PROVINCE_DROPDOWN = "edit-customer div[formgroupname='billingAddress'] mat-select[formcontrolname='provinceId'] div[class='mat-select-arrow']";
	public static final String CE_BILLING_CITY_TEXTFIELD = "edit-customer div[formgroupname='billingAddress'] mat-form-field input[formcontrolname='city']";
	public static final String CE_BILLING_ZIPCODE_TEXTFIELD = "edit-customer div[formgroupname='billingAddress'] mat-form-field input[formcontrolname='postalCode']";
	public static final String CE_BILLING_CURRENCY_DROPDOWN = "edit-customer mat-form-field mat-select[formcontrolname='billingCurrencyId'] div[class='mat-select-arrow']";
	public static final String CE_CONTACT_CHIP = "site-contacts div[formarrayname='contacts'] mat-chip-list";
	public static final String CE_PRIMARY_CONTACT_CHECKBOX = "site-contacts div[formarrayname='contacts'] mat-checkbox[formcontrolname='isPrimary'] input[type='checkbox']";
	public static final String CE_CONTACT_NAME_TEXTFIELD = "site-contacts div[formarrayname='contacts'] input[formcontrolname='name']";
	public static final String CE_CONTACT_POSITION_TEXTFIELD = "site-contacts div[formarrayname='contacts'] input[formcontrolname='position']";
	public static final String CE_CONTACT_EMAIL_TEXTFIELD = "site-contacts div[formarrayname='contacts'] input[formcontrolname='email']";
	public static final String CE_PRIMARY_PHONE_TEXTFIELD = "site-contacts div[formarrayname='contacts'] input[formcontrolname='primaryPhoneNumber']";
	public static final String CE_PRIMARY_EXTN_TEXTFIELD = "site-contacts div[formarrayname='contacts'] input[formcontrolname='primaryExtension']";
	public static final String CE_SECONDARY_PHONE_TEXTFIELD = "site-contacts div[formarrayname='contacts'] input[formcontrolname='secondaryPhoneNumber']";
	public static final String CE_SECONDARY_EXTN_TEXTFIELD = "site-contacts div[formarrayname='contacts'] input[formcontrolname='secondaryExtension']";
	public static final String CE_DISCARD_BUTTON = "div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(2)";
	public static final String CE_SAVE_CHANGES_BUTTON = "div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(3)";
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();

	    Class<?> thisClass = null;
	    try {
	        thisClass = Class.forName(this.getClass().getName());

	        Field[] aClassFields = thisClass.getDeclaredFields();
			/* sb.append(this.getClass().getSimpleName() + " [ "); */
	        for(Field f : aClassFields){
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
