package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPages;
import utilities.ExcelUtility;

public class ManageContactTest extends Base
{
	public HomePage homepage;
	public ManageContactPages managecontactpages;
	@Test(groups="regression",description="validating wheather the user is able to update the details of managecontact page")
  public void verifyTheUserIsAbleToUpadteManageContact() throws IOException
  {
	    String username=ExcelUtility.readStringData(1,0,"LoginPage");
		String password=ExcelUtility.readStringData(1,1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		
		homepage=loginpage.clickOnSignInButton();
	    
		
		String updateaddres=ExcelUtility.readStringData(1, 2,"ManageContact");
		String updatedeliverytime=ExcelUtility.readIntegerData(1, 3,"ManageContact");
		
		//ManageContactPages managecontactpages=new ManageContactPages(driver);
	    managecontactpages=homepage.manageContactMoreInfo();
	    managecontactpages.editButton().enterAddress(updateaddres).enterDeliveryTime(updatedeliverytime).updateButton();
//	    managecontactpages.enterAddress(updateaddres);
//	    managecontactpages.enterDeliveryTime(updatedeliverytime);
//	    managecontactpages.updateButton();
	    Boolean alert=managecontactpages.isContactUpdatedAlertDisplayed();
	    Assert.assertTrue(alert,Constant.MANAGECONTACT);
  }
	
}

