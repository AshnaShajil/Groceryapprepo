package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constant;
import utilities.ScreenShotUtility;
import utilities.WaitUtility;

public class Base {
	public WebDriver driver;
    public 	Properties properties;
    public FileInputStream fileinputstream;
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")

	 public void browserInitialization(String browser) throws Exception
	{
		try
		{
			properties=new Properties();
			fileinputstream=new FileInputStream(Constant.CONGIGFILE);
			properties.load(fileinputstream);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		if(browser.equalsIgnoreCase("chrome")) {
		
		
	    driver=new ChromeDriver();//open the chrome browser
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new Exception("Invalid");
		}
		//driver.get("https://groceryapp.uniqassosiates.com/admin");//opens the given url
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();//is used to maximize the window
		
	}
	@AfterMethod(alwaysRun=true)
	public void browserQuitAndClose(ITestResult iTestResult) throws IOException 
	 {
		if(iTestResult.getStatus()==iTestResult.FAILURE) 
		 {
			ScreenShotUtility screenshot=new ScreenShotUtility();
			screenshot.getScreenShot(driver, iTestResult.getName());
		}
		
		driver.quit();
	}
	
}
