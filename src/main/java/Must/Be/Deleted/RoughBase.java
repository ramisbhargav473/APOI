package Must.Be.Deleted;

import java.lang.reflect.Field;

import CRM.Base.SourcePage;
import CRM.MainPages.ProspectIndex;


public class RoughBase extends SourcePage {
	
	public static final String PI_MOREFILTERS_SEARCH_BUTTON = "filters mat-accordion mat-expansion-panel button:nth-child(2)";
	public static final String PI_LESSFILTERS_BUTTON = "filters mat-accordion mat-expansion-panel mat-expansion-panel-header[aria-expanded='true']";
	public static final String PI_SEARCHRESULTSLIMIT_DROPDOWN_BUTTON = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] div[class='pagination_header_container'] mat-form-field mat-select div[class='mat-select-arrow']";
	public static final String PI_SEARCHRESULTSLIMIT_DROPDOWN_OPTIONS = "div[class='cdk-overlay-container'] div[class='cdk-overlay-connected-position-bounding-box'] div[class='cdk-overlay-pane']";
	public static final String PI_CREATEREPORT_BUTTON = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] div[class='pagination_header_container'] button";
	public static final String PI_PROSPECTGRID_RESULTS = "prospects div[class='prospectsComponent'] div[class='container_main prospects_main'] div[class='table-container'] table tbody";
	
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
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		RoughBase rough = new RoughBase();
		System.out.println(rough.toString());
		
		ProspectIndex pi = new ProspectIndex();
		pi.getLocators();
		
	}
}
