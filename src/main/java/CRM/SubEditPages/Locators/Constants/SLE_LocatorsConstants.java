/**
 * 
 */
package CRM.SubEditPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class SLE_LocatorsConstants {
	
	public static final String SLE_HOME_LINK = "create-service-line div[class='viewComponent__container'] div[class='title_container'] div[class='bread_crumbs'] a:nth-child(1)";
	public static final String SLE_AGREEMENTS_LINK = "create-service-line div[class='viewComponent__container'] div[class='title_container'] div[class='bread_crumbs'] a:nth-child(2)";
	public static final String SLE_SERVICE_TYPE_DROPDOWN = "mat-select[formcontrolname='serviceTypeId'] div[class='mat-select-arrow']";
	public static final String SLE_MARGIN_RADIO = "create-service-line div[class='viewComponent__container'] div[class='customerIntroContainer__customerIntro'] mat-radio-group";
	public static final String SLE_CONTAINER_COUNT_TEXTFIELD = "front-end-service div[class='full_card'] mat-form-field input[formcontrolname='containerCount']";
	public static final String SLE_SERVICE_FREQUENCY_DROPDOWN = "front-end-service div[class='full_card'] mat-form-field mat-select[formcontrolname='serviceFrequencyId'] div[class='mat-select-arrow']";
	public static final String SLE_CONTAINER_TYPE_DROPDOWN = "front-end-service div[class='full_card'] mat-form-field mat-select[formcontrolname='containerTypeId'] div[class='mat-select-arrow']";
	public static final String SLE_CONTAINER_SIZE_DROPDOWN = "front-end-service div[class='full_card'] mat-form-field mat-select[formcontrolname='containerSizeId'] div[class='mat-select-arrow']";
	public static final String SLE_MATERIAL_TYPE_DROPDOWN = "front-end-service div[class='full_card'] mat-form-field mat-select[formcontrolname='materialId'] div[class='mat-select-arrow']";
	public static final String SLE_ROUTE_DROPDOWN = "front-end-service div[class='full_card'] mat-form-field mat-select[formcontrolname='routeId'] div[class='mat-select-arrow']";
	public static final String SLE_ROUTE_DENSITY_DROPDOWN = "front-end-service div[class='full_card'] mat-form-field mat-select[formcontrolname='routeDensityId'] div[class='mat-select-arrow']";
	public static final String SLE_LOCATION_TYPE_TEXTFIELD = "front-end-service div[class='full_card'] mat-form-field input[formcontrolname='customerBusinessType']";
	public static final String SLE_DISPOSAL_SITE_DROPDOWN = "front-end-service div[class='full_card'] mat-form-field mat-select[formcontrolname='disposalCostId'] div[class='mat-select-arrow']";
	public static final String SLE_WEIGHT_TEXTFIELD = "front-end-service div[class='full_card'] mat-form-field input[formcontrolname='weight']";
	public static final String SLE_UOM_DROPDOWN = "front-end-service div[class='full_card'] mat-form-field mat-select[formcontrolname='unitOfMeasurementId'] div[class='mat-select-arrow']";
	public static final String SLE_CONTAINER_RENTAL_FEE_TEXTFIELD = "front-end-service div[class='full_card'] mat-form-field input[formcontrolname='containerRentalFee']";
	public static final String SLE_CLEAR_CALCULATIONS_BUTTON = "front-end-service div[class='button_container_right'] button:nth-child(1)";
	public static final String SLE_CALCULATE_BUTTON = "front-end-service div[class='button_container_right'] button:nth-child(2)";
	public static final String SLE_TOTAL_SELL_EDIT_BUTTON = "front-end-service div[class='full_card grey_card'] mat-icon[class='mat-icon notranslate mat-primary material-icons ng-star-inserted']";
	public static final String SLE_TOTAL_SELL_TEXTFIELD = "front-end-service div[class='full_card grey_card'] mat-form-field input[matinputplaceholder='Enter Sell Fee']";
	public static final String SLE_TOTAL_SELL_CANCEL_BUTTON = "front-end-service div[class='full_card grey_card'] mat-icon[class='mat-icon notranslate mat-warn material-icons";
	public static final String SLE_TOTAL_SELL_SAVE_BUTTON = "front-end-service div[class='full_card grey_card'] mat-icon[class='mat-icon notranslate material-icons mat-icon-no-color']";
	public static final String SLE_DELIVERY_EXTRAFEE_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='serviceFees'] input:nth-child(1)";
	public static final String SLE_EXTRA_LIFT_EXTRAFEE_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='serviceFees'] input:nth-child(2)";
	public static final String SLE_REMOVAL_EXTRAFEE_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='serviceFees'] input:nth-child(3)";
	public static final String SLE_RELOCATION_EXTRAFEE_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='serviceFees'] input:nth-child(4)";
	public static final String SLE_ADMIN_EXTRAFEE_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='serviceFees'] input:nth-child(5)";
	public static final String SLE_COMMODITY_SURCHARGE_EXTRAFEE_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='serviceFees'] input:nth-child(6)";
	public static final String SLE_ADDITIONAL_EXTRAFEE_BUTTON = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='customServiceFees'] button";
	public static final String SLE_ADDITIONAL_EXTRAFEE_NAME_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='customServiceFees'] mat-form-field input[placeholder='Additional Fee Name']";
	public static final String SLE_ADDITIONAL_EXTRAFEE_AMOUNT_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='customServiceFees'] mat-form-field input[placeholder='Amount']";
	public static final String SLE_ADDITIONAL_EXTRAFEE_DISCARD_BUTTON = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='customServiceFees'] div[class='flex_row extra_fee_buttons_container'] buton:nth-child(1)";
	public static final String SLE_ADDITIONAL_EXTRAFEE_SAVE_BUTTON = "front-end-service div[class='full_card'] div[class='fees_wrapper'] form[formarrayname='customServiceFees'] div[class='flex_row extra_fee_buttons_container'] buton:nth-child(2)";
	public static final String SLE_OIL_EXTRAFEE_RADIO = "front-end-service div[class='full_card'] div[class='fees_right'] mat-radio-group:nth-child(1)";
	public static final String SLE_OIL_EXTRAFEE_AMOUNT_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_right'] input:nth-child(1)";
	public static final String SLE_ENVIRONMENTAL_EXTRAFEE_RADIO = "front-end-service div[class='full_card'] div[class='fees_right'] mat-radio-group:nth-child(2)";
	public static final String SLE_ENVIRONMENTAL_EXTRAFEE_AMOUNT_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_right'] input:nth-child(2)";
	public static final String SLE_RECYCLING_EXTRAFEE_RADIO = "front-end-service div[class='full_card'] div[class='fees_right'] mat-radio-group:nth-child(3)";
	public static final String SLE_RECYCLING_EXTRAFEE_AMOUNT_TEXTFIELD = "front-end-service div[class='full_card'] div[class='fees_right'] input:nth-child(3)";
	public static final String SLE_ADDITIONAL_NOTES_TEXTFIELD = "front-end-service div[class='full_card notes_container'] mat-form-field textarea[formcontrolname='notes']";
	public static final String SLE_DISCARD_BUTTON = "front-end-service div[class='buttons_sticky_bottom'] button:nth-child(1)";
	public static final String SLE_ADD_SERVICE_BUTTON = "front-end-service div[class='buttons_sticky_bottom'] button:nth-child(2)";

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
