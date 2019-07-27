package locator.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		// Enter User Name
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		// Enter Password
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		// Click on Login Button
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		// To Get the Current URL
		String url = driver.getCurrentUrl();
		System.out.println("Current URL Address: " + url);
		
		// To Get the current Title
		String title = driver.getTitle();
		System.out.println("Title of Webpage: "+ title);
		
		

	}

}
