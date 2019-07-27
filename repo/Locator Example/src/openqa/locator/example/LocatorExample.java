package openqa.locator.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		// Enter Username
		driver.findElement(By.id("email")).sendKeys("9205875403");
		System.out.println("Entered Email Succespul");
		
		// Enter Password
		driver.findElement(By.id("pass")).sendKeys("sdfghjkhgfcdxcdfv");
		System.out.println("Entered pass Succespul");

	}

}
