package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="username")WebElement usernamefield;
	@FindBy(name="password")WebElement passwordfield;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")WebElement signinbutton;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement Dashboard;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement alert;
	//@FindBy(xpath="//div[contains(@class,'alert-dismissible')")WebElement dropdown;
	//@FindBy(xpath="//div[contains(@class,'alert-dismissible')")WebElement drag;
	//@FindBy(xpath="//div[contains(@class,'alert-dismissible')")WebElement drop;
	public WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	public LoginPage enterTheUsername(String username)
	{
		usernamefield.sendKeys(username);
		return this;
	}
	public LoginPage enterThePassword(String password)
	{
		passwordfield.sendKeys(password);
		return this;
	}
	public HomePage clickOnSignInButton()
	{
		signinbutton.click();
		return new HomePage(driver); 
	}
	//public void  dropDown()
	//{
//		PageUtility pageutility=new PageUtility();
//		pageutility.dropdownVisibleText(dropdown, "india");only for example
	//	
	//} 
	//public void actionClass() 
	//{
//		PageUtility pageutility=new PageUtility();
//		pageutility.actionDragDrop(driver, drag, drop);
	//}
	public boolean isDashboardDisplayed() //for validation
	{
		return Dashboard.isDisplayed();
	}
	public boolean isAlertDisplayed() 
	{
		return alert.isDisplayed();
	}
}
