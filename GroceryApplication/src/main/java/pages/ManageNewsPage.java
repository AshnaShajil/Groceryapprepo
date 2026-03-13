package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	@FindBy(xpath="(//a[contains(@class,'small-box-footer')])[7]")WebElement moreinfo;
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
	public void clickTheMoreInfo() 
	{
		moreinfo.click();
	}
	public void clickNewButton()
	{
		
		newoption.click();
	}
	public void textInTheNewsField(String news) 
	{
		
		enterthenews.sendKeys(news);
	}
	public void ClickSaveButton() 
	{
		
		save.click();
	}
	public Boolean alertIsDisplayed() 
	{
		return alert.isDisplayed();
    }

}
