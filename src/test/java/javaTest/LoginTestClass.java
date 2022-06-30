package javaTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.Xls_Reader;
import javaPageclass.DashboardPageClass;
import javaPageclass.LoginPageClass;
import javaPageclass.MainPageObject;

@Listeners(Utilities.ExtentListenerClass.class)   

public class LoginTestClass extends BaseClass {
	
	
	@Test(priority=1)
	public void Login() throws InterruptedException, IOException {
		
		driver.get(url);
		logger.info("Url Entered");
		driver.manage().deleteAllCookies();
		logger.info("All Cookies deleted");
		driver.manage().window().maximize();
		logger.info("Window Maximized");
		
		MainPageObject m=new MainPageObject(driver);
		m.clickonLogINbtn();
		logger.info("Click on Login button");
		
		Thread.sleep(3000);
		
		 LoginPageClass lp=new LoginPageClass(driver);		 	 

				lp.entercred("shubhamshedge810@gmail.com","AdminShubham@123");
				logger.info("Enter Credentials");

				lp.btnClick();
				logger.info("Clicked on button");

				Thread.sleep(1000);
				
				DashboardPageClass dd=new DashboardPageClass(driver);
				dd.ClickOnLogOutbtn();
				logger.info("Clicked on Logout button");

				Thread.sleep(10000);
				


	}
	
	
//	@DataProvider(name = "dataPro")
//	public Object[][] mainData() throws IOException {
//
//		String filename = "C:\\Users\\Unique Web System\\eclipse-workspace\\PageObjectModel\\src\\test\\resources\\ddf.xlsx";
//		Object[][] search = getExcelData(filename, "Sheet1");
//
////		Object[][] search=new Object[2][1];
////		search[0][0]="Taj Mahal";
////		search[1][0]="India Gate";
//
//		return search;
//	}
//
//	public String[][] getExcelData(String fileName, String sheetname) throws IOException {
//
//		String[][] data = null;
//
//		FileInputStream inputStream = new FileInputStream(fileName);
//
//		Workbook workbook = new XSSFWorkbook(inputStream);
//
//		Sheet sheet = workbook.getSheet("Sheet1");
//
//		int ttr = sheet.getLastRowNum() + 1;
//		int ttc = sheet.getRow(0).getLastCellNum();
//
//		data = new String[ttr - 1][ttc];
//
//		for (int currentRow = 1; currentRow < ttr; currentRow++) {
//
//			for (int currentCell = 0; currentCell < ttc; currentCell++) {
//
//				data[currentRow - 1][currentCell] = sheet.getRow(currentRow).getCell(currentCell).toString();
//
//			}
//		}
//
//		workbook.close();
//
//		return data;
//
//	}
//	
//	
//	
//	

	
}
