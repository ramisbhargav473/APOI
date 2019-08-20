package CRM.ViewPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author jteja
 *
 */
public class CustomerViewLocators {

	@FindBy(css="div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(1)")
	public WebElement deactivateCustomer_Button;
	
	@FindBy(css="div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(2)")
	public WebElement editCustomer_Button;
	
	@FindBy(css="div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(3)")
	public WebElement createSite_Button;
	
	@FindBy(css="div[class='buttons_sticky_bottom customer_views ng-star-inserted'] button:nth-child(4)")
	public WebElement createAgreement_Button;
	
	@FindBy(css="div[class='viewComponent__billingInfo__container'] div[class='billingInfo__customerSites'] sites div[class=' siteComponent__header'] button")
	public WebElement editSite_Button;
	
}
