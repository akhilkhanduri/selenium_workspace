package selenium.with.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestSeleniumWithTestNG {
	
  @Test
  public void PercentageCalculator() {
	  WebDriverCollectionMethod.driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
	  WebDriverCollectionMethod.driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	  WebDriverCollectionMethod.driver.findElement(By.xpath("//*[@id=\"cpar1\"]")).sendKeys("1000");;
	  WebDriverCollectionMethod.driver.findElement(By.xpath("//*[@id=\"cpar2\"]")).sendKeys("50");
	  WebDriverCollectionMethod.driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click(); 
	  String Result = WebDriverCollectionMethod.driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]")).getText();
	  System.out.println(Result);
	  
	  Assert.assertEquals(Result, "1000% of 50 = 500");
	  System.out.println("Result Passed");
  } 
  
  @BeforeMethod
  public void BrowserInvoke() {
	  System.setProperty(WebDriverCollectionMethod.key, WebDriverCollectionMethod.path);
	  WebDriverCollectionMethod.driver= new FirefoxDriver();
	  WebDriverCollectionMethod.driver.navigate().to("https://www.calculator.net");
  }

  @AfterMethod
  public void TearDown() {
	  if(WebDriverCollectionMethod.driver != null) {
		  WebDriverCollectionMethod.driver.quit();
		  System.out.println("Driver Closed");
	  }else {
		  System.out.println("Driver not able to closed!!");
	  }
  }

}
