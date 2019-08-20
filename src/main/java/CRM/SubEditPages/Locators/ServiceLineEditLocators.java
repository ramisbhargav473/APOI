package CRM.SubEditPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.SubEditPages.Locators.Constants.SLE_LocatorsConstants;

public class ServiceLineEditLocators {

	@FindBy(css = SLE_LocatorsConstants.SLE_HOME_LINK)
	public WebElement sle_home_link;
	@FindBy(css = SLE_LocatorsConstants.SLE_AGREEMENTS_LINK)
	public WebElement sle_agreements_link;
	@FindBy(css = SLE_LocatorsConstants.SLE_SERVICE_TYPE_DROPDOWN)
	public WebElement sle_service_type_dropdown;
	@FindBy(css = SLE_LocatorsConstants.SLE_MARGIN_RADIO)
	public WebElement sle_margin_radio;
	@FindBy(css = SLE_LocatorsConstants.SLE_CONTAINER_COUNT_TEXTFIELD)
	public WebElement sle_container_count_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_SERVICE_FREQUENCY_DROPDOWN)
	public WebElement sle_service_frequency_dropdown;
	@FindBy(css = SLE_LocatorsConstants.SLE_CONTAINER_TYPE_DROPDOWN)
	public WebElement sle_container_type_dropdown;
	@FindBy(css = SLE_LocatorsConstants.SLE_CONTAINER_SIZE_DROPDOWN)
	public WebElement sle_container_size_dropdown;
	@FindBy(css = SLE_LocatorsConstants.SLE_MATERIAL_TYPE_DROPDOWN)
	public WebElement sle_material_type_dropdown;
	@FindBy(css = SLE_LocatorsConstants.SLE_ROUTE_DROPDOWN)
	public WebElement sle_route_dropdown;
	@FindBy(css = SLE_LocatorsConstants.SLE_ROUTE_DENSITY_DROPDOWN)
	public WebElement sle_route_density_dropdown;
	@FindBy(css = SLE_LocatorsConstants.SLE_LOCATION_TYPE_TEXTFIELD)
	public WebElement sle_location_type_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_DISPOSAL_SITE_DROPDOWN)
	public WebElement sle_disposal_site_dropdown;
	@FindBy(css = SLE_LocatorsConstants.SLE_WEIGHT_TEXTFIELD)
	public WebElement sle_weight_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_UOM_DROPDOWN)
	public WebElement sle_uom_dropdown;
	@FindBy(css = SLE_LocatorsConstants.SLE_CONTAINER_RENTAL_FEE_TEXTFIELD)
	public WebElement sle_container_rental_fee_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_CLEAR_CALCULATIONS_BUTTON)
	public WebElement sle_clear_calculations_button;
	@FindBy(css = SLE_LocatorsConstants.SLE_CALCULATE_BUTTON)
	public WebElement sle_calculate_button;
	@FindBy(css = SLE_LocatorsConstants.SLE_TOTAL_SELL_EDIT_BUTTON)
	public WebElement sle_total_sell_edit_button;
	@FindBy(css = SLE_LocatorsConstants.SLE_TOTAL_SELL_TEXTFIELD)
	public WebElement sle_total_sell_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_TOTAL_SELL_CANCEL_BUTTON)
	public WebElement sle_total_sell_cancel_button;
	@FindBy(css = SLE_LocatorsConstants.SLE_TOTAL_SELL_SAVE_BUTTON)
	public WebElement sle_total_sell_save_button;
	@FindBy(css = SLE_LocatorsConstants.SLE_DELIVERY_EXTRAFEE_TEXTFIELD)
	public WebElement sle_delivery_extrafee_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_EXTRA_LIFT_EXTRAFEE_TEXTFIELD)
	public WebElement sle_extra_lift_extrafee_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_REMOVAL_EXTRAFEE_TEXTFIELD)
	public WebElement sle_removal_extrafee_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_RELOCATION_EXTRAFEE_TEXTFIELD)
	public WebElement sle_relocation_extrafee_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_ADMIN_EXTRAFEE_TEXTFIELD)
	public WebElement sle_admin_extrafee_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_COMMODITY_SURCHARGE_EXTRAFEE_TEXTFIELD)
	public WebElement sle_commodity_surcharge_extrafee_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_ADDITIONAL_EXTRAFEE_BUTTON)
	public WebElement sle_additional_extrafee_button;
	@FindBy(css = SLE_LocatorsConstants.SLE_ADDITIONAL_EXTRAFEE_NAME_TEXTFIELD)
	public WebElement sle_additional_extrafee_name_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_ADDITIONAL_EXTRAFEE_AMOUNT_TEXTFIELD)
	public WebElement sle_additional_extrafee_amount_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_ADDITIONAL_EXTRAFEE_DISCARD_BUTTON)
	public WebElement sle_additional_extrafee_discard_button;
	@FindBy(css = SLE_LocatorsConstants.SLE_ADDITIONAL_EXTRAFEE_SAVE_BUTTON)
	public WebElement sle_additional_extrafee_save_button;
	@FindBy(css = SLE_LocatorsConstants.SLE_OIL_EXTRAFEE_RADIO)
	public WebElement sle_oil_extrafee_radio;
	@FindBy(css = SLE_LocatorsConstants.SLE_OIL_EXTRAFEE_AMOUNT_TEXTFIELD)
	public WebElement sle_oil_extrafee_amount_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_ENVIRONMENTAL_EXTRAFEE_RADIO)
	public WebElement sle_environmental_extrafee_radio;
	@FindBy(css = SLE_LocatorsConstants.SLE_ENVIRONMENTAL_EXTRAFEE_AMOUNT_TEXTFIELD)
	public WebElement sle_environmental_extrafee_amount_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_RECYCLING_EXTRAFEE_RADIO)
	public WebElement sle_recycling_extrafee_radio;
	@FindBy(css = SLE_LocatorsConstants.SLE_RECYCLING_EXTRAFEE_AMOUNT_TEXTFIELD)
	public WebElement sle_recycling_extrafee_amount_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_ADDITIONAL_NOTES_TEXTFIELD)
	public WebElement sle_additional_notes_textfield;
	@FindBy(css = SLE_LocatorsConstants.SLE_DISCARD_BUTTON)
	public WebElement sle_discard_button;
	@FindBy(css = SLE_LocatorsConstants.SLE_ADD_SERVICE_BUTTON)
	public WebElement sle_add_service_button;

}
