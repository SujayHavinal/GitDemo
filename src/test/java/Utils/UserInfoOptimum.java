package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserInfoOptimum {
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	UserInfoOptimum(XSSFWorkbook workbook , XSSFSheet sheet)
	{
		this.sheet=sheet;
		this.workbook=workbook;
	}
	public void getUserinfo(String staffName) {

		int rowCount=sheet.getPhysicalNumberOfRows();
		int rowNum=0;
		boolean flag=true;
		int col=0;

		// Getting total number of columns in sheet (condition in between no cell should be blank)
		while(flag)
		{
			try {
				CellType type=sheet.getRow(0).getCell(col).getCellType();

			}
			catch(Exception exp)
			{
				flag=false;
			}
			col++;
		}

		// Another way to get total number of columns in sheet (no condition applies)

		int cellLastNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellLastNum);

		// Getting then number of row where required Person details are there
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<(col-1);j++)
			{
				try {
					String cellVal=sheet.getRow(i).getCell(j).getStringCellValue();
					if(cellVal.equalsIgnoreCase(staffName))
					{
						rowNum=i;
						break;
					}
				}
				catch(Exception exp)
				{

				}

			}

		}

		// Printing details for the required staff

		for(int i=0;i<(col-1);i++)
		{
			try {
				String cellVal=sheet.getRow(rowNum).getCell(i).getStringCellValue();
				System.out.println(cellVal);
			}
			catch(Exception exp)
			{
				double cellVal=sheet.getRow(rowNum).getCell(i).getNumericCellValue();
				System.out.println(cellVal);
			}
		}
		System.out.println(rowNum); // Row number where required staff details is present
	}
}
