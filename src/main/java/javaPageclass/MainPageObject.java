package javaPageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageObject {

	public WebDriver driver;
	
	 public MainPageObject(WebDriver driver){     //initilization

			this.driver=driver;
			PageFactory.initElements(driver, this);

		}
	
	     @FindBy (id="w3loginbtn")
		private WebElement mainLoginbtn;
	
	    
	    public void clickonLogINbtn() {
	    	
	    	mainLoginbtn.click();
	    	
	    }

}
