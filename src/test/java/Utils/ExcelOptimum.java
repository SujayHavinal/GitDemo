package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOptimum {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ExcelOptimum(String excelPath, String sheetName)
	{
		try {

			workbook= new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetName);
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}

	public void getRowCount() {

		try {

			int rows=sheet.getPhysicalNumberOfRows();
			System.out.println(rows);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.fillInStackTrace(); 
		}
	}
	
	public void getColCount() {

		try {

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

	public void getCelldataString(int rowNum,int colNum)
	{
		try {

			String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.fillInStackTrace(); 
		}
	}

	public void getCelldataNumber(int rowNum,int colNum)
	{
		try {

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
