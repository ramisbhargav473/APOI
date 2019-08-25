/**
 * 
 */
package CRM.ReusableComponents;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;

/**
 * @author jteja
 *
 */
public class KeywordsUtil extends MethodsUtil {

	/***************************************************************************************************************/

	/**
	 * @param element
	 */
	public static void scope(WebElement element) {
		((JavascriptExecutor) wwDriver).executeScript(ConstantsUtil.JS_EXECUTOR_SCOPE, element);
	}

	/***************************************************************************************************************/

	/**
	 * @param element
	 */
	public static void click(WebElement element) {
		explicitWait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor js = (JavascriptExecutor) wwDriver;
		scope(element);
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", element);
		MethodsUtil.loaderWait();
	}

	/***************************************************************************************************************/
	
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public static void checkOption(WebElement element, String value) {

		Boolean check = false;

		if (value != null && value != "") {
			check = true;
		} else if (value == null || value == "") {
			check = false;
		}

		/* Actions actions = new Actions(wwDriver); */

		if (check && !element.isSelected()) {
			/* actions.moveToElement(element).click().perform(); */
			click(element);
		} else if (!check && element.isSelected()) {
			/*actions.moveToElement(element).click().perform();*/
			click(element);
		}
	}

	/***************************************************************************************************************/

	/**
	 * 
	 * @param fieldName
	 * @param locator
	 * @param value
	 */
	public static void enterText(String fieldName, String locator, String value) {
		WebElement element = wwDriver.findElement(By.cssSelector(locator));
		customWait();
		scope(element);
		element.clear();
		element.sendKeys(value);
		logger.info(value + " is entered in " + fieldName);
		extentTest.log(Status.INFO, value + " is entered in " + fieldName);
	}

	/***************************************************************************************************************/

	/**
	 * 
	 * @param fieldName
	 * @param locator
	 * @param value
	 * @throws InterruptedException 
	 */
	public static void selectDropdownValue(String fieldName, String locator, String value) throws InterruptedException {

		WebElement element = wwDriver.findElement(By.cssSelector(locator));
		click(element);
		
		WebElement overlayContainer = wwDriver.findElement(By.cssSelector(ConstantsUtil.OVERLAY_CONTAINER));
		List<WebElement> options = overlayContainer.findElements(By.tagName(ConstantsUtil.DROPDOWN_OPTIONS));
		int count = 0;

		for (WebElement option : options) {
			if (option.getText().toLowerCase().trim().equalsIgnoreCase(value.toLowerCase().trim())) {
				logger.info("Selecting " + option.getText() + " from the " + fieldName);
				extentTest.log(Status.INFO, "Selecting " + option.getText() + " from the " + fieldName);
				option.click();
				count++;
				break;
			}
		}

		if (count == 0) {
			click(options.get(0));
			logger.info("Selected " + options.get(0).getText() + " from the " + fieldName);
			extentTest.log(Status.INFO, "Selected " + options.get(0).getText() + " from the " + fieldName);
		}
		
	}

	/***************************************************************************************************************/

	/**
	 * @param fieldName
	 * @param locator
	 * @param value
	 */
	public static void selectLevel(String fieldName, String locator, String value) {

		WebElement element = wwDriver.findElement(By.cssSelector(locator));
		List<WebElement> elements = element.findElements(By.cssSelector("span[class='slider_level bold']"));
		
		switch (value) {
		case "0":
			click(elements.get(0));
			logger.info("Clicked on "+elements.get(0).getText()+" from "+fieldName);
			extentTest.log(Status.INFO, "Clicked on "+elements.get(0).getText()+" from "+fieldName);
			break;

		case "25":
			click(elements.get(1));
			logger.info("Clicked on "+elements.get(1).getText()+" from "+fieldName);
			extentTest.log(Status.INFO, "Clicked on "+elements.get(1).getText()+" from "+fieldName);
			break;

		case "50":
			click(elements.get(2));
			logger.info("Clicked on "+elements.get(2).getText()+" from "+fieldName);
			extentTest.log(Status.INFO, "Clicked on "+elements.get(2).getText()+" from "+fieldName);
			break;

		case "75":
			click(elements.get(3));
			logger.info("Clicked on "+elements.get(3).getText()+" from "+fieldName);
			extentTest.log(Status.INFO, "Clicked on "+elements.get(3).getText()+" from "+fieldName);
			break;

		case "100":
			click(elements.get(4));
			logger.info("Clicked on "+elements.get(4).getText()+" from "+fieldName);
			extentTest.log(Status.INFO, "Clicked on "+elements.get(4).getText()+" from "+fieldName);
			break;
		}
	}

	/***************************************************************************************************************/

	/**
	 * @param fieldName
	 * @param locator
	 * @param value
	 * @throws InterruptedException 
	 */
	public static void check(String fieldName, String locator, String value) throws InterruptedException {

		WebElement element = wwDriver.findElement(By.cssSelector(locator));
		Boolean check = false;

		if (value.equalsIgnoreCase("yes")) {
			check = true;
		} else if (value.equalsIgnoreCase("no")) {
			check = false;
		}

		/* Actions actions = new Actions(wwDriver); */

		if (check && !element.isSelected()) {
			/* actions.moveToElement(element).click().perform(); */
			click(element);
			logger.info(fieldName + " Checkbox is checked");
			extentTest.log(Status.INFO, fieldName + " Checkbox is checked");
		} else if (!check && element.isSelected()) {
			/* actions.moveToElement(element).click().perform(); */
			click(element);
			logger.info(fieldName + " Checkbox is unchecked");
			extentTest.log(Status.INFO, fieldName + " Checkbox is unchecked");
		}
		Thread.sleep(2000);
	}

	/***************************************************************************************************************/

	/**
	 * @param fieldName
	 * @param locator
	 * @param value
	 */
	public static void clickElement(String fieldName, String locator, String value) {
		WebElement element = wwDriver.findElement(By.cssSelector(locator));
		click(element);
		logger.info("Clicked on "+fieldName);
		extentTest.log(Status.INFO, "Clicked on "+fieldName);
	}
	
	/***************************************************************************************************************/

	/**
	 * @param fieldName
	 * @param element
	 * @param value
	 * @throws InterruptedException 
	 */
	public static void enterInCombobox(String fieldName, String locator, String value) throws InterruptedException {
		WebElement element = wwDriver.findElement(By.cssSelector(locator));
		scope(element);
		element.click();
		element.clear(); 
		element.sendKeys(value);
		explicitWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("mat-spinner"), 0));
		spinnerWait();
		try {
			wwDriver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
			WebElement overlayContainer = wwDriver.findElement(By.cssSelector(ConstantsUtil.OVERLAY_CONTAINER));
			List<WebElement> options = overlayContainer.findElements(By.tagName(ConstantsUtil.DROPDOWN_OPTIONS));

			int count = 0;

			for (WebElement option : options) {
				if (option.getText().toLowerCase().trim().contains(value.toLowerCase().trim())) {
					click(option);
					logger.info("Selected " + value + " from the " + fieldName);
					extentTest.log(Status.INFO, "Selected " + value + " from the " + fieldName);
					count++;
					break;
				}
			}

			if (count == 0) {
				click(options.get(0));
				logger.info("Selected " + value + " from the " + fieldName);
				extentTest.log(Status.INFO, "Selected " + value + " from the " + fieldName);
			}wwDriver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		} catch(Exception e) {
			logger.info("No Results found");
		}
	}

	/***************************************************************************************************************/

	/**
	 * @param fieldName
	 * @param element
	 * @param value
	 */
	public static void selectRadioValue(String fieldName, String locator, String value) {
		WebElement radioContainer = wwDriver.findElement(By.cssSelector(locator));
		List<WebElement> options = radioContainer.findElements(By.tagName(ConstantsUtil.RADIO_OPTIONS));
		System.out.println(options.get(0).getText());

		int count = 0;

		for (WebElement option : options) {
			if (option.getText().toLowerCase().trim().contains(value.toLowerCase().trim())) {
				WebElement element = option.findElement(By.cssSelector("div[class='mat-radio-container'] div[class='mat-radio-inner-circle']"));
				click(element);
				logger.info("Selected " + option.getText() + " from the " + fieldName);
				extentTest.log(Status.INFO, "Selected " + option.getText() + " from the " + fieldName);
				count++;
				break;
			}
		}

		if (count == 0 && value !=null) {
			WebElement custom = options.get(options.size()-1).findElement(By.cssSelector("div[class='mat-radio-container'] div[class='mat-radio-inner-circle']"));
			click(custom);
			options.get(options.size()-1).findElement(By.cssSelector("input[placeholder='Other']")).sendKeys(value);
			logger.info("entered " + value + " in the " + fieldName);
			extentTest.log(Status.INFO, "entered " + value + " in the " + fieldName);
		}
	}

	/***************************************************************************************************************/

	/**
	 * @param fieldName
	 * @param element
	 * @param value
	 */
	public static void selectMultipleValues(String fieldName, String locator, String value) {
		
		String[] valueList = value.split(",");
		
		WebElement checkboxContainer = wwDriver.findElement(By.cssSelector(locator));
		List<WebElement> options = checkboxContainer.findElements(By.tagName(ConstantsUtil.CHECKBOX_OPTIONS));

		for (WebElement option : options) {
			for(String optionValue : valueList) {
				if (option.getText().toLowerCase().trim().contains(optionValue.toLowerCase().trim())) {
					checkOption(option, optionValue);
					logger.info("Selected " + option.getText() + " from the " + fieldName);
					extentTest.log(Status.INFO, "Selected " + option.getText() + " from the " + fieldName);
				}
			}
		}
	}

	/***************************************************************************************************************/
	
	/**
	 * @param fieldName
	 * @param locator
	 * @param value
	 */
	public static void selectResult(String fieldName, String locator, String value) {
		List<WebElement> elements = wwDriver.findElements(By.cssSelector(locator));
		System.out.println(elements.size());
		
		for(WebElement result: elements) {
			
			if(result.getText().toLowerCase().trim().equalsIgnoreCase(value.toLowerCase().trim())) {
				System.out.println("element found");
				click(result);
				break;
			}
		}
	}

	
}
