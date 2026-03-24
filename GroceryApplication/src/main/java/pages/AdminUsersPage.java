package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUsersPage 
{
	
//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and @class='small-box-footer']")WebElement adminusersmoreinfo;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger'and @onclick='click_button(1)']")WebElement adminusersnew;
@FindBy(xpath="//input[@id='username']")WebElement adminusername;
@FindBy(xpath="//input[@id='password']")WebElement adminpassword;
@FindBy(xpath="//select[@class='form-control'and @name='user_type']")WebElement usertypedropdown;
@FindBy(xpath="//button[@type='submit'and @name='Create']")WebElement save;
@FindBy(xpath="//div[contains(@class,'alert-success')]")WebElement adminalert;
@FindBy(xpath="(//a[text()='Reset'])[2]")WebElement adminreset;
public WebDriver driver;
public AdminUsersPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//public void adminUsersMoreInfo() 
//{
//	usermoreinfo.click();
//}
public AdminUsersPage adminUserNew()
{
	adminusersnew.click();
	return this;
}
public AdminUsersPage adminUserName(String newadminusername)
{
	adminusername.sendKeys(newadminusername);
	return this;
}
public  AdminUsersPage adminPassword(String newadminpassword)
{
	adminpassword.sendKeys(newadminpassword);
	return this;
}
public AdminUsersPage userTypeDropdown()
{
	PageUtility pageutility=new PageUtility();
	pageutility.dropdownValue(usertypedropdown, "admin");
	return this;
}
public AdminUsersPage save() 
{
	save.click();
	return this;
}
public AdminUsersPage adminReset() 
{
	adminreset.click();
	return this;
}
public boolean adminAlertIsDisplayed()
{
	return adminalert.isDisplayed();

}

}
