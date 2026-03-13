package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUsersPage 
{
	
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and @class='small-box-footer']")WebElement usermoreinfo;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger'and @onclick='click_button(1)']")WebElement adminusersnew;
@FindBy(xpath="//input[@id='username']")WebElement adminusername;
@FindBy(xpath="//input[@id='password']")WebElement adminpassword;
@FindBy(xpath="//select[@class='form-control'and @name='user_type']")WebElement usertypedropdown;
@FindBy(xpath="//button[@type='submit'and @name='Create']")WebElement save;
@FindBy(xpath="//button[@type='button']//parent::div[@class='alert alert-success alert-dismissible']")WebElement adminalert;
@FindBy(xpath="(//a[text()='Reset'])[2]")WebElement adminreset;
public WebDriver driver;
public AdminUsersPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void userMoreInfo() 
{
	usermoreinfo.click();
}
public void adminUserNew()
{
	adminusersnew.click();
}
public void adminUserName(String newadminusername)
{
	adminusername.sendKeys(newadminusername);
}
public void adminPassword(String newadminpassword)
{
	adminpassword.sendKeys(newadminpassword);
}
public void userTypeDropdown()
{
	PageUtility pageutility=new PageUtility();
	pageutility.dropdownValue(usertypedropdown, "admin");
}
public void save() 
{
	save.click();
}
public void adminReset() 
{
	adminreset.click();
}
public boolean adminAlertIsDisplayed()
{
	return adminalert.isDisplayed();

}

}
