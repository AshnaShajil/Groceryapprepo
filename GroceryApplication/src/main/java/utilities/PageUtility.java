package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	//DROPDOWN
		
		public void dropdownVisibleText(WebElement element,String Text)
		{
			Select select=new Select(element);
			select.selectByVisibleText(Text);
		}
		
		public void dropdownIndex(WebElement element,Integer index)
		{
			Select select=new Select(element);
			select.selectByIndex(index);
		}
		
		public void dropdownValue(WebElement element,String Text)
		{
			Select select=new Select(element);
			select.selectByValue(Text);
		}
		//ACTIONS
		public void actionDragDrop(WebDriver driver,WebElement dragelement,WebElement dropelement)
		{
			Actions actions=new Actions(driver);
			actions.dragAndDrop(dragelement, dropelement).perform();
		}
		
		public void actionContextClick(WebDriver driver,WebElement element) 
		{
			Actions actions=new Actions(driver);
			actions.contextClick(element).perform();
		}
		public void actionMouseOver(WebDriver driver,WebElement element) 
		{
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
		}
		public void actiondoubleclick(WebDriver driver,WebElement element) 
		{
			Actions actions=new Actions(driver);
			actions.doubleClick(element).perform();
		}
		public void actionClick(WebDriver driver,WebElement element) 
		{
			Actions actions=new Actions(driver);
			actions.click(element).perform();
		}
		//ALERT
		
		public void alertSendKeys(WebDriver driver,String text) 
		{
			Alert alert=driver.switchTo().alert();
			alert.sendKeys(text);
		}
		public void alertAccept(WebDriver driver) 
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		public void alertDismiss(WebDriver driver) 
		{
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}
		//JAVAsCRIPTEXECUTOR
		public void javaScriptExecuteSendKey(WebDriver driver,WebElement elementname,String value)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='value';",  elementname);
		}
		public void javaScriptExecuteClick(WebDriver driver,WebElement elementname) 
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",  elementname);
		}
		//PAGESCROLL
		public void pageScrollUpToDown(WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(x,y)","");
		}
		public void pageScrollDownToUp(WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(x,-y)","");
		}
		public void pageScrollUpToDownEnd(WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		}
}
