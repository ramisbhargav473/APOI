/**
 * 
 */
package CRM.Agreements;

import org.testng.annotations.Test;

import CRM.TestDriver.DriverClass;
import CRM.TestDriver.ManagerApproval;

/**
 * @author jteja
 *
 */
public class UAT_CSAM_CA_TS01_TC02 extends DriverClass {

	
	@Test
	public static void CSAM_CA_TS01_TC01() {
		ManagerApproval.managerApproval("SEND AGREEMENT ID HERE");
	}
}
