package CRM.SubEditPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.SubEditPages.Locators.AgreementEditLocators;
import CRM.SubEditPages.Locators.Constants.AE_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class AgreementEdit extends SourcePage {

	public AgreementEditLocators agreementEditLocators;
	public AE_LocatorsConstants ae_locatorConstants;

	/**
	 * 
	 */
	public AgreementEdit() {
		this.agreementEditLocators = new AgreementEditLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.agreementEditLocators);

		this.ae_locatorConstants = new AE_LocatorsConstants();
	}

	public LinkedHashMap<String, String> getLocators() {

		String pi_Variables = ae_locatorConstants.toString();
		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();
		String[] pi_Variables_Split = pi_Variables.split(",");
		for (int i = 0; i < pi_Variables_Split.length; i++) {
			locatorsMap.put(pi_Variables_Split[i].split(" = ")[0], pi_Variables_Split[i].split(" = ")[1]);
		}
		return locatorsMap;
	}

}
