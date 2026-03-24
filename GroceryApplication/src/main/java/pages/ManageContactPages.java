package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPages {
//@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact'])[2]")WebElement managecontactmoreinfo;
@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss'and @role='button']")WebElement editbutton;
@FindBy(xpath="//textarea[@placeholder='Enter the Address']")WebElement address;
@FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']")WebElement deliverytime;
@FindBy(xpath="//button[@type='submit'and @name='Update']")WebElement updatebutton;
@FindBy(xpath="//div[contains(@class,' alert-success alert-dismissible')]")WebElement contactupdatedalert;


public WebDriver driver;
public ManageContactPages(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//public void manageContactMoreInfo()
//{
//	managecontactmoreinfo.click();
//}
public ManageContactPages editButton()
{
	editbutton.click();
	return this;
}
public ManageContactPages enterAddress(String updateaddres)
{
	address.clear();
	address.sendKeys(updateaddres);
	return this;
}
public ManageContactPages enterDeliveryTime(String updatedeliverytime)
{
	deliverytime.clear();
	deliverytime.sendKeys(updatedeliverytime);
	return this;
}
public ManageContactPages updateButton()
{
	//updatebutton.click();
	PageUtility pageutility=new PageUtility();
	pageutility.javaScriptExecuteClick(driver, updatebutton);
	return this;
}
public boolean isContactUpdatedAlertDisplayed()
{
	return contactupdatedalert.isDisplayed();
}


}
