package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {
//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext'and @class='small-box-footer']")WebElement managefootermoreinfo;
@FindBy(xpath="(//i[@class='fas fa-edit'])[1]")WebElement updateicon;
@FindBy(xpath="//input[@name='email'and @id='email']")WebElement email;
@FindBy(xpath="//button[@name='Update'and @type='submit']")WebElement updatebutton;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
public WebDriver driver;
public ManageFooterPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//public void manageFooterMoreInfo()
//{
//	managefootermoreinfo.click();
//}
public ManageFooterPage updateIcon()
{
	updateicon.click();
	return this;
}
public ManageFooterPage enterEmail(String updatedemail)
{
	email.clear();
	email.sendKeys(updatedemail);
	return this;
}
public ManageFooterPage updateButton()
{
	updatebutton.click();
	return this;
}
public boolean isFooterTextAlertDisplayed()
{
	return alert.isDisplayed();
}
}
