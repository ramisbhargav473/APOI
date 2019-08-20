package CRM.TestDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import CRM.Base.SourcePage;
import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.ExcelUtility;
import CRM.ReusableComponents.MethodsUtil;

public class DriverClass extends SourcePage{

	public static WebDriverWait explicitWait;
	public static ExcelUtility excel;
	public static SoftAssert softAssert;
	public static ExtentHtmlReporter extentHTMLReporter;
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;

	@BeforeSuite
	public void setUp() throws InterruptedException {
		
		SourcePage.initialConfigurations();
		explicitWait = new WebDriverWait(wwDriver, 10);
		
		excel = new ExcelUtility();
		logger.info("Test Data excel is loaded");
		
		//Logging in to WISHES application using using the AD login screens.
		adLogin.loginToWishes(wwDriver, ConstantsUtil.BASE_URL, ConstantsUtil.USER_NAME, ConstantsUtil.PASSWORD);
		logger.info("Logged into Wishes Application");
		MethodsUtil.customWait();
	}
	
	@AfterSuite
	public void tearDown() {
		/*
		 * wwDriver.quit(); logger.info("Terminating Chrome Driver Instance");
		 */
	}
	
}
