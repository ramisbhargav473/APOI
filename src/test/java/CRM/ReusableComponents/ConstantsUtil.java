package CRM.ReusableComponents;

/**
 * @author jteja
 *
 */
public class ConstantsUtil {

	//Login credentials
	public static final String BASE_URL = "https://wishes-uat.azurewebsites.net/";
	public static final String USER_NAME = "jteja@gflenv.com";
	public static final String PASSWORD = "Mrudula@90";
	public static final String TEST_DATA_PATH = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\NewData.xlsx";
	
	//Code to get in to the scope of the element
	public static final String JS_EXECUTOR_SCOPE = "arguments[0].scrollIntoView({block: \"center\"});";
	
	//Commonly used global CSS locators
	public static final String GLOBAL_LOADER = "global-loader mat-progress-bar";
	public static final String OVERLAY_CONTAINER ="div[class='cdk-overlay-container'] div[class='cdk-overlay-connected-position-bounding-box'] div[class='cdk-overlay-pane']";
	public static final String VALIDATION_MESSAGES = "div[class='cdk-overlay-container'] div[class='cdk-global-overlay-wrapper'] div[class='cdk-overlay-pane'] snack-bar-container";
	public static final String DROPDOWN_OPTIONS = "mat-option";			
	public static final String RADIO_OPTIONS = "mat-radio-button";
	public static final String CHECKBOX_OPTIONS = "mat-checkbox";
	public static final String ROW_OPTIONS = "a";
	public static final String DATA_OPTIONS = "td";
	public static final String ANCHOR_OPTIONS = "a";

	//Page Names
    public static final String ADMIN_SHEET = "Admin";
    public static final String AGREEMENT_CREATE_SHEET = "AgreementCreate";
    public static final String AGREEMENT_CUSTOMERCOPY_SHEET = "AgreementCustomerCopy";
    public static final String AGREEMENT_EDIT_SHEET = "AgreementEdit";
    public static final String AGREEMENT_INDEX_SHEET = "AgreementIndex";
    public static final String AGREEMENT_VIEW_SHEET = "AgreementView";
    public static final String BI_REPORTING_SHEET = "BIReporting";
    public static final String CALENDAR_SHEET = "Calendar";
    public static final String CDE_DASHBOARD_SHEET = "CDEDashboard";
    public static final String CUSTOMER_EDIT_SHEET = "CustomerEdit";
    public static final String CUSTOMER_INDEX_SHEET = "CustomerIndex";
    public static final String CUSTOMER_VIEW_SHEET = "CustomerView";
    public static final String HOME_SHEET = "Home";
    public static final String MY_REPORTS_SHEET = "MyReports";
    public static final String  PROSPECT_CREATE_SHEET = "ProspectCreate";
    public static final String PROSPECT_EDIT_SHEET = "ProspectEdit";
    public static final String  PROSPECT_INDEX_SHEET = "ProspectIndex";
    public static final String  PROSPECT_VIEW_SHEET = "ProspectView";
    public static final String QUOTES_SHEET = "Quotes";
    public static final String  SITE_CREATE_SHEET = "SiteCreate";
    public static final String SITE_EDIT_SHEET = "SiteEdit";
    public static final String  SITE_VIEW_SHEET = "SiteView";
    public static final String SL_CREATE_SHEET = "SLCreate";
    public static final String SL_EDIT_SHEET = "SLEdit";
    public static final String  SL_VIEW_SHEET = "SLView";
    
}
