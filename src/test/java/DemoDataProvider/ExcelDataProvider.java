package DemoDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	@Test(dataProvider="testcase1")
	public void inputs(String UserName, String Password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Sujay\\Automation Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/BankStaffDevelop/(S(ua12ff4pqavmovfj0i3ndeav))/UserLogin.aspx");
		driver.findElement(By.id("ctl00_content_login_UserName")).sendKeys(UserName);
		driver.findElement(By.id("ctl00_content_login_Password")).sendKeys(Password);
		
		Thread.sleep(4000);
		//	System.out.println(UserName);
		//	System.out.println(Password);
	}

	@DataProvider(name="testcase1")
	public Object[][] testValues()
	{
		String path=System.getProperty("user.dir");
		String actualPath=path+"/excel/DataProvider.xlsx";
		Object data[][]=testData(actualPath,"Sheet1");
		return data;
	}

	public static Object[][] testData(String excelPath, String sheetName) {

		TestDataExcel testData=new TestDataExcel(excelPath, sheetName);
		int rows=testData.getRowCount();
		int cols=testData.getColCount();
		//	System.out.println(rows);
		//	System.out.println(cols);
		String cellValue=null;
		Object values[][]=new Object[rows-1][cols];
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				cellValue=testData.getCelldataString(i, j);
				//	System.out.println(cellValue);

				values[i-1][j]=cellValue;
			}
		}

		return values;
	}

}
