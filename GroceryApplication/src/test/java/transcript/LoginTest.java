package transcript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

import utilities.ExcelUtility;

public class LoginTest extends Base{
	
		@Test(groups="regression")
		public void verifyTheUserIsAbleToLoginWithValidCredentials() throws IOException 
		{
			//String username="admin";
			//String password="admin";
			String username=ExcelUtility.readStringData(1,0,"LoginPage");
			String password=ExcelUtility.readStringData(1,1,"LoginPage");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterTheUsername(username);
			loginpage.enterThePassword(password);
			loginpage.clickOnSignInButton();
			Boolean homepage=loginpage.isDashboardDisplayed();
			Assert.assertTrue(homepage);//hard asseration
		}
		@Test
		public void verifyTheUserIsAbleToLoginWithInValidPasswordAndValidUsername() throws IOException 
		{
			//String username="admin";
			//String password="admin123";
			String username=ExcelUtility.readStringData(2, 0, "LoginPage");
			String password=ExcelUtility.readStringData(2, 1, "LoginPage");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterTheUsername(username);
			loginpage.enterThePassword(password);
			loginpage.clickOnSignInButton();
			Boolean page=loginpage.isAlertDisplayed();
			Assert.assertTrue(page);
	    }
		@Test
		public void verifyTheUserIsAbleToLoginWithValidPasswordAndInValidUsername() throws IOException 
		{
			//String username="adminsss";
			//String password="admin";
			String username=ExcelUtility.readStringData(3, 0, "LoginPage");
			String password=ExcelUtility.readStringData(3, 1, "LoginPage");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterTheUsername(username);
			loginpage.enterThePassword(password);
			loginpage.clickOnSignInButton();
			
		}
		@Test
		public void verifyTheUserIsAbleToLoginWithInValidPasswordAndInValidUsername() throws IOException 
		{
			//String username="adminsss1";
			//String password="567admin";
			String username=ExcelUtility.readStringData(4, 0, "LoginPage");
			String password=ExcelUtility.readStringData(4, 1, "LoginPage");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterTheUsername(username);
			loginpage.enterThePassword(password);
			loginpage.clickOnSignInButton();
		
		}
		
}
