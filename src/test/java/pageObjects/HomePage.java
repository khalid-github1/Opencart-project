package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement MyAccount;
	
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement Resister;
	

	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']")  
	WebElement lnklogin;
	
	@FindBy(xpath="//input[@placeholder='Search']")  //For Search Product Test
	WebElement txtSearchbox;

	@FindBy(xpath="//div[@id='search']//button[@type='button']") //For Search Product Test
	WebElement btnSearch;

	
	
	public void clickmyAccount() 
	{
		MyAccount.click();
	}
	
	
	public void clickResister()
	{
		Resister.click();
	}
	
	public void clickLogin()
	{
		lnklogin.click();
	}
	
	public void enterProductName(String pName)   //For Search Product Test
	{
		txtSearchbox.sendKeys(pName);
	}

	public void clickSearch()  //For Search Product Test
	{
		btnSearch.click();
	}
	

}
