package CRM.MainPages;

import java.util.LinkedHashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.MainPages.Locators.AgreementIndexLocators;
import CRM.MainPages.Locators.Constants.AI_LocatorsConstants;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.AgreementCreate;

/**
 * @author jteja
 *
 */
public class AgreementIndex extends SourcePage {

	public AgreementIndexLocators agreementIndexLocators;
	public AI_LocatorsConstants ai_locatorConstants;

	/**
	 * 
	 */
	public AgreementIndex() {
		this.agreementIndexLocators = new AgreementIndexLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.agreementIndexLocators);
		
		this.ai_locatorConstants = new AI_LocatorsConstants();
	}

	public LinkedHashMap<String, String> getLocators() {

		String pi_Variables = ai_locatorConstants.toString();
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
	public AgreementCreate clickOnNewAgreement() {
		KeywordsUtil.click(agreementIndexLocators.newAgreement_Button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, AgreementCreate.class);
	}

}
