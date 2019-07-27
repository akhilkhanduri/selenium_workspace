package testng.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Framework2Test {
	WebDriver driver;
  @Test
  public void loginTest() {
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vikrant@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("zxcvbnm");
	  driver.findElement(By.xpath("//*[@value=\"Log In\"]")).click();
  }
  @BeforeMethod
  public void openUrl() {
	  driver.navigate().to("http://www.facebook.com");
  }

  @AfterMethod
  public void afterMethod() {
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Facebook – log in or sign up");
  }

  @BeforeTest
  public void environmentSetup() {
	  System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  if(driver != null)
	  {
		  driver.quit();
		  System.out.println("Driver Closed");
	  }
  }

}
