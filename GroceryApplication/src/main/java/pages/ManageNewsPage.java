package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsPage {
	//@FindBy(xpath="(//a[contains(@class,'small-box-footer')])[7]")WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")WebElement newoption;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement enterthenews;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//div[contains(@class,' alert-success')]")WebElement alert;
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
//	public void manageNewsMoreInfo() 
//	{
//		managenewsmoreinfo.click();
//	}
	public ManageNewsPage clickNewButton()
	{
		
		newoption.click();
		return this;
	}
	public ManageNewsPage textInTheNewsField(String news) 
	{
		
		enterthenews.sendKeys(news);
		return this;
	}
	public ManageNewsPage ClickSaveButton() 
	{
		//WaitUtility waitutility=new WaitUtility();
		//waitutility.waitForElementToBeClickable(driver, save);
		save.click();
		return this;
	}
	public Boolean alertIsDisplayed() 
	{
		return alert.isDisplayed();
    }

}
