package transcript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	   @BeforeMethod
		public void browserInitialization() {
			driver = new ChromeDriver();// open the chrome browser
			driver.get("https://groceryapp.uniqassosiates.com/admin");// opens the given url
			driver.manage().window().maximize();// is used to maximize the window
		}
	@AfterMethod
		void browserquit() {
			// driver.close();//to close the current browser window
			driver.quit();// to close all broswed window

		}
}
