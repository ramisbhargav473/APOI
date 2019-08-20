/**
 * 
 */
package CRM.SubEditPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.Locators.SiteCreateLocators;
import CRM.SubEditPages.Locators.Constants.SC_LocatorsConstants;
import CRM.ViewPages.ProspectView;

/**
 * @author jteja
 *
 */
public class SiteCreate extends SourcePage {

	public SiteCreateLocators siteCreateLocators;
	public SC_LocatorsConstants sc_locatorsConstants;
	
	public SiteCreate() {
		this.siteCreateLocators = new SiteCreateLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.siteCreateLocators);
		
		this.sc_locatorsConstants = new SC_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = sc_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	public ProspectView clickOnSaveSite() {
		KeywordsUtil.click(siteCreateLocators.sc_saveandsubmit_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, ProspectView.class);
	}
	
	public ProspectView clickOnDiscard() {
		KeywordsUtil.click(siteCreateLocators.sc_discard_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, ProspectView.class);
	}
	
}
