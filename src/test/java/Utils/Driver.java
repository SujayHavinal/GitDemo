package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String path=System.getProperty("user.dir");
		ExcelOptimum opt=new ExcelOptimum(path+"/excel/data.xlsx","TestData");
		opt.getRowCount();
		opt.getColCount();
		opt.getCelldataString(0, 0);
		opt.getCelldataNumber(2, 1);
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}

}
