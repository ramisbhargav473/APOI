/**
 * 
 */
package CRM.ViewPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class AV_LocatorsConstants {

	public static final String AV_STATUS = "div[class='container_main'] div[class='agreement_details_header'] div[class='status_flag active']";
	public static final String AV_EDIT_QUOTE_BUTTON = "div[class='buttons_sticky_bottom customer_views button_sticky_custom'] button:nth-child(1)";
	public static final String AV_SAVE_AND_SUBMIT_BUTTON = "div[class='buttons_sticky_bottom customer_views button_sticky_custom'] button:nth-child(2)";
	public static final String AV_SUBMIT_CONF_BUTTON = "div[class='cdk-overlay-container'] div[class='cdk-overlay-pane'] mat-dialog-container confirm-dialog mat-dialog-actions button:nth-child(2)";
	public static final String AV_DISCARD_CONF_BUTTON = "div[class='cdk-overlay-container'] div[class='cdk-overlay-pane'] mat-dialog-container confirm-dialog mat-dialog-actions button:nth-child(1)";
	public static final String AV_EDIT_AGREEMENT_BUTTON = "div[class='buttons_sticky_bottom customer_views button_sticky_custom'] button:nth-child(1)";
	public static final String AV_CUSTOMER_COPY_BUTTON = "div[class='buttons_sticky_bottom customer_views button_sticky_custom'] button:nth-child(2)";
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();

	    Class<?> thisClass = null;
	    try {
	        thisClass = Class.forName(this.getClass().getName());

	        Field[] aClassFields = thisClass.getDeclaredFields();
			/* sb.append(this.getClass().getSimpleName() + " [ "); */
	        for(Field f : aClassFields){
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
