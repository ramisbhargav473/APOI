/**
 * 
 */
package CRM.ViewPages.Locators.Constants;

import java.lang.reflect.Field;

/**
 * @author jteja
 *
 */
public class ACC_LocatorsConstants {
	
	public static final String ACC_STATUS_DISPLAY = "div[class='customer_copy_container'] div[class='square_card grey_header'] div[class='three_col_item customerInfo__columnAlignment agreement_info--right'] div[class='customerCopy_headerStatus customerCopy_headerStatus--right'] span:nth-child(1)";
	public static final String ACC_AGREE_TNC_CHECKBOX = "mat-checkbox input[type='checkbox']";
	public static final String ACC_DOWNLOAD_BUTTON = "div[class='buttons_sticky_bottom'] button:nth-child(1)";
	public static final String ACC_EDIT_AGREEMENT_BUTTON = "div[class='buttons_sticky_bottom'] button:nth-child(2)";
	public static final String ACC_MARK_AS_SIGNED_BUTTON = "div[class='buttons_sticky_bottom'] button:nth-child(3)";
	public static final String ACC_CSA_SIGN_CONFIRM_CHECKBOX = "div[class='cdk-overlay-container'] div[class='cdk-overlay-pane'] mat-dialog-content mat-tab-body mat-checkbox input[type='checkbox']";
	public static final String ACC_UPLOAD_DOCUMENT_TEXTFIELD = "div[class='cdk-overlay-container'] div[class='cdk-overlay-pane'] mat-dialog-content mat-tab-body input[id='file']";
	public static final String ACC_DISCARD_POPUP_BUTTON = "div[class='cdk-overlay-container'] div[class='cdk-overlay-pane'] mat-dialog-content mat-tab-body div[class='button_wrapper ng-star-inserted'] button:nth-child(1)";
	public static final String ACC_SUBMIT_DOCUMENT_BUTTON = "div[class='cdk-overlay-container'] div[class='cdk-overlay-pane'] mat-dialog-content mat-tab-body div[class='button_wrapper ng-star-inserted'] button:nth-child(2)";
	public static final String ACC_SEND_EMAIL_BUTTON = "div[class='buttons_sticky_bottom'] button:nth-child(4)";
	
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
