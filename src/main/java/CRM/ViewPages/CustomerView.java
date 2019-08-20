package CRM.ViewPages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.KeywordsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.SubEditPages.CustomerEdit;
import CRM.SubEditPages.SiteEdit;
import CRM.ViewPages.Locators.CustomerViewLocators;

/**
 * @author jteja
 *
 */
public class CustomerView extends SourcePage {

	public CustomerViewLocators customerViewLocators;
	
	/**
	 * 
	 */
	public CustomerView() {
		this.customerViewLocators = new CustomerViewLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(wwDriver, 10);
		PageFactory.initElements(factory, this.customerViewLocators);
	}
	
	/**
	 * @return
	 */
	public CustomerEdit clickEditCustomer() {
		KeywordsUtil.click(customerViewLocators.editCustomer_Button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, CustomerEdit.class);
	}
	
	/**
	 * @return
	 */
	public SiteEdit clickEditSite() {
		KeywordsUtil.click(customerViewLocators.editSite_Button);
		MethodsUtil.customWait();
		return PageFactory.initElements(wwDriver, SiteEdit.class);
	}
}
