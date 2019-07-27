package com.screenhot.example;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import Utility.Library;
public class ScreenShotExample {
	
  @Test
  public void Test() throws IOException {
	  System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		Library.CaptureScreenShot(driver, "Browser Started");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test");
		Library.CaptureScreenShot(driver, "Entered User Name");
			
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("test");
		Library.CaptureScreenShot(driver, "Entered Password");	
		
		driver.findElement(By.xpath(".//*[@value = 'Log In']")).click();
		Library.CaptureScreenShot(driver, "Click on Login");
					
		String homepage = driver.getWindowHandle();
		System.out.println("Facebook User Home Page Id:"+homepage);	
		
		
		driver.navigate().to("http://www.amazon.in");
		Library.CaptureScreenShot(driver, "amazon webpage");
		
		
  }
}
