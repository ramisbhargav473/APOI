/**
 * 
 */
package CRM.MainPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class PI_LocatorsConstants {

    /*-------------------------------------------------Prospect Index Page Locators--------------------------------------------*/
	
	public static final String PI_HOME_LINK = "prospects div[class='prospectsComponent'] div[class='bread_crumbs_container'] div[class='bread_crumbs'] a span";
	public static final String PI_NEW_PROSPECT_BUTTON = "prospects div[class='prospectsComponent'] div[class='bread_crumbs_container'] button";
	public static final String PI_CREATE_PROSPECT_POPUP_COMBOBOX = "div[class='cdk-overlay-pane'] input[role='combobox']";
	public static final String PI_CREATE_PROSPECT_DISCARD_BUTTON = "div[class='cdk-overlay-pane'] addprospect-dialog[class='ng-star-inserted'] mat-dialog-actions[class='mat-dialog-actions'] button:nth-child(1)";
	public static final String PI_CREATE_PROSPECT_PROCEED_BUTTON = "div[class='cdk-overlay-pane'] addprospect-dialog[class='ng-star-inserted'] mat-dialog-actions[class='mat-dialog-actions'] button:nth-child(2)";
	public static final String PI_CREATE_PROSPECT_CLOSE_BUTTON = "div[class='cdk-overlay-pane'] addprospect-dialog button[class='close_modal_button']";
	public static final String PI_CUSTOMERS_TAB_BUTTON = "prospects div[class='prospectsComponent'] div[class='button_tab_container'] button:nth-child(1)";
	public static final String PI_PROSPECTS_TAB_BUTTON = "prospects div[class='prospectsComponent'] div[class='button_tab_container'] button:nth-child(2)";
	public static final String PI_PROSPECT_SEARCH_CHECKBOX = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] mat-checkbox[formcontrolname='quotedProspect'] input";
	public static final String PI_AMAZON_SEARCH_DROPDOWN = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] filters mat-form-field mat-select[formcontrolname='searchBy'] div[class='mat-select-arrow']";
	public static final String PI_AMAZON_SEARCH_TEXTFIELD = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] filters input[formcontrolname='searchValue']";
	public static final String PI_AMAZON_SEARCH_SEARCH_BUTTON = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] filters div[class='input-group-append'] button";
	public static final String PI_MORE_FILTERS_BUTTON = "filters mat-accordion mat-expansion-panel mat-expansion-panel-header[aria-expanded='false']";
	public static final String PI_PROSPECT_LEVEL_FROM_DROPDOWN = "filters mat-accordion mat-expansion-panel mat-select[formcontrolname='prospectLevelFrom'] div[class='mat-select-arrow']";
	public static final String PI_PROSPECT_LEVEL_TO_DROPDOWN = "filters mat-accordion mat-expansion-panel mat-select[formcontrolname='prospectLevelTo'] div[class='mat-select-arrow']";
	public static final String PI_SALESREP_DROPDOWN = "filters mat-accordion mat-expansion-panel mat-select[formcontrolname='salesRep'] div[class='mat-select-arrow']";
	public static final String PI_DATE_PROSPECT_ADDED_FROM_TEXTFIELD = "filters mat-accordion mat-expansion-panel mat-form-field input[formcontrolname='prospectAddedDateFrom']";
	public static final String PI_DATE_PROSPECT_ADDED_TO_TEXTFIELD = "filters mat-accordion mat-expansion-panel mat-form-field input[formcontrolname='prospectAddedDateTo']";
	public static final String PI_ESTIMATED_AMOUNT_FROM_TEXTFIELD = "filters mat-accordion mat-expansion-panel mat-form-field input[formcontrolname='estimatedAmountFrom']";
	public static final String PI_ESTIMATED_AMOUNT_TO_TEXTFIELD = "filters mat-accordion mat-expansion-panel mat-form-field input[formcontrolname='estimatedAmountTo']";
	public static final String PI_NEXT_FOLLOWUP_DATE_FROM_TEXTFIELD = "filters mat-accordion mat-expansion-panel mat-form-field input[formcontrolname='nextFollowupDateFrom']";
	public static final String PI_NEXT_FOLLOWUP_DATE_TO_TEXTFIELD = "filters mat-accordion mat-expansion-panel mat-form-field input[formcontrolname='nextFollowupDateTo']";
	public static final String PI_COMP_AGG_EXP_DATE_FROM_TEXTFIELD = "filters mat-accordion mat-expansion-panel mat-form-field input[formcontrolname='competitorExpiryDateFrom']";
	public static final String PI_COMP_AGG_EXP_DATE_TO_TEXTFIELD = "filters mat-accordion mat-expansion-panel mat-form-field input[formcontrolname='competitorExpiryDateTo']";
	public static final String PI_BRANCH_DROPDOWN = "filters mat-accordion mat-expansion-panel mat-select[formcontrolname='businessUnitId'] div[class='mat-select-arrow']";
	public static final String PI_PROSPECT_STATUS_MULTISELECT = "filters mat-accordion mat-expansion-panel div[class'filter_status_row']";
	public static final String PI_RESET_FILTERS_BUTTON = "filters mat-accordion mat-expansion-panel button:nth-child(1)";
	public static final String PI_MORE_FILTERS_SEARCH_BUTTON = "filters mat-accordion mat-expansion-panel button:nth-child(2)";
	public static final String PI_LESS_FILTERS_BUTTON = "filters mat-accordion mat-expansion-panel mat-expansion-panel-header[aria-expanded='true']";
	public static final String PI_SEARCH_RESULTS_LIMIT_DROPDOWN = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] div[class='pagination_header_container'] mat-form-field mat-select div[class='mat-select-arrow']";
	public static final String PI_CREATEREPORT_BUTTON = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] div[class='pagination_header_container'] button";
	public static final String PI_PROSPECTGRID_RESULTS = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] div[class='table-container'] table tbody tr td a";
	
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
