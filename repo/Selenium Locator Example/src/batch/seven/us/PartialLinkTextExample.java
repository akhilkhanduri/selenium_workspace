package batch.seven.us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		driver.findElement(By.partialLinkText("SIGN")).click();
		System.out.println("Click on PartiaLinktext Succesfully!!");

	}

}
