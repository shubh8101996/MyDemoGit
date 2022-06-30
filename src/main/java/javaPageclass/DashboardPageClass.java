package javaPageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageClass {
	
	
	public  WebDriver driver;
	
	 public DashboardPageClass(WebDriver driver){     //initilization

			this.driver=driver;
			PageFactory.initElements(driver, this);

		}
	 
	 @FindBy(xpath = "//button[text()='Log out']")
	 WebElement logOut;
	 
	 
	 public void ClickOnLogOutbtn() {
		 
		 logOut.click();
	 }
	

	 
	 
	 
	 
}
