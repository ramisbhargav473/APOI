package CRM.TestListeners;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import CRM.ReusableComponents.ConstantsUtil;
import CRM.ReusableComponents.MethodsUtil;
import CRM.TestDriver.DriverClass;

public class WishesTestListeners extends DriverClass implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		wwDriver.navigate().to(ConstantsUtil.BASE_URL);
		logger.info("---------------------------------------------------------------------------------------------------------------------------------------");
		logger.info(result.getMethod().getMethodName().toUpperCase()+" - Test Started");
		extentTest = extentReport.createTest(result.getMethod().getMethodName().toUpperCase());
		extentTest.log(Status.INFO, result.getMethod().getMethodName().toUpperCase()+" - Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info(result.getMethod().getMethodName().toUpperCase()+" - Test Successful");
		extentTest.log(Status.PASS, result.getMethod().getMethodName().toUpperCase()+" - Test Successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info(result.getMethod().getMethodName().toUpperCase()+" - Test Failed");
		try {
			extentTest.log(Status.FAIL, extentTest.addScreenCaptureFromPath(MethodsUtil.capture(wwDriver, result.getMethod()))+result.getMethod().getMethodName().toUpperCase()+" - Test Failed" + result.getThrowable());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info(result.getMethod().getMethodName().toUpperCase()+" - Test Skipped");
		extentTest.log(Status.SKIP, result.getMethod().getMethodName().toUpperCase()+" - Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		extentHTMLReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\Testresults\\ExtentReports\\"+new SimpleDateFormat("yyyy-MM-dd hh_mm_ss").format(new Date()) + "_Automation Report.html");
		extentReport = new ExtentReports();
		extentReport.attachReporter(extentHTMLReporter);
		
		/*
		 * extentReport.setSystemInfo("OS", OS); extentReport.setSystemInfo("Browser",
		 * browser);
		 */
        
        //configuration items to change the look and feel
        //add content, manage tests etc
		 extentHTMLReporter.config().setChartVisibilityOnOpen(true);
		 extentHTMLReporter.config().setDocumentTitle("WISHES CRM");
		 extentHTMLReporter.config().setReportName("Automation Test Report");
		 extentHTMLReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		 extentHTMLReporter.config().setTheme(Theme.DARK);
		 extentHTMLReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		 extentHTMLReporter.config().setLevel(Status.INFO);      
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

}
