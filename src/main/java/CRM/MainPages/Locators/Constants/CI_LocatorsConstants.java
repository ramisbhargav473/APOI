/**
 * 
 */
package CRM.MainPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class CI_LocatorsConstants {
	
	public static final String CI_HOME_LINK = "div[class='bread_crumbs_container'] div[class='bread_crumbs'] a span";
	public static final String CI_NEW_PROSPECT_BUTTON = "div[class='bread_crumbs_container'] button";
	public static final String CI_CREATE_PROSPECT_POPUP_COMBOBOX = "div[class='cdk-overlay-pane'] input[role='combobox']";
	public static final String CI_CREATE_PROSPECT_DISCARD_BUTTON = "div[class='cdk-overlay-pane'] addprospect-dialog[class='ng-star-inserted'] mat-dialog-actions[class='mat-dialog-actions'] button:nth-child(1)";
	public static final String CI_CREATE_PROSPECT_PROCEED_BUTTON = "div[class='cdk-overlay-pane'] addprospect-dialog[class='ng-star-inserted'] mat-dialog-actions[class='mat-dialog-actions'] button:nth-child(2)";
	public static final String CI_CREATE_PROSPECT_CLOSE_BUTTON = "div[class='cdk-overlay-pane'] addprospect-dialog button[class='close_modal_button']";
	public static final String CI_CUSTOMERS_TAB_BUTTON = "div[class='button_tab_container customers_index_tab ng-star-inserted'] button:nth-child(1)";
	public static final String CI_PROSPECTS_TAB_BUTTON = "div[class='button_tab_container customers_index_tab ng-star-inserted'] button:nth-child(2)";
	public static final String CI_FAVOURITES_CHECKBOX = "div[class='container_main customers_main'] mat-checkbox[formcontrolname='isFavorite'] input[type='checkbox']";
	public static final String CI_AGREEMENTS_EXPIRING_CHECKBOX = "div[class='container_main customers_main'] mat-checkbox:nth-child(2) input[type='checkbox']";
	public static final String CI_AMAZON_SEARCH_DROPDOWN = "filters mat-form-field mat-select[formcontrolname='searchBy'] div[class='mat-select-arrow']";
	public static final String CI_AMAZON_SEARCH_TEXTFIELD = "filters input[formcontrolname='searchValue']";
	public static final String CI_AMAZON_SEARCH_SEARCH_BUTTON = "filters div[class='input-group-append'] button";
	public static final String CI_MORE_FILTERS_BUTTON = "filters mat-accordion mat-expansion-panel mat-expansion-panel-header[aria-expanded='false']";
	public static final String CI_CUSTOMER_STATUS_MULTISELECT ="filters mat-accordion mat-expansion-panel div[formgroupname='status']";
	public static final String CI_CDE_QUEUE_MULTISELECT ="filters mat-accordion mat-expansion-panel div[formgroupname='cdeQueueStatus']";
	public static final String CI_AGRMT_EXP_FROM_TEXTFIED ="filters mat-accordion mat-expansion-panel input[formcontrolname='expireFrom']";
	public static final String CI_AGRMT_EXP_TO_TEXTFIED ="filters mat-accordion mat-expansion-panel input[formcontrolname='expireTo']";
	public static final String CI_AGRMT_EXP_RADIO ="filters mat-accordion mat-expansion-panel mat-radio-group";
	public static final String CI_BUSINESS_UNIT_DROPDOWN ="filters mat-accordion mat-expansion-panel mat-select[formcontrolname='businessUnitId'] div[class='mat-select-arrow']";
	public static final String CI_BUSINESS_TYPE_DROPDOWN ="filters mat-accordion mat-expansion-panel mat-select[formcontrolname='businessTypeId'] div[class='mat-select-arrow']";
	public static final String CI_SITE_STATUS_MULTISELECT ="filters mat-accordion mat-expansion-panel div[formgroupname='siteStatus']";
	public static final String CI_RESET_FILTERS_BUTTON = "filters mat-accordion mat-expansion-panel button:nth-child(1)";
	public static final String CI_MORE_FILTERS_SEARCH_BUTTON = "filters mat-accordion mat-expansion-panel button:nth-child(2)";
	public static final String CI_LESS_FILTERS_BUTTON = "filters mat-accordion mat-expansion-panel mat-expansion-panel-header[aria-expanded='true']";
	public static final String CI_SEARCH_RESULTS_LIMIT_DROPDOWN = "div[class='pagination_header_container'] mat-form-field mat-select div[class='mat-select-arrow']";
	public static final String CI_CREATEREPORT_BUTTON = "div[class='pagination_header_container'] button";
	public static final String CI_PROSPECTGRID_RESULTS = "div[class='table-container'] table tbody tr td a";

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
