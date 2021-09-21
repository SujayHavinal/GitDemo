package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Methods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		XSSFWorkbook workbook=new XSSFWorkbook(path+"/excel/data.xlsx");
		XSSFSheet sheet=workbook.getSheet("TestData");
		CellType type=sheet.getRow(2).getCell(3).getCellType();
		System.out.println(type); // Output like String or Numeric

		int cellLastNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellLastNum); // It will give number for zero row's last cell number indirectly it will give total column number
		

		int cellFirstNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellFirstNum); // It will give number for zero row's first cell number indirectly it will also give total 
										  // number of columns same as "getLastCellNum()" method
		
	
	}

}
