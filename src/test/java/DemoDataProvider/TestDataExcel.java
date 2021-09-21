package DemoDataProvider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataExcel {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public TestDataExcel(String excelPath, String sheetName)
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

	public int  getRowCount() {
		int rows=0;
		try {

			rows=sheet.getPhysicalNumberOfRows();
		//	System.out.println(rows);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.fillInStackTrace(); 
		}
		return rows;
	}
	
	public int getColCount() {
		int col=0;
		try {

			col=sheet.getRow(0).getPhysicalNumberOfCells();
		//	System.out.println(col);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.fillInStackTrace(); 
		}
		return col;
	}

	public String getCelldataString(int rowNum,int colNum)
	{
		String cellData=null;
		try {

			cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//	System.out.println(cellData);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.fillInStackTrace(); 
		}
		return cellData;
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
