package with.execute.pf;

import org.testng.annotations.Test;
import with.page.factory.EmailPage;
import with.page.factory.GoogleHomePage;
import with.page.factory.PasswordPage;
import with.pf.object.data.ObjectData;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GmailLoginExample {
	WebDriver driver;
	
	
  @Test
  public void GmailTest() throws InterruptedException {
	  
	  
		  GoogleHomePage oGoogleHomePage = new GoogleHomePage(driver);
		  oGoogleHomePage.SignIn();
		
		  EmailPage oEmailPage = new EmailPage(driver);
		  oEmailPage.EnterEmail(ObjectData.UserName);
		  
		  PasswordPage oPasswordPage = new PasswordPage(driver);
		  oPasswordPage.GmailLogin(ObjectData.Password);
		  
	  
  }
  @BeforeMethod
  public void InvokingApps() {
	
		System.setProperty(ObjectData.KeyValue, ObjectData.PathValue);
		  driver = new FirefoxDriver();
		  driver.navigate().to("http://www.google.com");
	
  }

  @AfterMethod
  public void Verification() {
	
		PasswordPage oPasswordPage = new PasswordPage(driver);		  
		String textverify = oPasswordPage.forget();
		  Assert.assertEquals(textverify, "Forget Password");
		  driver.quit();
	
  }
}
