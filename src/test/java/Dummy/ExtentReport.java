package Dummy;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReport {
	ExtentReports report;
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		String path=System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
		spark.config().setReportName("Demo Test Report");
		spark.config().setDocumentTitle("Test Results");
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Tester", "Sujay");
	}
	
	@BeforeTest
	public void setConfig()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sujay\\Automation Testing\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void test1()
	{
		ExtentTest test=report.createTest("MyFirstTest","Entering Java in google");
		test.info("This is the first testcase");
		
		driver.get("https://www.google.com/");
		test.log(Status.PASS, "Enter the URL");
		
		driver.findElement(By.name("q")).sendKeys("Java");
		test.pass("Enter the Java in searchoption");
		
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		test.fail("Click on Gmail link");
		
		
	}
	
	@Test
	public void test2()
	{
		ExtentTest test=report.createTest("MySecondTest","Entering Selenium in google");
		test.info("This is the second testcase");
		
		driver.get("https://www.google.com/");
		test.log(Status.PASS, "Enter the URL for second tc");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		test.pass("Enter the Selenium in searchoption");
		
		test.skip("This is skipped");
	}
	
	@AfterTest
	public void finish()
	{
		driver.close();
		
	}
	
	@AfterSuite
	public void close()
	{
		report.flush();
	}
}
