package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	public HomePage homepage;
	public ManageNewsPage managenewspage;
	@Test(description="validating wheather the user is able to access and add news in managenews page")
	public void verifyTheUserIsAbleToAddNews() throws IOException 
	{
		String username=ExcelUtility.readStringData(1,0,"LoginPage");
		String password=ExcelUtility.readStringData(1,1,"LoginPage");
		String news=ExcelUtility.readStringData(0, 0, "Managenews");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		
		//ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage=homepage.manageNewsMoreInfo();
		managenewspage.clickNewButton().textInTheNewsField(news).ClickSaveButton();
//		managenewspage.textInTheNewsField(news);
//		managenewspage.ClickSaveButton();
		Boolean newsalert=managenewspage.alertIsDisplayed();
    	Assert.assertTrue(newsalert,Constant.MANAGENEWS);
	}
}
