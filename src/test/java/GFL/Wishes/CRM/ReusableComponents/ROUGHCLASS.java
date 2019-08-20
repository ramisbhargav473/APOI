package GFL.Wishes.CRM.ReusableComponents;

import CRM.Base.SourcePage;

public class ROUGHCLASS extends SourcePage{
	
	/*
	 * public static int getNbOfMergedRegions(XSSFSheet sheet, int row) { int count
	 * = 0;
	 * 
	 * for(int i = 0; i < sheet.getNumMergedRegions(); ++i) { CellRangeAddress range
	 * = sheet.getMergedRegion(i); if (range.getFirstRow() <= row &&
	 * range.getLastRow() >= row) {
	 * sheet.getRow(range.getLastRow()).getCell(range.getLastColumn()).setCellValue(
	 * sheet.getRow(range.getFirstRow()).getCell(range.getFirstColumn()).
	 * getStringCellValue()); ++count; } } return count; }
	 */

	public static void main(String args[]) {
		/*
		 * excel = new ExcelUtility(
		 * "C:\\Users\\jteja\\WISHES\\TestAutomation\\GFL.Wishes\\src\\test\\resources\\TestData\\TestData.xlsx"
		 * ); int rows = ExcelUtility.getRowCount("ProspectEdit"); int rowNum = 0;
		 * for(int i=0; i<rows; i++) {
		 * if(getNbOfMergedRegions(ExcelUtility.testDataSheet, i)>0) {
		 * System.out.println(i); rowNum = i; } } System.out.println(rowNum);
		 */
		
		SourcePage.initialConfigurations();
		
		SourcePage.sidePanel.clickAgreements();
		
		
	}
}
