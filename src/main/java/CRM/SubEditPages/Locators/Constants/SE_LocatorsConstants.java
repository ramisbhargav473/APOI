/**
 * 
 */
package CRM.SubEditPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class SE_LocatorsConstants {

	public static final String SE_SLIDER_LEFT_BUTTON = "sites div[class='siteComponent__main'] div[class='main__slider'] button:nth-child(1)";
	public static final String SE_SEARCH_SITE_COMBOBOX = "sites div[class='siteComponent__main'] div[class='main__slider'] input[role='combobox']";
	public static final String SE_SLIDER_RIGHT_BUTTON = "sites div[class='siteComponent__main'] div[class='main__slider'] button:nth-child(2)";
	public static final String SE_DETAILS_TAB_BUTTON = "sites div[class='siteComponent__main'] div[class='main__infoSlider'] ul li:nth-child(1)";
	public static final String SE_SITE_NAME_TEXTFIELD = "sites div[class='siteComponent__main'] site-details input[formcontrolname='name']";
	public static final String SE_SALES_REP_DROPDOWN = "sites div[class='siteComponent__main'] site-details mat-select[formcontrolname='salesRepId'] div[class='mat-select-arrow']";
	public static final String SE_SITE_ADDRESS_SAME_CHECKBOX = "sites div[class='siteComponent__main'] site-details mat-checkbox input[type='checkbox']";
	public static final String SE_ADDRESS_LINE1_TEXTFIELD = "sites div[class='siteComponent__main'] site-details input[formcontrolname='addressLine1']";
	public static final String SE_ADDRESS_LINE2_TEXTFIELD = "sites div[class='siteComponent__main'] site-details input[formcontrolname='addressLine2']";
	public static final String SE_ADDRESS_CIY_TEXTFIELD = "sites div[class='siteComponent__main'] site-details input[formcontrolname='city']";
	public static final String SE_ADDRESS_COUNTRY_DROPDOWN = "sites div[class='siteComponent__main'] site-details mat-select[formcontrolname='countryId'] div[class='mat-select-arrow']";
	public static final String SE_ADDRESS_PROVINCE_DROPDOWN = "sites div[class='siteComponent__main'] site-details mat-select[formcontrolname='stateProvinceRegionId'] div[class='mat-select-arrow']";
	public static final String SE_ADDRESS_ZIPCODE_TEXTFIELD = "sites div[class='siteComponent__main'] site-details input[formcontrolname='zipPostalCode']";
	public static final String SE_CONTACT_TAB_BUTTON = "sites div[class='siteComponent__main'] div[class='main__infoSlider'] ul li:nth-child(2)";
	public static final String SE_CONTACT_NAME_TEXTFIELD = "sites div[class='siteComponent__main'] site-contacts input[formcontrolname='contactName']";
	public static final String SE_CONTACT_POSITION_TEXTFIELD = "sites div[class='siteComponent__main'] site-contacts input[formcontrolname='contactPosition']";
	public static final String SE_CONTACT_EMAIL_TEXTFIELD = "sites div[class='siteComponent__main'] site-contacts input[formcontrolname='email']";
	public static final String SE_CONTACT_PRIMARY_PHONE_TEXTFIELD = "sites div[class='siteComponent__main'] site-contacts input[formcontrolname='primaryPhoneNumber']";
	public static final String SE_CONTACT_PRIMARY_EXTN_TEXTFIELD = "sites div[class='siteComponent__main'] site-contacts input[formcontrolname='primaryPhoneNumberExtension']";
	public static final String SE_CONTACT_SECONDARY_PHONE_TEXTFIELD = "sites div[class='siteComponent__main'] site-contacts input[formcontrolname='secondaryPhoneNumber']";
	public static final String SE_CONTACT_SECONDARY_EXTN_TEXTFIELD = "sites div[class='siteComponent__main'] site-contacts input[formcontrolname='secondaryPhoneNumberExtension']";
	public static final String SE_AGREEMENTS_TAB_BUTTON = "sites div[class='siteComponent__main'] div[class='main__infoSlider'] ul li:nth-child(3)";
	public static final String SE_CREATE_REPORT_BUTTON = "sites div[class='siteComponent__main'] site-agreements button";
	public static final String SE_AGREEMENTS_RESULTS = "sites div[class='siteComponent__main'] site-agreements table tbody";
	public static final String SE_DOCUMENTS_TAB_BUTTON = "sites div[class='siteComponent__main'] div[class='main__infoSlider'] ul li:nth-child(4)";
	public static final String SE_UPLOAD_DOCUMENTS_LINK = "sites div[class='siteComponent__main'] site-documents input[id='file']";
	public static final String SE_COMMENTS_TAB_BUTTON = "sites div[class='siteComponent__main'] div[class='main__infoSlider'] ul li:nth-child(5)";
	public static final String SE_HISTORY_TAB_BUTTON = "sites div[class='siteComponent__main'] div[class='main__infoSlider'] ul li:nth-child(6)";
	public static final String SE_DISCARD_BUTTON = "sites div[class=' siteComponent__header'] button:nth-child(1)";
	public static final String SE_SAVE_SITE_CHANGES_BUTTON = "sites div[class=' siteComponent__header'] button:nth-child(2)";

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
