package selenium.with.testng.example;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SeleniumTestExample {
	WebDriver driver;
  @Test
  public void LoginTest() {
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sdfghjkl");
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("sdfghjkl");
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
