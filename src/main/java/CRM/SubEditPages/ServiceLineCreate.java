package CRM.SubEditPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.Locators.ServiceLineCreateLocators;
import CRM.SubEditPages.Locators.Constants.SLC_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class ServiceLineCreate extends SourcePage{

	public ServiceLineCreateLocators serviceLineCreateLocators;
	public SLC_LocatorsConstants slc_locatorsConstants;
	
	public ServiceLineCreate() {
		this.serviceLineCreateLocators = new ServiceLineCreateLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.serviceLineCreateLocators);
		
		this.slc_locatorsConstants = new SLC_LocatorsConstants();
	}
	
	public LinkedHashMap<String, String> getLocators() {

		String pc_Variables = slc_locatorsConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pc_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}
	
	public AgreementCreate clickOnAddServiceForNewAgreement() {
		KeywordsUtil.click(serviceLineCreateLocators.slc_add_service_button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, AgreementCreate.class);
	}
	
}
