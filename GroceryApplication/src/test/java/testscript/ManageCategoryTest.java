package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base{
	public HomePage homepage;
	public  ManageCategoryPage managecategorypage;
@Test(groups="regression",description="validating wheather the user is able to access and create new category in managecategorypage",retryAnalyzer=retry.Retry.class)
public void verifyTheUserIsAbleToAccessAddCategoryPage() throws IOException, AWTException
{
	String username=ExcelUtility.readStringData(1,0,"LoginPage");
	String password=ExcelUtility.readStringData(1,1,"LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username).enterThePassword(password);
	//loginpage.enterThePassword(password);
	homepage=loginpage.clickOnSignInButton();

   // String categoryname=ExcelUtility.readStringData(1, 0, "Managecategory"); 
   // ManageCategoryPage managecategorypage=new ManageCategoryPage(driver);
   FakerUtility fakerutility=new FakerUtility();
   String categoryname=fakerutility.createRandomFirstName();
    managecategorypage=homepage.manageCategoryMoreInfo();
    managecategorypage.newButton().category(categoryname).discountOption().chooseFile().saveButton();
//    managecategorypage.category(categoryname);
//    managecategorypage.discountOption();
//    managecategorypage.chooseFile();
//    managecategorypage.saveButton();

    Boolean alertmessage=managecategorypage.alertMessageIsDisplayed();
    Assert.assertTrue(alertmessage,Constant.MANAGECATEGORY);
    
    
}
	
}
