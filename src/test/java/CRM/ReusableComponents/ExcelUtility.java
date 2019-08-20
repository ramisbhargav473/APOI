package CRM.ReusableComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

/**
 * @author jteja
 *
 */
public class ExcelUtility {

	public FileInputStream fileInputStream;
	public FileOutputStream fileOutputStream;

	public static XSSFWorkbook testDataWorkbook;
	public static XSSFSheet testDataSheet;
	public static XSSFRow testDataRow;
	public static XSSFCell testDataCell;

	/**
	 * @param path
	 */
	public ExcelUtility() {
		try {
			File file = new File("C:\\Users\\jteja\\WISHES\\TestAutomation\\GFL.Wishes\\src\\test\\resources\\TestData\\NewData.xlsx");
			fileInputStream = new FileInputStream(file);
			testDataWorkbook = new XSSFWorkbook(fileInputStream);
			testDataSheet = testDataWorkbook.getSheetAt(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param sheetName
	 * @return
	 */
	public static int getRowCount(String sheetName) {
		int rowCount = 0;
		if (sheetName != null || sheetName == "") {
			testDataSheet = testDataWorkbook.getSheet(sheetName);
			rowCount = testDataSheet.getPhysicalNumberOfRows();
		}
		return rowCount;
	}

	/**
	 * @param sheetName
	 * @return
	 */
	public static int getColumnCount(String sheetName) {
		int colCount = 0;
		if ((sheetName != null || sheetName != "") && getRowCount(sheetName) > 0 && sheetName == "RunModes") {
			testDataSheet = testDataWorkbook.getSheet(sheetName);
			colCount = Integer.parseInt(getCellData(sheetName, 0, 0));
		} else if ((sheetName != null || sheetName == "") && getRowCount(sheetName) > 0) {
			testDataSheet = testDataWorkbook.getSheet(sheetName);
			colCount = testDataSheet.getRow(testDataSheet.getFirstRowNum()).getPhysicalNumberOfCells();
		}
		return colCount;
	}

	/**
	 * The row and column count is 0-based i.e the count starts from 0. If we have
	 * to get the row/column value of the first visible row/column, we have to give
	 * the value as 0. To counter this, we are adding a cell in the TestData.xlsx
	 * file at the cell (0,0) so that we can pass the row and column values starting
	 * from 1.
	 * 
	 * Variables : CellData - The string value of the cell where we are trying to
	 * fetch the data from.
	 * 
	 * @param sheetName - Name of the sheet where we are fetching data from.
	 * @param rowNumber - Row number of the cell in the sheet where we are fetching
	 *                  data from.
	 * @param colNumber - Column number of the cell in the sheet where we are
	 *                  fetching data from.
	 * @return cellData - The string value of the cell where we are trying to fetch
	 *         the data from.
	 */
	public static String getCellData(String sheetName, int rowNumber, int colNumber) {
		if (sheetName == null || sheetName == "" || rowNumber < 0 || colNumber < 0) {
			return "";
		}

		testDataSheet = testDataWorkbook.getSheet(sheetName);
		testDataCell = testDataSheet.getRow(rowNumber).getCell(colNumber, MissingCellPolicy.CREATE_NULL_AS_BLANK);
		DataFormatter formatter = new DataFormatter();
		String cellData = formatter.formatCellValue(testDataCell);

		return cellData;
	}

	/**
	 * The row and column count is 0-based i.e the count starts from 0. If we have
	 * to get the row/column value of the first visible row/column, we have to give
	 * the value as 0. To counter this, we are adding a cell in the TestData.xlsx
	 * file at the cell (0,0) so that we can pass the row and column values starting
	 * from 1.
	 * 
	 * Variables : ColNum - The column Number of the corresponding header column
	 * name passed as argument to the method.
	 * 
	 * Iterates through the first row(header) of the sheet to match the column name
	 * passed as argument to the method and stores the value of the column number in
	 * the 'colNum' variable which is later used to fetch the cell data using the
	 * 'getCellData(sheetName, rowNumber, colNumber)' method.
	 * 
	 * @param sheetName - Name of the sheet where we are fetching data from.
	 * @param rowNumber - Row number of the cell in the sheet where we are fetching
	 *                  data from.
	 * @param colName   - Column Name(Header) of the cell in the sheet where we are
	 *                  fetching data from.
	 * @return getCellData(sheetName, rowNumber, colNum) - The string value of the
	 *         cell we are fetching the data from.
	 */
	public static String getCellData(String sheetName, int rowNumber, String colName) {
		if (sheetName == null || sheetName == "" || rowNumber < 0 || colName == "" || colName == null) {
			return "";
		}
		testDataSheet = testDataWorkbook.getSheet(sheetName);
		int colCount = getColumnCount(sheetName);
		int colNum = 0;
		for (int col = 0; col < colCount; col++) {
			if ((testDataSheet.getRow(testDataSheet.getFirstRowNum()).getCell(col).toString())
					.equalsIgnoreCase(colName)) {
				colNum = col;
			}
		}
		return getCellData(sheetName, rowNumber, colNum);
	}

	/**
	 * @return
	 */
	public static ArrayList<String> getSheetNames() {
		ArrayList<String> sheetNames = new ArrayList<String>();
		for (int i = 0; i < testDataWorkbook.getNumberOfSheets(); i++) {
			sheetNames.add(testDataWorkbook.getSheetAt(i).getSheetName());
		}
		return sheetNames;
	}

	/**********************************
	 * DATA PROVIDER METHODS
	 *********************************************************/

	/*
	 * <Testcase ID, ArrayList[Map<Page1, Run1>] <Testcase ID, [{Page, <Field,
	 * [locator, value]>}, {Page, <Field, [locator, value]>}]>
	 */

	/**
	 * @param m
	 * @return
	 */
	@DataProvider(name = "getTestDataInput")
	public static Object[][] getNewTestData(Method m) {
		
		int iterations = getNumberOfIterations(m);
		Object[][] finalTestData = new Object[iterations][1];
		Map<String, ArrayList<Map<String, String>>> sheetMap = getSheetMap(m);
		Map<String, Map<String, String>> itrSheetMap = null;
		Map<String, Map<String, Map<String, String>>> iterationMap = null;
		
		for(int i=0; i<iterations; i++) {
			iterationMap = new LinkedHashMap<String, Map<String, Map<String, String>>>();
			itrSheetMap = new LinkedHashMap<String, Map<String, String>>();
			for(String sheet : sheetMap.keySet()) {
				itrSheetMap.put(sheet, sheetMap.get(sheet).get(i));
			}
			iterationMap.put(m.getName(), itrSheetMap);
			finalTestData[i][0]	= iterationMap;
		}
		
		return finalTestData;
	}


	/**
	 * @param m
	 * @return
	 */
	public static Map<String, ArrayList<Map<String, String>>> getSheetMap(Method m) {
		
		Map<String, ArrayList<Map<String, String>>> sheetMap = null;
		sheetMap = new LinkedHashMap<String, ArrayList<Map<String, String>>>();

		for (String sheet : getPagesToBeExecuted(m)) {
			sheetMap.put(sheet, getTestData(sheet, m)); // SheetName, [<field,value>]
		}
		
		return sheetMap;
	}

	/**
	 * @param sheetName
	 * @param testCaseID
	 * @return
	 */
	public static ArrayList<Map<String, String>> getTestData(String sheetName, Method m) {
		
		String testCaseID = m.getName();
		Map<String, String> data_Map = null;
		ArrayList<Map<String, String>> dataMap_List = new ArrayList<Map<String, String>>();
		int rows = getRowCount(sheetName);
		int cols = getColumnCount(sheetName);
		
		for (int colNum = 2; colNum < cols; colNum++) {
			if (getCellData(sheetName, 0, colNum).equalsIgnoreCase(testCaseID)) {
						data_Map = new LinkedHashMap<String, String>();
						for (int rowNum = 1; rowNum < rows; rowNum++) {
							data_Map.put(getCellData(sheetName, rowNum, 1), getCellData(sheetName, rowNum, colNum));
						}
						dataMap_List.add(data_Map);
					}
			}
		
		return dataMap_List;
	}

	public static int getNumberOfIterations(Method m) {
		
		int count=0;
		ArrayList<String> pages = getPagesToBeExecuted(m);
		String sheetName = pages.get(0);
		int cols = getColumnCount(sheetName);
		
		for(int col=2; col<cols; col++) {
			if(getCellData(sheetName, 0, col).equalsIgnoreCase(m.getName())){
				count++;
			}
		}
		
		return count;
	}
	
	public static ArrayList<String> getPagesToBeExecuted(Method m) {
		
		int rows=getRowCount("RunModes");
		int cols = getSheetNames().size();
		ArrayList<String> pages = new ArrayList<String>();
		
		for(int row=1; row<rows; row++) {
			if(getCellData("RunModes", row, 1).equalsIgnoreCase(m.getName())) {
				for(int col=2; col<cols; col++) {
					String page = getCellData("RunModes", row, col);
					if(page != null && page != "" && !page.isEmpty()) {
						pages.add(page);
					}
				}
			}
		}
		
		return pages;
	}
	
}
