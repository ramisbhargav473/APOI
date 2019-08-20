package CRM.MainPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.MainPages.Locators.Constants.PI_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class ProspectIndexLocators {

	@FindBy(css = PI_LocatorsConstants.PI_HOME_LINK)
	public WebElement pi_home_link;
	@FindBy(css = PI_LocatorsConstants.PI_NEW_PROSPECT_BUTTON)
	public WebElement pi_new_prospect_button;
	@FindBy(css = PI_LocatorsConstants.PI_CREATE_PROSPECT_POPUP_COMBOBOX)
	public WebElement pi_create_prospect_popup_combobox;
	@FindBy(css = PI_LocatorsConstants.PI_CREATE_PROSPECT_DISCARD_BUTTON)
	public WebElement pi_create_prospect_discard_button;
	@FindBy(css = PI_LocatorsConstants.PI_CREATE_PROSPECT_PROCEED_BUTTON)
	public WebElement pi_create_prospect_proceed_button;
	@FindBy(css = PI_LocatorsConstants.PI_CREATE_PROSPECT_CLOSE_BUTTON)
	public WebElement pi_create_prospect_close_button;
	@FindBy(css = PI_LocatorsConstants.PI_CUSTOMERS_TAB_BUTTON)
	public WebElement pi_customers_tab_button;
	@FindBy(css = PI_LocatorsConstants.PI_PROSPECTS_TAB_BUTTON)
	public WebElement pi_prospects_tab_button;
	@FindBy(css = PI_LocatorsConstants.PI_PROSPECT_SEARCH_CHECKBOX)
	public WebElement pi_prospect_search_checkbox;
	@FindBy(css = PI_LocatorsConstants.PI_AMAZON_SEARCH_DROPDOWN)
	public WebElement pi_amazon_search_dropdown;
	@FindBy(css = PI_LocatorsConstants.PI_AMAZON_SEARCH_TEXTFIELD)
	public WebElement pi_amazon_search_textfield;
	@FindBy(css = PI_LocatorsConstants.PI_AMAZON_SEARCH_SEARCH_BUTTON)
	public WebElement pi_amazon_search_search_button;
	@FindBy(css = PI_LocatorsConstants.PI_MORE_FILTERS_BUTTON)
	public WebElement pi_more_filters_button;
	@FindBy(css = PI_LocatorsConstants.PI_PROSPECT_LEVEL_FROM_DROPDOWN)
	public WebElement pi_prospect_level_from_dropdown;
	@FindBy(css = PI_LocatorsConstants.PI_PROSPECT_LEVEL_TO_DROPDOWN)
	public WebElement pi_prospect_level_to_dropdown;
	@FindBy(css = PI_LocatorsConstants.PI_SALESREP_DROPDOWN)
	public WebElement pi_salesrep_dropdown;
	@FindBy(css = PI_LocatorsConstants.PI_DATE_PROSPECT_ADDED_FROM_TEXTFIELD)
	public WebElement pi_date_prospect_added_from_textfield;
	@FindBy(css = PI_LocatorsConstants.PI_DATE_PROSPECT_ADDED_TO_TEXTFIELD)
	public WebElement pi_date_prospect_added_to_textfield;
	@FindBy(css = PI_LocatorsConstants.PI_ESTIMATED_AMOUNT_FROM_TEXTFIELD)
	public WebElement pi_estimated_amount_from_textfield;
	@FindBy(css = PI_LocatorsConstants.PI_ESTIMATED_AMOUNT_TO_TEXTFIELD)
	public WebElement pi_estimated_amount_to_textfield;
	@FindBy(css = PI_LocatorsConstants.PI_NEXT_FOLLOWUP_DATE_FROM_TEXTFIELD)
	public WebElement pi_next_followup_date_from_textfield;
	@FindBy(css = PI_LocatorsConstants.PI_NEXT_FOLLOWUP_DATE_TO_TEXTFIELD)
	public WebElement pi_next_followup_date_to_textfield;
	@FindBy(css = PI_LocatorsConstants.PI_COMP_AGG_EXP_DATE_FROM_TEXTFIELD)
	public WebElement pi_comp_agg_exp_date_from_textfield;
	@FindBy(css = PI_LocatorsConstants.PI_COMP_AGG_EXP_DATE_TO_TEXTFIELD)
	public WebElement pi_comp_agg_exp_date_to_textfield;
	@FindBy(css = PI_LocatorsConstants.PI_BRANCH_DROPDOWN)
	public WebElement pi_branch_dropdown;
	@FindBy(css = PI_LocatorsConstants.PI_PROSPECT_STATUS_MULTISELECT)
	public WebElement pi_prospect_status_multiselect;
	@FindBy(css = PI_LocatorsConstants.PI_RESET_FILTERS_BUTTON)
	public WebElement pi_reset_filters_button;
	@FindBy(css = PI_LocatorsConstants.PI_MORE_FILTERS_SEARCH_BUTTON)
	public WebElement pi_more_filters_search_button;
	@FindBy(css = PI_LocatorsConstants.PI_LESS_FILTERS_BUTTON)
	public WebElement pi_less_filters_button;
	@FindBy(css = PI_LocatorsConstants.PI_SEARCH_RESULTS_LIMIT_DROPDOWN)
	public WebElement pi_search_results_limit_dropdown;
	@FindBy(css = PI_LocatorsConstants.PI_CREATEREPORT_BUTTON)
	public WebElement pi_createreport_button;
	@FindBy(css = PI_LocatorsConstants.PI_PROSPECTGRID_RESULTS)
	public WebElement pi_prospectgrid_results;

}
