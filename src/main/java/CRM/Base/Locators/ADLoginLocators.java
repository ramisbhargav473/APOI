package CRM.Base.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author jteja
 *
 */
public class ADLoginLocators {

	@FindBy(css = "div[class='placeholderContainer'] input[class='form-control ltr_override']")
	public WebElement userName_ADLogin;

	@FindBy(xpath = "//*[@id=\"idSIButton9\"]")
	public WebElement next_ADLogin_Button;

	@FindBy(xpath = "//*[@id=\"i0118\"]")
	public WebElement password_ADLogin;

	@FindBy(css = "div[class='col-xs-24 no-padding-left-right button-container'] input[class='btn btn-block btn-primary']")
	public WebElement signIn_ADLogin_Button;

	@FindBy(css = "div[class='col-md-24 form-group checkbox'] input[id='KmsiCheckboxField']")
	public WebElement remember_Checkbox_ADLogin;

	@FindBy(css = "div[class='col-xs-24 no-padding-left-right button-container'] input[id='idSIButton9']")
	public WebElement accept_ADLogin;

}
