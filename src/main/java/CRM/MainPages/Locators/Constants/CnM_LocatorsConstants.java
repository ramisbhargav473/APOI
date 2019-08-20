/**
 * 
 */
package CRM.MainPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class CnM_LocatorsConstants {

	public static final String CNM_REGION_DROPDOWN = "controller-maintenance div[class='region_header'] mat-select[formcontrolname='regionId'] div[class='mat-select-arrow']";
	public static final String CNM_BUSINESS_UNIT_DROPDOWN = "controller-maintenance div[class='region_header'] mat-select[formcontrolname='businessUnitTypeId'] div[class='mat-select-arrow']";
	public static final String CNM_EDIT_BUTTON = "div[class='buttons_sticky_bottom customer_views'] button";
	
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
