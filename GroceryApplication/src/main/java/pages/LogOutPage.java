package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
@FindBy(xpath="//a[@class='nav-link'and @data-toggle='dropdown']")WebElement admin;
@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'])[1]")WebElement logout;
@FindBy(xpath="//button[text()='Sign In']")WebElement signin;





public WebDriver driver;
public LogOutPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
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
