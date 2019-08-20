package CRM.Base.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CRM.Base.Locators.Constants.SP_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class SidePanelLocators {

	@FindBy(css = SP_LocatorsConstants.SP_HOME_LINK)
	public WebElement sp_home_link;

	@FindBy(css = SP_LocatorsConstants.SP_PROSPECTS_LINK)
	public WebElement sp_prospects_link;

	@FindBy(css = SP_LocatorsConstants.SP_CUSTOMERS_LINK)
	public WebElement sp_customers_link;

	@FindBy(css = SP_LocatorsConstants.SP_AGREEMENTS_LINK)
	public WebElement sp_agreements_link;

	@FindBy(css = SP_LocatorsConstants.SP_CALENDAR_LINK)
	public WebElement sp_calendar_link;

	@FindBy(css = SP_LocatorsConstants.SP_MY_REPORTS_LINK)
	public WebElement sp_my_reports_link;

	@FindBy(css = SP_LocatorsConstants.SP_CDE_DASHBOARD_LINK)
	public WebElement sp_cde_dashboard_link;

	@FindBy(css = SP_LocatorsConstants.SP_BI_REPORTING_LINK)
	public WebElement sp_bi_reporting_link;

	@FindBy(css = SP_LocatorsConstants.SP_ADMIN_LINK)
	public WebElement sp_admin_link;
	
	@FindBy(css = SP_LocatorsConstants.SP_CONTROLLER_AND_MAINTENANCE_LINK)
	public WebElement sp_controller_and_maintenance_link;

	
}
