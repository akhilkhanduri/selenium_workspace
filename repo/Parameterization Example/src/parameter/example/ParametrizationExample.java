package parameter.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

public class ParametrizationExample {
	WebDriver driver;
	@Test
	@Parameters({"UserId","Password"})
	public void Login(String UserId,String Password){
		try{
			driver.findElement(By.id("email")).sendKeys(UserId);
			driver.findElement(By.id("pass")).sendKeys(Password);
			driver.findElement(By.id("u_0_2")).submit();
			throw new SkipException("Exception throw");
		}catch(Exception e){
			//TODO Auto-Generated catch block
			e.printStackTrace();
			}
		}
	
	@BeforeTest
	public void openbrowser(){
	System.setProperty("webdriver.gecko.driver","C:\\Users\\rishabh\\Desktop\\Selenium Class\\Browser Driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.navigate().to("http://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void teardown(){
	driver.quit();
	}
}
