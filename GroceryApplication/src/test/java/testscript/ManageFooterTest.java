package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;

public class ManageFooterTest extends Base{
	public HomePage homepage;
	public ManageFooterPage managefooterpage;
	@Test(groups="regression",description="validating wheather the user is able to access and create new category in managefooter page")
public void verifyTheUserIsAbleToUpdateManageFooterText() throws IOException
{
	    String username=ExcelUtility.readStringData(1,0,"LoginPage");
		String password=ExcelUtility.readStringData(1,1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();

		String updatedemail=ExcelUtility.readStringData(1, 1, "ManageFooterText");
		//ManageFooterPage managefooter=new ManageFooterPage(driver);
		managefooterpage=homepage.manageFooterMoreInfo();
		
	    managefooterpage.updateIcon().enterEmail(updatedemail).updateButton();
//	     managefooter.enterEmail(updatedemail);
//        managefooter.updateButton();
        Boolean alert=managefooterpage.isFooterTextAlertDisplayed();
        Assert.assertTrue(alert,Constant.MANAGEFOOTER);

}
}
