package CRM.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CRM.Base.Locators.ADLoginLocators;
import CRM.Base.Locators.Constants.AD_LocatorsConstants;

/**
 * @author jteja
 *
 */
public class ADLogin {

	/**
	 * 
	 */
	public ADLoginLocators adLoginLocators;
	public AD_LocatorsConstants ad_LocatorsConstants;

	/**
	 * @param webDriverInstance
	 */
	public ADLogin(WebDriver webDriverInstance) {

		this.adLoginLocators = new ADLoginLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(webDriverInstance, 10);
		PageFactory.initElements(factory, this.adLoginLocators);

	}

	/**
	 * @param webDriverInstance
	 * @param wishesURL
	 * @param userName
	 * @param password
	 * @return
	 */
	public void loginToWishes(WebDriver webDriverInstance, String wishesURL, String userName, String password) {

		WebDriverWait wait = new WebDriverWait(webDriverInstance, 10);

		webDriverInstance.get(wishesURL);

		wait.until(ExpectedConditions.elementToBeClickable(adLoginLocators.userName_ADLogin));
		adLoginLocators.userName_ADLogin.sendKeys(userName);

		wait.until(ExpectedConditions.elementToBeClickable(adLoginLocators.next_ADLogin_Button));
		adLoginLocators.next_ADLogin_Button.click();

		wait.until(ExpectedConditions.elementToBeClickable(adLoginLocators.password_ADLogin));
		adLoginLocators.password_ADLogin.sendKeys(password);

		wait.until(ExpectedConditions.elementToBeClickable(adLoginLocators.signIn_ADLogin_Button));
		adLoginLocators.signIn_ADLogin_Button.click();
		
		/* return PageFactory.initElements(webDriverInstance, Home.class); */

	}
}
