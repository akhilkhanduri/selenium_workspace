package batch.seven.us;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		List<WebElement> tagnameCount = driver.findElements(By.tagName("tr"));
		int tagnamesize = tagnameCount.size();
		System.out.println("Tagname Implmented: " +tagnamesize);
		
		for(int i =0; tagnamesize>i; i++) {
			String elementtext = tagnameCount.get(i).getText();
			System.out.println(elementtext);
		}
	

	}

}
