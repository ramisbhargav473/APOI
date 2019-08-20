package CRM.MainPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.MainPages.Locators.Constants.CI_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class CustomerIndexLocators {

	@FindBy(css = CI_LocatorsConstants.CI_HOME_LINK)
	public WebElement ci_home_link;
	@FindBy(css = CI_LocatorsConstants.CI_NEW_PROSPECT_BUTTON)
	public WebElement ci_new_prospect_button;
	@FindBy(css = CI_LocatorsConstants.CI_CREATE_PROSPECT_POPUP_COMBOBOX)
	public WebElement ci_create_prospect_popup_combobox;
	@FindBy(css = CI_LocatorsConstants.CI_CREATE_PROSPECT_DISCARD_BUTTON)
	public WebElement ci_create_prospect_discard_button;
	@FindBy(css = CI_LocatorsConstants.CI_CREATE_PROSPECT_PROCEED_BUTTON)
	public WebElement ci_create_prospect_proceed_button;
	@FindBy(css = CI_LocatorsConstants.CI_CREATE_PROSPECT_CLOSE_BUTTON)
	public WebElement ci_create_prospect_close_button;
	@FindBy(css = CI_LocatorsConstants.CI_CUSTOMERS_TAB_BUTTON)
	public WebElement ci_customers_tab_button;
	@FindBy(css = CI_LocatorsConstants.CI_PROSPECTS_TAB_BUTTON)
	public WebElement ci_prospects_tab_button;
	@FindBy(css = CI_LocatorsConstants.CI_FAVOURITES_CHECKBOX)
	public WebElement ci_favourites_checkbox;
	@FindBy(css = CI_LocatorsConstants.CI_AGREEMENTS_EXPIRING_CHECKBOX)
	public WebElement ci_agreements_expiring_checkbox;
	@FindBy(css = CI_LocatorsConstants.CI_AMAZON_SEARCH_DROPDOWN)
	public WebElement ci_amazon_search_dropdown;
	@FindBy(css = CI_LocatorsConstants.CI_AMAZON_SEARCH_TEXTFIELD)
	public WebElement ci_amazon_search_textfield;
	@FindBy(css = CI_LocatorsConstants.CI_AMAZON_SEARCH_SEARCH_BUTTON)
	public WebElement ci_amazon_search_search_button;
	@FindBy(css = CI_LocatorsConstants.CI_MORE_FILTERS_BUTTON)
	public WebElement ci_more_filters_button;
	@FindBy(css = CI_LocatorsConstants.CI_CUSTOMER_STATUS_MULTISELECT)
	public WebElement ci_customer_status_multiselect;
	@FindBy(css = CI_LocatorsConstants.CI_CDE_QUEUE_MULTISELECT)
	public WebElement ci_cde_queue_multiselect;
	@FindBy(css = CI_LocatorsConstants.CI_AGRMT_EXP_FROM_TEXTFIED)
	public WebElement ci_agrmt_exp_from_textfied;
	@FindBy(css = CI_LocatorsConstants.CI_AGRMT_EXP_TO_TEXTFIED)
	public WebElement ci_agrmt_exp_to_textfied;
	@FindBy(css = CI_LocatorsConstants.CI_AGRMT_EXP_RADIO)
	public WebElement ci_agrmt_exp_radio;
	@FindBy(css = CI_LocatorsConstants.CI_BUSINESS_UNIT_DROPDOWN)
	public WebElement ci_business_unit_dropdown;
	@FindBy(css = CI_LocatorsConstants.CI_BUSINESS_TYPE_DROPDOWN)
	public WebElement ci_business_type_dropdown;
	@FindBy(css = CI_LocatorsConstants.CI_SITE_STATUS_MULTISELECT)
	public WebElement ci_site_status_multiselect;
	@FindBy(css = CI_LocatorsConstants.CI_RESET_FILTERS_BUTTON)
	public WebElement ci_reset_filters_button;
	@FindBy(css = CI_LocatorsConstants.CI_MORE_FILTERS_SEARCH_BUTTON)
	public WebElement ci_more_filters_search_button;
	@FindBy(css = CI_LocatorsConstants.CI_LESS_FILTERS_BUTTON)
	public WebElement ci_less_filters_button;
	@FindBy(css = CI_LocatorsConstants.CI_SEARCH_RESULTS_LIMIT_DROPDOWN)
	public WebElement ci_search_results_limit_dropdown;
	@FindBy(css = CI_LocatorsConstants.CI_CREATEREPORT_BUTTON)
	public WebElement ci_createreport_button;
	@FindBy(css = CI_LocatorsConstants.CI_PROSPECTGRID_RESULTS)
	public WebElement ci_prospectgrid_results;

}
