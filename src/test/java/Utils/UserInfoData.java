package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserInfoData {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		String path = System.getProperty("user.dir");
		XSSFWorkbook workbook=new XSSFWorkbook(path+"/excel/data.xlsx");
		XSSFSheet sheet=workbook.getSheet("TestData");
		
		UserInfoOptimum user=new UserInfoOptimum(workbook,sheet);
		user.getUserinfo("Sujay");
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}

}
