package CRM.ReusableComponents;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestNGMethod;

import CRM.MainPages.CustomerIndex;
import CRM.MainPages.ProspectIndex;
import CRM.SubEditPages.AgreementCreate;
import CRM.SubEditPages.ControllerAndMaintenanceEdit;
import CRM.SubEditPages.CustomerEdit;
import CRM.SubEditPages.ProspectCreate;
import CRM.SubEditPages.ProspectEdit;
import CRM.SubEditPages.ServiceLineCreate;
import CRM.SubEditPages.SiteCreate;
import CRM.SubEditPages.SiteEdit;
import CRM.TestDriver.DriverClass;
import CRM.ViewPages.AgreementCustomerCopy;
import CRM.ViewPages.ProspectView;

/**
 * @author jteja
 *
 */
public class MethodsUtil extends DriverClass {
	
	/***************************************************************************************************************/
	
	public static int elapsedTime(long startTime, long endTime) {
		
		float sec = (endTime - startTime) / 1000F;
		int seconds = (int) sec;
		
		return seconds;
	}

	/***************************************************************************************************************/

	public static void customWait() {

		try {

			wwDriver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);

			long start = System.currentTimeMillis();

			while (wwDriver.findElements(By.cssSelector("global-loader mat-progress-bar")).size() > 0 || wwDriver
					.findElements(By.cssSelector(
							"mat-sidenav-container mat-sidenav-content[class='mat-drawer-content mat-sidenav-content global-loader-loading']"))
					.size() > 0) {

				if(elapsedTime(start, System.currentTimeMillis()) >=10) {
					break;
				}

			}

			start = System.currentTimeMillis();

			while (wwDriver.findElements(By.cssSelector("mat-spinner"))
					.size() > 0 /* || wwDriver.findElements(By.cssSelector("mat-progress-spinner")).size()>0 */) {
				if(elapsedTime(start, System.currentTimeMillis()) >=10) {
					break;
				}
			}
			
			start = System.currentTimeMillis();

			while (wwDriver.findElements(By.cssSelector(ConstantsUtil.OVERLAY_CONTAINER)).size() > 0) {
				if(elapsedTime(start, System.currentTimeMillis()) >=10) {
					break;
				}
			}

			start = System.currentTimeMillis();
			while (wwDriver
					.findElements(By.cssSelector("div[class='container_card cards__container ng-star-inserted']"))
					.size() < 0) {
				if(elapsedTime(start, System.currentTimeMillis()) >=10) {
					break;
				}
			}
			
			start = System.currentTimeMillis();

			while (wwDriver.findElements(By.cssSelector(ConstantsUtil.VALIDATION_MESSAGES)).size() > 0) {
				if(elapsedTime(start, System.currentTimeMillis()) >=10) {
					break;
				}
			}

			wwDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (Exception e) {

		}
	}

	/***************************************************************************************************************/

	public static void loaderWait() {

		try {

			wwDriver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
			long start = System.currentTimeMillis();
			while (wwDriver.findElements(By.cssSelector("global-loader mat-progress-bar")).size() > 0 || wwDriver
					.findElements(By.cssSelector(
							"mat-sidenav-container mat-sidenav-content[class='mat-drawer-content mat-sidenav-content global-loader-loading']"))
					.size() > 0) {
				if(elapsedTime(start, System.currentTimeMillis()) >=10) {
					break;
				}
			}
			
			start = System.currentTimeMillis();

			while (wwDriver.findElements(By.cssSelector("mat-spinner")).size() > 0
					|| wwDriver.findElements(By.cssSelector("mat-progress-spinner")).size() > 0) {
				if(elapsedTime(start, System.currentTimeMillis()) >=10) {
					break;
				}

			}
			

			wwDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (Exception e) {

		}
	}

	/***************************************************************************************************************/

	public static void spinnerWait() {

		try {

			wwDriver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
			long start = System.currentTimeMillis();
			while (wwDriver.findElements(By.cssSelector("mat-spinner")).size() > 0
					|| wwDriver.findElements(By.cssSelector("mat-progress-spinner")).size() > 0) {
				if(elapsedTime(start, System.currentTimeMillis()) >=10) {
					break;
				}
			}

			wwDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (Exception e) {

		}
	}

	/***************************************************************************************************************/

	/**
	 * @param driver
	 * @param m
	 * @return
	 * @throws IOException
	 */
	public static String capture(WebDriver driver, ITestNGMethod m) throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/test/resources/TestResults/Screenshots/" + m.getMethodName() + "_"
				+ System.currentTimeMillis() + ".png");
		String errflpath = Dest.getAbsolutePath();

		FileUtils.copyFile(scrFile, Dest);

		return errflpath;

	}

	/**
	 * @throws InterruptedException
	 *************************************************************************************************************/

	public static void executeActions(LinkedHashMap<String, Map<String, Map<String, String>>> dataMap,
			String testCaseID, String sheetName, LinkedHashMap<String, String> map) throws InterruptedException {
		for (String fieldName : dataMap.get(testCaseID).get(sheetName).keySet()) { // fieldName coming from Excel
			String value = dataMap.get(testCaseID).get(sheetName).get(fieldName);
			if (value != "" && value != null) {
				for (String key : map.keySet()) {
					if (key.toLowerCase().trim().equalsIgnoreCase(fieldName.trim())) {
						String locator = map.get(key);
						if (locator != "" && locator != null) {

							/* Thread.sleep(500); */
							KeywordsUtil.performActions(fieldName, locator, value);
							break;
						}
					}
				}
			}
		}
	}

	/**
	 * @throws InterruptedException
	 *************************************************************************************************************/

	public static void selector(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap, String testCaseID,
			String sheetName) throws InterruptedException {

		LinkedHashMap<String, String> locatorsMap = new LinkedHashMap<String, String>();

		switch (sheetName) {

		case "Admin":
			break;

		case "AgreementCreate":
			AgreementCreate acLocators = new AgreementCreate();
			locatorsMap = acLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "AgreementCustomerCopy":
			AgreementCustomerCopy accLocators = new AgreementCustomerCopy();
			locatorsMap = accLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "AgreementEdit":
			break;

		case "AgreementIndex":
			break;

		case "AgreementView":
			break;

		case "BIReporting":
			break;

		case "Calendar":
			break;

		case "CDEDashboard":
			break;

		case "CustomerEdit":
			CustomerEdit ceLocators = new CustomerEdit();
			locatorsMap = ceLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "CustomerIndex":
			CustomerIndex ciLocators = new CustomerIndex();
			locatorsMap = ciLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "CustomerView":
			break;

		case "Home":
			break;

		case "MyReports":
			break;

		case "ProspectEdit":
			ProspectEdit peLocators = new ProspectEdit();
			locatorsMap = peLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "ProspectIndex":
			ProspectIndex piLocators = new ProspectIndex();
			locatorsMap = piLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "ProspectCreate":
			ProspectCreate pcLocators = new ProspectCreate();
			locatorsMap = pcLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "ProspectView":
			ProspectView pvLocators = new ProspectView();
			locatorsMap = pvLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "Quotes":
			break;

		case "SLCreate":
			ServiceLineCreate slcLocators = new ServiceLineCreate();
			locatorsMap = slcLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "ServiceLineEdit":
			break;

		case "SiteCreate":
			SiteCreate scLocators = new SiteCreate();
			locatorsMap = scLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "SiteEdit":
			SiteEdit seLocators = new SiteEdit();
			locatorsMap = seLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
			break;

		case "CntNMntEdit":
			ControllerAndMaintenanceEdit cnmEditLocators = new ControllerAndMaintenanceEdit();
			locatorsMap = cnmEditLocators.getLocators();
			MethodsUtil.executeActions(finalDataMap, testCaseID, sheetName, locatorsMap);
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
	public static void performActions(String fieldName, String locator, String value) throws InterruptedException {

		String[] keywordSplit = fieldName.split("_");
		String keyword = keywordSplit[keywordSplit.length - 1];
		MethodsUtil.customWait();

		switch (keyword.toLowerCase()) {

		case "textfield":
			KeywordsUtil.enterText(fieldName, locator, value);
			break;

		case "dropdown":
			KeywordsUtil.selectDropdownValue(fieldName, locator, value);
			break;

		case "combobox":
			KeywordsUtil.enterInCombobox(fieldName, locator, value);
			break;

		case "radio":
			KeywordsUtil.selectRadioValue(fieldName, locator, value);
			break;

		case "checkbox":
			KeywordsUtil.check(fieldName, locator, value);
			break;

		case "levelindicator":
			KeywordsUtil.selectLevel(fieldName, locator, value);
			break;

		case "button":
			KeywordsUtil.clickElement(fieldName, locator, value);
			break;

		case "link":
			KeywordsUtil.clickElement(fieldName, locator, value);
			break;

		case "results":
			KeywordsUtil.selectResult(fieldName, locator, value);
			break;

		case "multiselect":
			KeywordsUtil.selectMultipleValues(fieldName, locator, value);
			break;

		case "hint":
			break;
		}
	}

	/***************************************************************************************************************/

}
