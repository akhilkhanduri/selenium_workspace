package locator.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByLinkTextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		// Performing LinkText Operation
		driver.findElement(By.linkText("SIGN-ON")).click();
		System.out.println("Click on SIGN-ON Succesfully!!");
		
		// Performing partialLinkText Operation
		driver.findElement(By.partialLinkText("REGIS")).click();
		System.out.println("Click on REGISTRATION Succesfully!!");
		
	}

}
