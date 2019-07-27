package batch.selenium.pant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Step :1 Create Connection Between IDE
		and Browser So We need to set property for Firefox.*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rishabh\\Desktop\\"
				+ "Selenium Class\\Browser Driver\\geckodriver.exe");
		
		/*Step :2 To invoke Browser*/
		WebDriver driver = new FirefoxDriver();
		
		/*Step: 3 To open URL*/
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("http://www.google.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
		
		
		

	}

}
