package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//a[@class='nav-link'and @data-toggle='dropdown']")WebElement admin;
@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'])[1]")WebElement logout;
@FindBy(xpath="//button[text()='Sign In']")WebElement signin;

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and @class='small-box-footer']")WebElement adminusersmoreinfo;
@FindBy(xpath="(//a[contains(@class,'small-box-footer')])[7]")WebElement managenewsmoreinfo;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'and @class='small-box-footer']")WebElement managecategorymoreinfo  ;
@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact'])[2]")WebElement managecontactmoreinfo;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext'and @class='small-box-footer']")WebElement managefootermoreinfo;




public WebDriver driver;
public HomePage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}




public AdminUsersPage adminUsersMoreInfo() 
{
	adminusersmoreinfo.click();
	return new AdminUsersPage(driver);
}

public ManageNewsPage manageNewsMoreInfo() 
{
	managenewsmoreinfo.click();
	return new ManageNewsPage(driver);
}
public ManageCategoryPage manageCategoryMoreInfo()
{
	managecategorymoreinfo.click();
	return new ManageCategoryPage(driver);
}
public ManageContactPages manageContactMoreInfo()
{
	managecontactmoreinfo.click();
	return new ManageContactPages(driver);
}
public ManageFooterPage manageFooterMoreInfo()
{
	managefootermoreinfo.click();
	return new ManageFooterPage(driver);
}















public void adminClick()
{
	admin.click();
}
public void logOutClick()
{
	logout.click();
}
public boolean signinIsDisplayed()
{
	return signin.isDisplayed();
}







}
