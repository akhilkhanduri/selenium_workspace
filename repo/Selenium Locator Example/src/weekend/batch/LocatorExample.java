package weekend.batch;

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
		
		driver.navigate().to("http://www.calculator.net");
		
		driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
		driver.findElement(By.cssSelector("#cpar1")).sendKeys("100");
		driver.findElement(By.cssSelector("#cpar2")).sendKeys("50");
		
		driver.findElement(By.cssSelector("#content >"
				+ " table:nth-child(4) > tbody > tr:nth-child(2) > td > "
				+ "input[type=\"image\"]:nth-child(2)")).click();

	}

}
