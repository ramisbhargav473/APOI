/**
 * 
 */
package CRM.SubEditPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class AC_LocatorsConstants {

	public static final String AC_HOME_LINK = "create div[class='bread_crumbs_container'] a:nth-child(1)";
	public static final String AC_AGREEMENTS_LINK = "create div[class='bread_crumbs_container'] a:nth-child(2)";
	public static final String AC_CREATE_AGREEMENT_LINK = "create div[class='stepper_wrapper'] div[class='stepper_item']:nth-child(1)";
	public static final String AC_REVIEW_DETAILS_LINK = "create div[class='stepper_wrapper'] div[class='stepper_item']:nth-child(2)";
	public static final String AC_CUSTOMER_COPY_LINK = "create div[class='stepper_wrapper'] div[class='stepper_item']:nth-child(3)";
	public static final String AC_AGREEMENT_NAME_COMBOBOX = "create div[class='container_card cards__container'] input[aria-label='Agreement']";
	public static final String AC_PO_NUMBER_TEXTFIELD = "create div[class='container_card cards__container'] input[formcontrolname='poNumber']";
	public static final String AC_CREATED_ON_TEXTFIELD = "create div[class='container_card cards__container'] input[formcontrolname='createdOn']";
	public static final String AC_EFFECTIVE_OF_TEXTFIELD = "create div[class='container_card cards__container'] input[formcontrolname='effectiveDate']";
	public static final String AC_MARK_AS_URGENT_CHECKBOX = "create div[class='container_card cards__container'] mat-checkbox input[type='checkbox']";
	public static final String AC_EXPIRES_ON_DROPDOWN = "create div[class='container_card cards__container'] mat-select[formcontrolname='term'] div[class='mat-select-arrow']";
	public static final String AC_CUSTOMER_NAME_COMBOBOX = "create div[class='billingInfo__customerInfo'] input[role='combobox']";
	public static final String AC_SITE_NAME_COMBOBOX = "create div[class='billingInfo__customerInfo ng-star-inserted'] input[role='combobox']";
	public static final String AC_ADD_NEW_SITE_BUTTON = "create > div.createComponent > div.createComponent__cards > form > span > div:nth-child(2) > div.button_container_right > button";
	public static final String AC_SITE_NAME_TEXTFIELD = "add-new-site input[formcontrolname='name']";
	public static final String AC_SITE_SALESREP_DROPDOWN = "add-new-site mat-select[formcontrolname='salesRepId'] div[class='mat-select-arrow']";
	public static final String AC_SITE_ADDRESS_LINE1_TEXTFIELD = "add-new-site input[formcontrolname='line1']";
	public static final String AC_SITE_ADDRESS_LINE2_TEXTFIELD = "add-new-site input[formcontrolname='line2']";
	public static final String AC_SITE_ADDRESS_COUNTRY_DROPDOWN = "add-new-site mat-select[formcontrolname='countryId'] div[class='mat-select-arrow']";
	public static final String AC_SITE_ADDRESS_PROVINCE_DROPDOWN = "add-new-site mat-select[formcontrolname='provinceId'] div[class='mat-select-arrow']";
	public static final String AC_SITE_ADDRESS_CITY_TEXTFIELD = "add-new-site input[formcontrolname='city']";
	public static final String AC_SITE_ADDRESS_ZIPCODE_TEXTFIELD = "add-new-site input[formcontrolname='postalCode']";
	public static final String AC_SITE_CONTACT_PRIMARY_CHECKBOX = "add-new-site mat-checkbox[formcontrolname='isPrimary'] input[type='checkbox']";
	public static final String AC_SITE_CONTACT_NAME_TEXTFIELD = "add-new-site form[formarrayname='contacts'] input[formcontrolname='name']";
	public static final String AC_SITE_CONTACT_POSITION_TEXTFIELD = "add-new-site input[formcontrolname='position']";
	public static final String AC_SITE_CONTACT_EMAIL_TEXTFIELD = "add-new-site input[formcontrolname='email']";
	public static final String AC_SITE_CONTACT_PRIMARY_PHONE_TEXTFIELD = "add-new-site input[formcontrolname='primaryPhoneNumber']";
	public static final String AC_SITE_CONTACT_PRIMARY_EXTN_TEXTFIELD = "add-new-site input[formcontrolname='primaryExtension']";
	public static final String AC_SITE_CONTACT_SECONDARY_PHONE_TEXTFIELD = "add-new-site input[formcontrolname='secondaryPhoneNumber']";
	public static final String AC_SITE_CONTACT_SECONDARY_EXTN_TEXTFIELD = "add-new-site input[formcontrolname='secondaryExtension']";
	public static final String AC_SITE_DISCARD_BUTTON = "div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(1)";
	public static final String AC_SITE_SAVE_BUTTON = "div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(2)";
	public static final String AC_ADD_NEW_SERVICE_BUTTON = "create > div.createComponent > div.createComponent__cards > form > span > div:nth-child(3) > div > button";
	public static final String AC_DISCARD_BUTTON = "div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(1)";
	public static final String AC_SAVE_AS_QUOTE_BUTTON = "create > div.buttons_sticky_bottom.customer_views.ng-star-inserted > button.button_main_white.createComponent__bottomButton";
	public static final String AC_NEXT_BUTTON = "div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(3)";
	
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
