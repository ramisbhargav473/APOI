package CRM.Base;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author jteja
 *
 */
public class SourcePage {

	public static Logger logger;
	public static WebDriver wwDriver;
	public static SidePanel sidePanel;
	public static ADLogin adLogin;
	/* public static MethodsUtil methodsUtil; */

	public static void initialConfigurations() {

		logger = LogManager.getLogger(SourcePage.class);
		// WebDriver related code
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\chromedriver.exe");
		wwDriver = new ChromeDriver();
		wwDriver.manage().window().maximize();
		wwDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wwDriver.manage().deleteAllCookies();
		// common classes initialization - Side Navigation panel and AD login page.
		adLogin = new ADLogin(wwDriver);
		sidePanel = new SidePanel(wwDriver);

	}
}
