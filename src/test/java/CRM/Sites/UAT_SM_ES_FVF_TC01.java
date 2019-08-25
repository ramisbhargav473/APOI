/**
 * 
 */
package CRM.Sites;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

import CRM.TestDriver.DriverClass;

/**
 * Test case full description
 * 
 * SM - Site Management
 ****We are primarily dealing with the validations pertaining to sites in various sections from where we have access to the sites module.
 * 
 * ES - Existing Site
 ****All the test cases with this notation deal with an 'Existing Site' edit from various modules.
 *
 * FVF - Form Validation Failure
 ****This means that in this test case, we are purposefully making the validation to be triggered. So we will be checking for validation
 ****failure messages to be triggered at the end of test case. If it is triggered, then the test is a PASS.
 *
 * TC01 - Test Case 1
 ****1. Prospect Index - New Prospect (lands on Prospect Create page)
 ****2. Prospect Create - Save prospect successfully with site information. (lands on Prospect View page)
 ****3. Site Edit - Save site with incomplete information. (Checks to be done in all the possible tabs)
 * 
 * 
 * @author jteja
 *
 */
public class UAT_SM_ES_FVF_TC01 extends DriverClass{


	@Test(dataProvider = "getTestDataInput", dataProviderClass = CRM.ReusableComponents.ExcelUtility.class)
	public void SM_ES_FVF_TC01(LinkedHashMap<String, Map<String, Map<String, String>>> finalDataMap)
			throws InterruptedException {
		
	}
}


