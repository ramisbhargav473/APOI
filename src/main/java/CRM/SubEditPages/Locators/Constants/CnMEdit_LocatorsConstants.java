/**
 * 
 */
package CRM.SubEditPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class CnMEdit_LocatorsConstants {
	
	public static final String CNM_EDIT_REGION_DROPDOWN = "controller-maintenance div[class='region_header'] mat-select[formcontrolname='regionId'] div[class='mat-select-arrow']";
	public static final String CNM_EDIT_BUSINESS_UNIT_DROPDOWN = "controller-maintenance div[class='region_header'] mat-select[formcontrolname='businessUnitTypeId'] div[class='mat-select-arrow']";
	public static final String CNM_EDIT_APPROVALS_CHECKBOX = "controller-maintenance general mat-checkbox[formcontrolname='isAgreementRequiresApproval'] input[type='checkbox']";
	public static final String CNM_EDIT_DISCARD_BUTTON = "controller-maintenance div[class='buttons_sticky_bottom customer_views'] button:nth-child(1)";
	public static final String CNM_EDIT_PUBLISH_BUTTON = "controller-maintenance div[class='buttons_sticky_bottom customer_views'] button:nth-child(2)";

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
