package com.gmail.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gmail.page.LoginPage;

public class ValidateGmailLogin {
	
	@Test
	public void verifylogin() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT\\Selenium WebDriver\\"
				+ "Selenium Drivers\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*driver.manage().window().maximize();*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		
		LoginPage login = new LoginPage(driver);
		login.signinbutton();
		login.typeusername();
		login.nextbutton();
		login.typepassword();
		login.loginbutton();
	
		driver.quit();
		
		
		
		
	}

}
