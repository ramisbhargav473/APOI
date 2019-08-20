package CRM.SubEditPages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgreementEditLocators {
	
	/********************** AgreementInfo Container **************************************/
	
	@FindBy(css="div[class='createComponent__cards'] div[class='container_card cards__container'] mat-form-field input[formcontrolname='poNumber']")
	public WebElement poNumber_TextField;
	
	@FindBy(css="div[class='createComponent__cards'] div[class='container_card cards__container'] mat-form-field input[formcontrolname='effectiveDate']")
	public WebElement effectiveDate_TextField;
	
	@FindBy(css="div[class='createComponent__cards'] div[class='container_card cards__container'] mat-checkbox input[role='checkbox']")
	public WebElement markAgreementAsUrgent_Checkbox;

	@FindBy(css="div[class='createComponent__cards'] div[class='container_card cards__container'] mat-form-field mat-select[formcontrolname='term'] div[class='mat-select-arrow']")
	public WebElement expiresOn_Dropdown_Button;
	
	@FindBy(css="div[class='cdk-overlay-container'] div[class='cdk-overlay-connected-position-bounding-box'] div[class='cdk-overlay-pane']")
	public WebElement expiresOn_Dropdown_Options;
	
	/********************** Service Line Container **************************************/
	
	@FindBy(css="div[class='createComponent__cards'] div[class='container_card cards__container'] div[class='button_container_right'] button")
	public WebElement addNewService_Button;
	
	/********************** ActionButtons Container **************************************/
	
	@FindBy(css="div[class='buttons_sticky_bottom'] button:nth-child(1)")
	public WebElement discard_Button;
	
	@FindBy(css="div[class='buttons_sticky_bottom'] button:nth-child(2)")
	public WebElement updateAgreement_Button;
}
