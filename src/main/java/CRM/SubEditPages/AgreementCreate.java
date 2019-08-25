package CRM.SubEditPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.MainPages.AgreementIndex;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.Locators.AgreementCreateLocators;
import CRM.SubEditPages.Locators.Constants.AC_LocatorsConstants;
import CRM.ViewPages.AgreementView;

/**
 * @author jteja
 *
 */
public class AgreementCreate extends SourcePage {

	public AgreementCreateLocators agreementCreateLocators;
	public AC_LocatorsConstants ac_locatorsConstants;
	
	/**
	 * 
	 */
	public AgreementCreate() {
		this.agreementCreateLocators = new AgreementCreateLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.agreementCreateLocators);
		
		this.ac_locatorsConstants = new AC_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = ac_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	/**
	 * @return
	 */
	public AgreementIndex clickOnDiscard() {
		KeywordsUtil.click(agreementCreateLocators.ac_discard_button);
		MethodsUtil.loaderWait();
		return PageFactory.initElements(wwDriver, AgreementIndex.class);
	}

	/**
	 * @return
	 */
	public AgreementView clickOnSaveAsQuote() {
		KeywordsUtil.click(agreementCreateLocators.ac_save_as_quote_button);
		MethodsUtil.loaderWait();
		return PageFactory.initElements(wwDriver, AgreementView.class);
	}
	
	
	/**
	 * @return
	 */
	public ServiceLineCreate clickOnAddService() {
		KeywordsUtil.click(agreementCreateLocators.ac_add_new_service_button);
		MethodsUtil.loaderWait();
		return PageFactory.initElements(wwDriver, ServiceLineCreate.class);
	}
	
	/**
	 * @return
	 */
	public SiteCreate clickOnSiteCreate() {
		KeywordsUtil.click(agreementCreateLocators.ac_add_new_site_button);
		MethodsUtil.loaderWait();
		return PageFactory.initElements(wwDriver, SiteCreate.class);
	}
	
	
}
