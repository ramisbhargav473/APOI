package CRM.SubEditPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.Locators.SiteEditLocators;
import CRM.SubEditPages.Locators.Constants.SE_LocatorsConstants;
import CRM.ViewPages.CustomerView;

/**
 * @author jteja
 *
 */
public class SiteEdit extends SourcePage{

	public SiteEditLocators siteEditLocators;
	public SE_LocatorsConstants se_locatorConstants;
	
	/**
	 * 
	 */
	public SiteEdit() {
		this.siteEditLocators = new SiteEditLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.siteEditLocators);
		
		this.se_locatorConstants = new SE_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pi_Variables = se_locatorConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pi_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	/**
	 * @return
	 */
	public CustomerView clickDiscard() {
		KeywordsUtil.click(siteEditLocators.se_discard_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, CustomerView.class);
	}
	
	/**
	 * @return
	 */
	public CustomerView clickSaveSiteChanges() {
		KeywordsUtil.click(siteEditLocators.se_save_site_changes_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, CustomerView.class);
	}
	
}
