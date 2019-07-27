package invoke.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To create the connection between IDE and Browser
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		
		//Navigate URL!! //
		driver.get("https://www.google.com");
		
		//Navigate Facebook
		driver.navigate().to("https://www.facebook.com");
		
		// Navigate to Forward
		driver.navigate().forward();
		
		// Navigate to Back
		driver.navigate().back();
		driver.navigate().refresh();	}

}
