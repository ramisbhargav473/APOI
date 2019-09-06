package CRM.ViewPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.ProspectEdit;
import CRM.SubEditPages.SiteCreate;
import CRM.ViewPages.Locators.ProspectViewLocators;
import CRM.ViewPages.Locators.Constants.PV_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class ProspectView extends SourcePage{

	public ProspectViewLocators prospectViewLocators;
	public PV_LocatorsConstants pv_locatorsConstants;
	
	/**
	 * 
	 */
	public ProspectView() {
		this.prospectViewLocators = new ProspectViewLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.prospectViewLocators);
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = pv_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	/**
	 * @return
	 * @throws InterruptedException 
	 */
	public ProspectEdit clickEditProspect() throws InterruptedException {
		MethodsUtil.loaderWait();
		Thread.sleep(1000);
		KeywordsUtil.click(prospectViewLocators.EditProspect_Button);
		MethodsUtil.loaderWait();
		explicitWait.until(ExpectedConditions.urlContains("edit"));
		return PageFactory.initElements(wwDriver, ProspectEdit.class);
	}

	/**
	 * @return
	 */
	public SiteCreate clickCreateSite() {
		KeywordsUtil.click(prospectViewLocators.CreateSite_Button);
		MethodsUtil.loaderWait();
		explicitWait.until(ExpectedConditions.urlContains("site"));
		return PageFactory.initElements(wwDriver, SiteCreate.class);
	}
	
	public AgreementCreate clickCreateAgreement() throws InterruptedException {
		MethodsUtil.loaderWait();
		Thread.sleep(1000);
		KeywordsUtil.click(prospectViewLocators.CreateAgreement_Button);
		MethodsUtil.loaderWait();
		explicitWait.until(ExpectedConditions.urlContains("agreement"));
		return PageFactory.initElements(wwDriver, AgreementCreate.class);
	}
}
