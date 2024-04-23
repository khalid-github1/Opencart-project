package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountResistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc_001_AccountRegistrationTest  extends BaseClass
{
	@Test(groups= {"regression","master"})
	public void verify_account_registration()
	{
		logger.info("**** starting TC_001_AccountRegistrationTest  *****");
		
		logger.debug("application logs started......");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickmyAccount();
		logger.info("Clicked on MyAccount link");
		
		hp.clickResister();
		logger.info("Clicked on registration link");
		
		
		logger.info("Entering customer details.. ");
		AccountResistrationPage regpage=new AccountResistrationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		
		String password=randomAlphaNumeric();
		
		regpage.setpassword(password);
		
		regpage.setprivacypolicy();
		regpage.clickcontinue();
		Thread.sleep(3000);
		logger.info("clicked on continue..");
		
		String confmsg=regpage.getconfirmationmessage();
		
		logger.info("Validating expected message..");
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("test passed...");
			Assert.assertTrue(true);
		}
		else {
			logger.error("test failed....");
			Assert.fail();
		}
				
		}
		catch(Exception e)
		{
			logger.error("test failed..");			
			Assert.fail();
		}
		
		logger.debug("application logs end.......");
		logger.info("**** finished TC_001_AccountRegistrationTest  *****");
		
	}
	
	}




