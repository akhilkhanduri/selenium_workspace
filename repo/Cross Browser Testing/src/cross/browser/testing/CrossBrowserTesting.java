package cross.browser.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser)throws Exception {
		
	if(browser.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rishabh\\Desktop\\Selenium Class\\Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}else if(browser.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver","C:\\Users\\rishabh\\Desktop\\Selenium Class\\Browser Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}else if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishabh\\Desktop\\Selenium Class\\Browser Driver\\chromedriver.exe");
		driver = new InternetExplorerDriver();
	}else if(browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\rishabh\\Desktop\\Selenium Class\\Browser Driver\\MicrosoftWebDriver.exe");
		driver = new InternetExplorerDriver();		
	}else{
			throw new Exception("Browser is not Correct");
		}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	 @Test(dataProvider = "Authentication")
	  public void facebook(String username, String password) {
      driver.navigate().to("http://www.facebook.com");
	  driver.findElement(By.cssSelector("email")).sendKeys(username);
	  driver.findElement(By.cssSelector("pass")).sendKeys(password);
	  driver.findElement(By.xpath("//*[@value='Log In']")).click();
	  driver.quit();
	  }
	 
	@DataProvider(name = "Authentication")
	public Object[][] dataprovider() {
	return new Object[][]{
		{"testuser_1", "test@123"},
		{"testuser_2", "test@123"}, 
	    {"testuser_3", "test@123"}
	  };		    
	}	
}
