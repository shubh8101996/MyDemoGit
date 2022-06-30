package javaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.ReadExcelFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import javaPageclass.DashboardPageClass;
import javaPageclass.LoginPageClass;
import javaPageclass.MainPageObject;




     
@Listeners(Utilities.ExtentListenerClass.class)   
public class LoginTestClassWithMultipleData extends BaseClass {
	
	@Test(priority=1,dataProvider = "LoginDataProvider")
	public void Login(String username,String password) throws InterruptedException, IOException {
		
		driver.get(url);
		driver.manage().deleteAllCookies();
		
		MainPageObject m=new MainPageObject(driver);
		m.clickonLogINbtn();
		
		Thread.sleep(3000);
		
		 LoginPageClass lp=new LoginPageClass(driver);		 	 

		    lp.entercred(username,password);
			logger.info("Enter Credentials");

			lp.btnClick();
			logger.info("Clicked on button");

			Thread.sleep(1000);
			
			DashboardPageClass dd=new DashboardPageClass(driver);
			dd.ClickOnLogOutbtn();
			logger.info("Clicked on Logout button");



	}
	
	
	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		//System.out.println(System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir") + "\\TestData\\TestMultipleData.xlsx";


		int ttlRows = ReadExcelFile.getRowCount(fileName, "Sheet1");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "Sheet1");
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"Sheet1", i,j);
			}

		}
		return data;
	}
	
	

}
