package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getCelldataString();
		getCelldataNumber();
	}
	public static void getRowCount() {

		try {
			path=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(path+"/excel/data.xlsx");
			sheet=workbook.getSheet("TestData");
			int rows=sheet.getPhysicalNumberOfRows();
			System.out.println(rows);
			sheet.getRow(1).getCell(12).getColumnIndex();
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.fillInStackTrace(); 
		}
	}
	public static void getColCount() {

		try {
			path=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(path+"/excel/data.xlsx");
			sheet=workbook.getSheet("TestData");
			int col=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(col);
			
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.fillInStackTrace(); 
		}
	}
	public static void getCelldataString()
	{
		try {
			path=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(path+"/excel/data.xlsx");
			sheet=workbook.getSheet("TestData");
			String cellData=sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.fillInStackTrace(); 
		}
	}
	
	public static void getCelldataNumber()
	{
		try {
			path=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(path+"/excel/data.xlsx");
			sheet=workbook.getSheet("TestData");
			double cellData=sheet.getRow(2).getCell(1).getNumericCellValue();
			System.out.println(cellData);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.fillInStackTrace(); 
		}
	}

}
