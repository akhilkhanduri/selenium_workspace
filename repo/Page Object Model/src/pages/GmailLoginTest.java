package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLoginTest {
	
	WebDriver driver;
	GmailLogin objlogin;

	
	@BeforeTest
	  public void Invoke() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\"
				+ "Desktop\\SQT\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	  }
	
	@Test
	  public void GmailTest() throws InterruptedException {
		
		objlogin = new GmailLogin(driver);
		objlogin.SignIn("vikrant1089@gmail.com", "123456789");
		
		String textVerify = objlogin.TextVerify();
		Assert.assertEquals(textVerify, "Forgot password?");
		
		  }
	
	
  @AfterTest
  public void TearDown() {
	  driver.quit();
  }
}
