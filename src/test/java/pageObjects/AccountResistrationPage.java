package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountResistrationPage extends BasePage {
	
	WebDriver driver;

	public AccountResistrationPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	
@FindBy(xpath="//input[@id='input-firstname']")  
WebElement txtfirstName;
@FindBy(xpath="//input[@id='input-lastname']")  
WebElement txtlastName;
@FindBy(xpath="//input[@id='input-email']")  
WebElement txtEMail;
@FindBy(xpath="//input[@id='input-password']")  
WebElement txtpassword;
@FindBy(xpath="//input[@name='agree']")  
WebElement chkdpolicy;
@FindBy(xpath="//button[normalize-space()='Continue']")  
WebElement btncontinue;


@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") 
WebElement confmsg;
	
	public void setFirstName(String fname)
	{
		txtfirstName.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtlastName.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEMail.sendKeys(email);
	}
	public void setpassword(String pwd) throws InterruptedException
	{
		txtpassword.sendKeys(pwd);
		Thread.sleep(3000);
	}
	public void setprivacypolicy()
	{
		chkdpolicy.submit();
		
		
	}
	public void clickcontinue()
	{
		btncontinue.submit();
		
		
	}
	
	public String getconfirmationmessage() {
		
		try {
			return(confmsg.getText());
		}
		catch(Exception e)
		{
		return(e.getMessage())	;
		}
		
	}
	
}
