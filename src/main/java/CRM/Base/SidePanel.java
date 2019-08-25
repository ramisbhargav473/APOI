package CRM.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.Locators.SidePanelLocators;
import CRM.Base.Locators.Constants.SP_LocatorsConstants;
import CRM.MainPages.AgreementIndex;
import CRM.MainPages.BIReporting;
import CRM.MainPages.CDEDashboard;
import CRM.MainPages.Calendar;
import CRM.MainPages.ControllerAndMaintenance;
import CRM.MainPages.CustomerIndex;
import CRM.MainPages.Home;
import CRM.MainPages.MyReports;
import CRM.MainPages.ProspectIndex;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;

/**
 * @author jteja
 *
 */
public class SidePanel {
	
	public SidePanelLocators sidePanelLocators;
	public SP_LocatorsConstants sp_LocatorConstants;
	
	/**
	 * @param webDriverInstance
	 */
	public SidePanel(WebDriver webDriverInstance) {
		
		this.sidePanelLocators = new SidePanelLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(webDriverInstance, 10);
		PageFactory.initElements(factory, this.sidePanelLocators);
		
		this.sp_LocatorConstants = new SP_LocatorsConstants();
		
	}

	/**
	 * @return
	 */
	public Home clickHome() {
		KeywordsUtil.click(sidePanelLocators.sp_home_link);
		MethodsUtil.loaderWait();
		return new Home();
	}
	
	/**
	 * @return
	 */
	public ProspectIndex clickProspects() {
		KeywordsUtil.click(sidePanelLocators.sp_prospects_link);
		MethodsUtil.loaderWait();
		return new ProspectIndex();
	}
	
	/**
	 * @return
	 */
	public CustomerIndex clickCustomers() {
		KeywordsUtil.click(sidePanelLocators.sp_customers_link);
		MethodsUtil.loaderWait();
		return new CustomerIndex();
	}
	
	/**
	 * @return
	 */
	public AgreementIndex clickAgreements() {
		KeywordsUtil.click(sidePanelLocators.sp_agreements_link);
		MethodsUtil.loaderWait();
		return new AgreementIndex();
	}
	
	
	/**
	 * @return
	 */
	public Calendar clicknCalendar() {
		KeywordsUtil.click(sidePanelLocators.sp_calendar_link);
		MethodsUtil.loaderWait();
		return new Calendar();
	}
	
	/**
	 * @return
	 */
	public MyReports clickMyReports() {
		KeywordsUtil.click(sidePanelLocators.sp_my_reports_link);
		MethodsUtil.loaderWait();
		return new MyReports();
	}
	
	/**
	 * @return
	 */
	public CDEDashboard clickCDEDashboard() {
		KeywordsUtil.click(sidePanelLocators.sp_cde_dashboard_link);
		MethodsUtil.loaderWait();
		return new CDEDashboard();
	}
	
	/**
	 * @return
	 */
	public BIReporting clickBIReporting() {
		KeywordsUtil.click(sidePanelLocators.sp_bi_reporting_link);
		MethodsUtil.loaderWait();
		return new BIReporting();
	}
	
	/**
	 * @return
	 */
	public ControllerAndMaintenance clickControllerAndMaintenance() {
		KeywordsUtil.click(sidePanelLocators.sp_admin_link);
		KeywordsUtil.click(sidePanelLocators.sp_controller_and_maintenance_link);
		return new ControllerAndMaintenance();
	}

}
