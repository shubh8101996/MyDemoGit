package javaPageclass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

     

public class LoginPageClass   {
	
	public  WebDriver driver;

	@FindBy (xpath="//input[@id='modalusername']")     //declaration
	private WebElement email;

	@FindBy (xpath="//input[@id='current-password']")
	private WebElement password;

	@FindBy (xpath="//a[text()='Forgot password?']")
	private WebElement forgotpass;

	
	@FindBy (xpath="//span[text()='Log in']")
	private WebElement LoginINbutton;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div[4]/div[1]/div/div[3]/div/text()")
	private WebElement failedMsg;
	

    public LoginPageClass(WebDriver driver){     //initilization

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


    public void getTitle() {

    	String actual="W3Schools Online Web Tutorials";
    	String Expected=driver.getTitle();
    	Assert.assertEquals(actual, Expected);


    }
    

 
	public void entercred(String username, String pass) {
		// TODO Auto-generated method stub
	 	email.sendKeys(username);
    	password.sendKeys(pass);
		
	}


    public void btnClick() {
    	LoginINbutton.click();

    }

    public void forgotpass() {

    	forgotpass.click();

    }

    public String FailedMsg() {
    	
    	String FailedMsg=failedMsg.getText();
    	
		return FailedMsg;
    	
    }
  














}
