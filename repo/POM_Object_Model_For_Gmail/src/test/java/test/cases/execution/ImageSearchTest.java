package test.cases.execution;

import org.testng.annotations.Test;

import page.object.model.google.PageObjectModelForGoogle;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class ImageSearchTest {
	WebDriver driver;
	
  @Test
  public void imageSearchTest() throws InterruptedException {
	  driver.navigate().to("https://www.google.com");
	  
	  PageObjectModelForGoogle ImageSearch = new PageObjectModelForGoogle(driver);
	  ImageSearch.ImageSearch("Burj Khalifa");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\rishabh\\Desktop\\"
			+ "Selenium Class\\Browser Driver\\geckodriver.exe");
	driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
