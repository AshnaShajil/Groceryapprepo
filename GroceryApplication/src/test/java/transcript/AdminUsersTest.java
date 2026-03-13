package transcript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base{

	@Test
	public void verifyTheUserIsAbleToCreateNewAdmin() throws IOException 
	{
		String username=ExcelUtility.readStringData(1,0,"LoginPage");
		String password=ExcelUtility.readStringData(1,1,"LoginPage");
		
		String newadminusername=ExcelUtility.readStringData(1, 0, "Adminusers");
		String newadminpassword=ExcelUtility.readStringData(1,1,"Adminusers");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignInButton();
		
		AdminUsersPage adminuserspage=new AdminUsersPage(driver);
		adminuserspage.userMoreInfo();
		adminuserspage.adminUserNew();
		adminuserspage.adminUserName(newadminusername);
		adminuserspage.adminPassword(newadminpassword);
		adminuserspage.userTypeDropdown();
		adminuserspage.save();
		Boolean adminalert=adminuserspage.adminAlertIsDisplayed();
		Assert.assertTrue(adminalert);
		
	}
}
