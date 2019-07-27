package dataprovider.example.with.dataprovider.example.with.testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
	
	WebDriver driver;
  
  @DataProvider(name = "Authentic")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "username", "password" },
      new Object[] { "username", "password" },
      new Object[] { "username", "password" },
      new Object[] { "username", "password" }
    };
  }
  
  @Test(dataProvider = "Authentic")
  public void LoginTest(String UserName, String Password) {
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(UserName);
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Password);
	  driver.findElement(By.xpath("//*[@value=\"Log In\"]")).click();
  }  
  @BeforeMethod
  public void OpenBrowser() {
	  driver.navigate().to("https://www.facebook.com");
	  System.out.println("Facebook Open!!");
  }
  @AfterMethod
  public void Verification() {
	  Assert.assertEquals(true, true);
  }
  @BeforeTest
  public void EnvironmentSetup() {
	  System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  System.out.println(driver.getClass().getName());
  }
  @AfterTest
  public void TearDown() {
	  driver.quit();
  }
}
