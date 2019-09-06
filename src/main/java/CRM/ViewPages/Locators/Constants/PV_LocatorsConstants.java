/**
 * 
 */
package CRM.ViewPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class PV_LocatorsConstants {

	public static final String PV_SAVE_SUCCESS_BANNER = "div[class='cdk-overlay-container'] div[class='cdk-global-overlay-wrapper'] div[class='cdk-overlay-pane'] snack-bar-container success-snack-bar";
	public static final String PV_SAVE_FAILURE_BANNER = "div[class='cdk-overlay-container'] div[class='cdk-global-overlay-wrapper'] div[class='cdk-overlay-pane'] snack-bar-container validation-snack-bar";
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		Class<?> thisClass = null;
		try {
			thisClass = Class.forName(this.getClass().getName());

			Field[] aClassFields = thisClass.getDeclaredFields();
			/* sb.append(this.getClass().getSimpleName() + " [ "); */
			for (Field f : aClassFields) {
				String fName = f.getName();
				sb.append(fName + " = " + f.get(this) + ",");
			}
			/* sb.append("]"); */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sb.toString();
	}
	
}
