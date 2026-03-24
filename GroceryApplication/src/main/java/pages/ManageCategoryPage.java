package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {
//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'and @class='small-box-footer']")WebElement managecategorymoreinfo  ;
@FindBy(xpath="//a[@onclick='click_button(1)'and @href='https://groceryapp.uniqassosiates.com/admin/Category/add']")WebElement newbutton ;	
@FindBy(xpath="//input[@placeholder='Enter the Category']")WebElement category  ;	
@FindBy(xpath="(//span[text()='discount'])[1]")WebElement discount  ;	
@FindBy(xpath="//input[@type='file']")WebElement choosefile ;
@FindBy(xpath="//button[@type='submit'and @name='create']")WebElement savebutton  ;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
public 	WebDriver driver;
public ManageCategoryPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements( driver,this);
	
}
//public void manageCategoryMoreInfo()
//{
//	managecategorymoreinfo.click();
//}
public ManageCategoryPage newButton() 
{
	newbutton.click();
	return this;
}
public ManageCategoryPage category(String categoryname) 
{
	category.sendKeys(categoryname);
	return this;
}
public ManageCategoryPage discountOption()
{
	discount.click();
	return null;
}
public ManageCategoryPage chooseFile() throws AWTException
{
	 
	FileUploadUtility fileuploadutility=new FileUploadUtility();
    fileuploadutility.fileUploadUsingSendKeys(choosefile, "C:\\Users\\ASHNA\\Pictures\\Saved Pictures\\fernando-andrade-nAOZCYcLND8-unsplash.jpg");
	return this;
    
}
public ManageCategoryPage saveButton()
{
	
	
	PageUtility pageutility=new PageUtility();
	pageutility.pageScrollUpToDownEnd(driver);
	
	pageutility.javaScriptExecuteClick(driver, savebutton);
	return this;
	
}
public boolean alertMessageIsDisplayed() 
{
	return alert.isDisplayed();
}

}