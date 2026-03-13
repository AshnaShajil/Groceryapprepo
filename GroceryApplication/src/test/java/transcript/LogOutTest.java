package transcript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LogOutTest extends Base {
	
	@Test
public void verifyTheUserIsAbleToLogout() throws IOException 
{
	String username=ExcelUtility.readStringData(1,0,"LoginPage");
	String password=ExcelUtility.readStringData(1,1,"LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickOnSignInButton();
	
	LogOutPage logoutpage=new LogOutPage(driver);
	logoutpage.adminClick();
	logoutpage.logOutClick();
	Boolean check=logoutpage.signinIsDisplayed();
	Assert.assertTrue(check);
	
	
	
}
}
