package test.cases.execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.object.model.google.GmailHomePage;
import page.object.model.google.GmailSignInPage;
import page.object.model.google.PageObjectModelForGoogle;
import page.object.model.google.PasswordPage;

public class GmailSignInTest {
	WebDriver driver;
	
	  @Test
	  public void imageSearchTest() throws InterruptedException {
		  driver.navigate().to("https://www.google.com");
		  
		  PageObjectModelForGoogle gmailLink = new PageObjectModelForGoogle(driver);
		  gmailLink.clickGmailLink();
		  
		  GmailHomePage clickOnSignInLink = new GmailHomePage(driver);
		  clickOnSignInLink.clickSignIn();
		  
		  GmailSignInPage performEnterUserNameAndClick = new GmailSignInPage(driver);
		  performEnterUserNameAndClick.enterUserName("vikrant1089@gmail.com");
		  performEnterUserNameAndClick.clickNextButton();
		  
		  PasswordPage performEnterPasswordAndClick = new PasswordPage(driver);
		  performEnterPasswordAndClick.Waiting();
		  performEnterPasswordAndClick.enterPassword("113456789");	  
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rishabh\\Desktop\\"
				+ "Selenium Class\\Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.quit();
	  }

}
