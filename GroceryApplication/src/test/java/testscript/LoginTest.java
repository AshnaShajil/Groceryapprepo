package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	public HomePage homepage;
	@Test(groups="regression",retryAnalyzer=retry.Retry.class,description="validating wheather the user is able to login and directed to homepage using valid credentials")
	public void verifyTheUserIsAbleToLoginWithValidCredentials() throws IOException 
	{
		//String username="admin";
		//String password="admin";
		String username=ExcelUtility.readStringData(1,0,"LoginPage");
		String password=ExcelUtility.readStringData(1,1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		//loginpage.clickOnSignInButton();
		homepage=loginpage.clickOnSignInButton();
		
		Boolean homepage=loginpage.isDashboardDisplayed();
		Assert.assertTrue(homepage,Constant.LOGINWITHVALIDPASSWORDVALIDUSERNAME);//hard asseration
	}
	@Test(description="validating wheather the user is not able to login and not directed to homepage using invalid password")
	public void verifyTheUserIsAbleToLoginWithInValidPasswordAndValidUsername() throws IOException 
	{
		//String username="admin";
		//String password="admin123";
		String username=ExcelUtility.readStringData(2, 0, "LoginPage");
		String password=ExcelUtility.readStringData(2, 1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		
		Boolean page=loginpage.isAlertDisplayed();
		Assert.assertTrue(page,Constant.LOGINWITHINVALIDPASSWORD);//message appears only if testcase fails
    }
	@Test(description="validating wheather the user is not able to login and not directed to homepage using invalid username")
	public void verifyTheUserIsAbleToLoginWithValidPasswordAndInValidUsername() throws IOException 
	{
		//String username="adminsss";
		//String password="admin";
		String username=ExcelUtility.readStringData(3, 0, "LoginPage");
		String password=ExcelUtility.readStringData(3, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		
		homepage=loginpage.clickOnSignInButton();
		
		Boolean page=loginpage.isAlertDisplayed();
		Assert.assertTrue(page,Constant.LOGINWITHINVALIDUSERNAME);
	}
	@Test(description="validating wheather the user is not able to login and not directed to homepage using invalid credentials")
	public void verifyTheUserIsAbleToLoginWithInValidPasswordAndInValidUsername() throws IOException 
	{
		//String username="adminsss1";
		//String password="567admin";
		String username=ExcelUtility.readStringData(4, 0, "LoginPage");
		String password=ExcelUtility.readStringData(4, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
	
		Boolean page=loginpage.isAlertDisplayed();
		Assert.assertTrue(page,Constant.LOGINWITHINVALIDUSERNAMEANDINVALIDPASSWORD);
	}
}
