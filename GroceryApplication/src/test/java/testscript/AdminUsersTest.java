package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base{
public HomePage homepage;
public AdminUsersPage adminuserspage;
	@Test(groups="regression",description="validating a user is able to access and create new admins in adminusers page",retryAnalyzer=retry.Retry.class)
	public void verifyTheUserIsAbleToCreateNewAdmin() throws IOException 
	{
		String username=ExcelUtility.readStringData(1,0,"LoginPage");
		String password=ExcelUtility.readStringData(1,1,"LoginPage");
		
		//String newadminusername=ExcelUtility.readStringData(1, 0, "Adminusers");to read from excel
		//String newadminpassword=ExcelUtility.readStringData(1,1,"Adminusers");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		
		//AdminUsersPage adminuserspage=new AdminUsersPage(driver);
		
		FakerUtility fakerutility=new FakerUtility();//to read data from fakerutility
		String newadminusername=fakerutility.createRandomFirstName();
		String newadminpassword=fakerutility.createRandomFirstName();//automatically new data created randomly
		
		adminuserspage=homepage.adminUsersMoreInfo();
		
		adminuserspage.adminUserNew().adminUserName(newadminusername).adminPassword(newadminpassword).userTypeDropdown().save();
//		adminuserspage.adminUserName(newadminusername);
//		adminuserspage.adminPassword(newadminpassword);
//		adminuserspage.userTypeDropdown();
//		adminuserspage.save();
		Boolean adminalert=adminuserspage.adminAlertIsDisplayed();
		Assert.assertTrue(adminalert,Constant.ADMINUSERSPAGE);
		
	}
}
