package locator.example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByTagNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		List<WebElement> count = driver.findElements(By.tagName("a"));
		int size = count.size();
		System.out.println(size);
		
		for(int i = 0; size>i; i++) {
			String text = count.get(i).getText();
			System.out.println(text);
		}

	}

}
