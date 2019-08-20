/**
 * 
 */
package CRM.Base.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class SP_LocatorsConstants {
	
	public static final String SP_HOME_LINK = "mat-nav-list a[href='/']";
	public static final String SP_PROSPECTS_LINK = "mat-nav-list a[href='/prospects']";
	public static final String SP_CUSTOMERS_LINK = "mat-nav-list a[href='/customers']";
	public static final String SP_AGREEMENTS_LINK = "mat-nav-list a[href='/agreements']";
	public static final String SP_CALENDAR_LINK = "mat-nav-list a[href='/calendar']";
	public static final String SP_MY_REPORTS_LINK = "mat-nav-list a[href='/my-reports']";
	public static final String SP_CDE_DASHBOARD_LINK = "mat-nav-list a[href='/cde-dashboard']";
	public static final String SP_BI_REPORTING_LINK = "mat-nav-list a[href='/bi-reporting']";
	public static final String SP_USERS_LINK = "mat-nav-list a[href='/users']";
	public static final String SP_TRAINING_LINK = "mat-nav-list a[href='https://wishestraining.gflenv.com']";
	public static final String SP_ADMIN_LINK = "mat-nav-list a[class='parent mat-list-item ng-star-inserted']";
	public static final String SP_CONTROLLER_AND_MAINTENANCE_LINK = "mat-nav-list div[class='submenu ng-star-inserted expanded'] a[href='/admin/controller-maintenance']";
	
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
