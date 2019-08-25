/**
 * 
 */
package CRM.SubEditPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class SC_LocatorsConstants {
	
	public static final String SC_SITE_NAME_TEXTFIELD = "input[formcontrolname='siteName']";
	public static final String SC_SALES_REP_DROPDOWN = "mat-select[formcontrolname='salesRepId'] div[class='mat-select-arrow']";
	public static final String SC_SITE_ADDRESS_SAME_CHECKBOX = "mat-checkbox[formcontrolname='siteAddressSameAsCompanyAddress'] input[type='checkbox']";
	public static final String SC_ADDRESS_LINE1_TEXTFIELD = "input[formcontrolname='addressLine1']";
	public static final String SC_ADDRESS_LINE2_TEXTFIELD = "input[formcontrolname='addressLine2']";
	public static final String SC_ADDRESS_CIY_TEXTFIELD = "input[formcontrolname='city']";
	public static final String SC_ADDRESS_COUNTRY_DROPDOWN = "mat-select[formcontrolname='countryId'] div[class='mat-select-arrow']";
	public static final String SC_ADDRESS_PROVINCE_DROPDOWN = "mat-select[formcontrolname='stateProvinceRegionId'] div[class='mat-select-arrow']";
	public static final String SC_ADDRESS_ZIPCODE_TEXTFIELD = "input[formcontrolname='zipPostalCode']";
	public static final String SC_CONTACT_NAME_TEXTFIELD = "input[formcontrolname='contactName']";
	public static final String SC_CONTACT_POSITION_TEXTFIELD = "input[formcontrolname='contactPosition']";
	public static final String SC_CONTACT_EMAIL_TEXTFIELD = "input[formcontrolname='email']";
	public static final String SC_CONTACT_PRIMARY_PHONE_TEXTFIELD = "input[formcontrolname='primaryPhoneNumber']";
	public static final String SC_CONTACT_PRIMARY_EXTN_TEXTFIELD = "input[formcontrolname='primaryPhoneNumberExtension']";
	public static final String SC_CONTACT_SECONDARY_PHONE_TEXTFIELD = "input[formcontrolname='secondaryPhoneNumber']";
	public static final String SC_CONTACT_SECONDARY_EXTN_TEXTFIELD = "input[formcontrolname='secondaryPhoneNumberExtension']";
	public static final String SC_DISCARD_BUTTON = "div[class='buttons_sticky_bottom ng-star-inserted'] button:nth-child(1)";
	public static final String SC_SAVEANDSUBMIT_BUTTON = "div[class='buttons_sticky_bottom ng-star-inserted'] button:nth-child(2)";
	public static final String SC_SAVE_SUCCESS_BANNER = "div[class='cdk-overlay-container'] div[class='cdk-global-overlay-wrapper'] div[class='cdk-overlay-pane'] snack-bar-container success-snack-bar";
	public static final String SC_SAVE_FAILURE_BANNER = "div[class='cdk-overlay-container'] div[class='cdk-global-overlay-wrapper'] div[class='cdk-overlay-pane'] snack-bar-container validation-snack-bar";

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
