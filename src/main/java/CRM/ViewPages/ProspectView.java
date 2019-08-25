package CRM.ViewPages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.ProspectEdit;
import CRM.SubEditPages.SiteCreate;
import CRM.ViewPages.Locators.ProspectViewLocators;

/**
 * @author jteja
 *
 */
public class ProspectView extends SourcePage{

	public ProspectViewLocators prospectViewLocators;
	
	/**
	 * 
	 */
	public ProspectView() {
		this.prospectViewLocators = new ProspectViewLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.prospectViewLocators);
	}
	
	/**
	 * @return
	 */
	public ProspectEdit clickEditProspect() {
		KeywordsUtil.click(prospectViewLocators.EditProspect_Button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, ProspectEdit.class);
	}

	/**
	 * @return
	 */
	public SiteCreate clickCreateSite() {
		KeywordsUtil.click(prospectViewLocators.CreateSite_Button);
		MethodsUtil.loaderWait();
		return PageFactory.initElements(wwDriver, SiteCreate.class);
	}
	
	public AgreementCreate clickCreateAgreement() {
		KeywordsUtil.click(prospectViewLocators.CreateAgreement_Button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, AgreementCreate.class);
	}
}
