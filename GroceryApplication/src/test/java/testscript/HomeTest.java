package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	
	@Test(description="validating wheather the user is able to logout and directed to loginpage")
public void verifyTheUserIsAbleToLogout() throws IOException 
{
	String username=ExcelUtility.readStringData(1,0,"LoginPage");
	String password=ExcelUtility.readStringData(1,1,"LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickOnSignInButton();
	
	HomePage logoutpage=new HomePage(driver);
	logoutpage.adminClick();
	logoutpage.logOutClick();
	Boolean check=logoutpage.signinIsDisplayed();
	Assert.assertTrue(check,Constant.LOGOUT);
	
	
	
}
}
