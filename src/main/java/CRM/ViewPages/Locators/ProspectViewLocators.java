package CRM.ViewPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author jteja
 *
 */
public class ProspectViewLocators {
	
	/********************** Fields in Header Details section **************************************/
	
	@FindBy(css="div[class='viewProspects__component'] div[class='info_container'] span[class='customer_name bold ls_30']")
	public WebElement prospectName_View;
	
	@FindBy(css="div[class='viewProspects__component'] div[class='info_container'] div[class='website_container']")
	public WebElement website_View;
	
	/********************** Fields in Lead Details section **************************************/
	
	@FindBy(css="div[class='container_main prospect_card'] div[class='lead_details_slider_container'] div[class='flex_row slider_text_container'] span[class='slider_percent slider_active']")
	public WebElement prospectLevelIndicator_View;

	/********************** Buttons in View Prospects page **************************************/
	
	@FindBy(css="div[class='buttons_sticky_bottom ng-star-inserted'] button:nth-child(1)")
	public WebElement EditProspect_Button;
	
	@FindBy(css="div[class='buttons_sticky_bottom ng-star-inserted'] button:nth-child(2)")
	public WebElement CreateSite_Button;
	
	@FindBy(css="div[class='buttons_sticky_bottom ng-star-inserted'] button:nth-child(3)")
	public WebElement MarkAsLost_Button;
	
	@FindBy(css="div[class='buttons_sticky_bottom ng-star-inserted'] button:nth-child(4)")
	public WebElement CreateAgreement_Button;
	
}
