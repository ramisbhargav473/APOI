package CRM.SubEditPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.SubEditPages.Locators.Constants.SLC_LocatorsConstants;

public class ServiceLineCreateLocators {

	@FindBy(css = SLC_LocatorsConstants.SLC_HOME_LINK)
	public WebElement slc_home_link;
	@FindBy(css = SLC_LocatorsConstants.SLC_AGREEMENTS_LINK)
	public WebElement slc_agreements_link;
	@FindBy(css = SLC_LocatorsConstants.SLC_SERVICE_TYPE_DROPDOWN)
	public WebElement slc_service_type_dropdown;
	@FindBy(css = SLC_LocatorsConstants.SLC_MARGIN_RADIO)
	public WebElement slc_margin_radio;
	@FindBy(css = SLC_LocatorsConstants.SLC_CONTAINER_COUNT_TEXTFIELD)
	public WebElement slc_container_count_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_SERVICE_FREQUENCY_DROPDOWN)
	public WebElement slc_service_frequency_dropdown;
	@FindBy(css = SLC_LocatorsConstants.SLC_CONTAINER_TYPE_DROPDOWN)
	public WebElement slc_container_type_dropdown;
	@FindBy(css = SLC_LocatorsConstants.SLC_CONTAINER_SIZE_DROPDOWN)
	public WebElement slc_container_size_dropdown;
	@FindBy(css = SLC_LocatorsConstants.SLC_MATERIAL_TYPE_DROPDOWN)
	public WebElement slc_material_type_dropdown;
	@FindBy(css = SLC_LocatorsConstants.SLC_ROUTE_DROPDOWN)
	public WebElement slc_route_dropdown;
	@FindBy(css = SLC_LocatorsConstants.SLC_ROUTE_DENSITY_DROPDOWN)
	public WebElement slc_route_density_dropdown;
	@FindBy(css = SLC_LocatorsConstants.SLC_LOCATION_TYPE_TEXTFIELD)
	public WebElement slc_location_type_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_DISPOSAL_SITE_DROPDOWN)
	public WebElement slc_disposal_site_dropdown;
	@FindBy(css = SLC_LocatorsConstants.SLC_WEIGHT_TEXTFIELD)
	public WebElement slc_weight_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_UOM_DROPDOWN)
	public WebElement slc_uom_dropdown;
	@FindBy(css = SLC_LocatorsConstants.SLC_CONTAINER_RENTAL_FEE_TEXTFIELD)
	public WebElement slc_container_rental_fee_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_CLEAR_CALCULATIONS_BUTTON)
	public WebElement slc_clear_calculations_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_CALCULATE_BUTTON)
	public WebElement slc_calculate_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_MONTHLY_RATE_EDIT_BUTTON)
	public WebElement slc_monthly_rate_edit_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_MONTHLY_RATE_TEXTFIELD)
	public WebElement slc_monthly_rate_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_MONTHLY_RATE_CANCEL_BUTTON)
	public WebElement slc_monthly_rate_cancel_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_MONTHLY_RATE_SAVE_BUTTON)
	public WebElement slc_monthly_rate_save_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_DELIVERY_EXTRAFEE_TEXTFIELD)
	public WebElement slc_delivery_extrafee_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_EXTRA_LIFT_EXTRAFEE_TEXTFIELD)
	public WebElement slc_extra_lift_extrafee_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_REMOVAL_EXTRAFEE_TEXTFIELD)
	public WebElement slc_removal_extrafee_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_RELOCATION_EXTRAFEE_TEXTFIELD)
	public WebElement slc_relocation_extrafee_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_ADMIN_EXTRAFEE_TEXTFIELD)
	public WebElement slc_admin_extrafee_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_COMMODITY_SURCHARGE_EXTRAFEE_TEXTFIELD)
	public WebElement slc_commodity_surcharge_extrafee_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_ADDITIONAL_EXTRAFEE_BUTTON)
	public WebElement slc_additional_extrafee_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_ADDITIONAL_EXTRAFEE_NAME_TEXTFIELD)
	public WebElement slc_additional_extrafee_name_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_ADDITIONAL_EXTRAFEE_AMOUNT_TEXTFIELD)
	public WebElement slc_additional_extrafee_amount_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_ADDITIONAL_EXTRAFEE_DISCARD_BUTTON)
	public WebElement slc_additional_extrafee_discard_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_ADDITIONAL_EXTRAFEE_SAVE_BUTTON)
	public WebElement slc_additional_extrafee_save_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_OIL_EXTRAFEE_RADIO)
	public WebElement slc_oil_extrafee_radio;
	@FindBy(css = SLC_LocatorsConstants.SLC_OIL_EXTRAFEE_AMOUNT_TEXTFIELD)
	public WebElement slc_oil_extrafee_amount_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_ENVIRONMENTAL_EXTRAFEE_RADIO)
	public WebElement slc_environmental_extrafee_radio;
	@FindBy(css = SLC_LocatorsConstants.SLC_ENVIRONMENTAL_EXTRAFEE_AMOUNT_TEXTFIELD)
	public WebElement slc_environmental_extrafee_amount_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_RECYCLING_EXTRAFEE_RADIO)
	public WebElement slc_recycling_extrafee_radio;
	@FindBy(css = SLC_LocatorsConstants.SLC_RECYCLING_EXTRAFEE_AMOUNT_TEXTFIELD)
	public WebElement slc_recycling_extrafee_amount_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_CLEAR_EXTRAFEES_BUTTON)
	public WebElement slc_clear_extrafees_button;
	@FindBy(css =  SLC_LocatorsConstants.SLC_TOTAL_BUTTON)
	public WebElement slc_total_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_ADDITIONAL_NOTES_TEXTFIELD)
	public WebElement slc_additional_notes_textfield;
	@FindBy(css = SLC_LocatorsConstants.SLC_DISCARD_BUTTON)
	public WebElement slc_discard_button;
	@FindBy(css = SLC_LocatorsConstants.SLC_ADD_SERVICE_BUTTON)
	public WebElement slc_add_service_button;

}
