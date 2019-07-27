package com.google.pom.execution.page.factory;

import org.testng.annotations.Test;

import com.google.page.object.model.GmailPage;
import com.google.page.object.model.GooglePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GmailLoginPfTest {
	WebDriver driver;
  @Test
  public void gmailLoginOperation() throws InterruptedException {
	  GooglePage gmailLink = new GooglePage(driver);
	  gmailLink.clickGmailLink();
	  
	  GmailPage operation = new GmailPage(driver);
	  operation.signInOperation("shruti.garg0302", "1234567890");
  }
  @BeforeMethod
  public void openBrowser()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\"
		  		+ "rishabh\\Desktop\\Selenium Class\\Browser Driver\\"
		  		+ "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.google.com");
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
