package batch.seven.us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table"
				+ "/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/"
				+ "tbody/tr[2]/td[2]/input")).sendKeys("mercury");
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/"
				+ "table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/"
				+ "tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]"
				+ "/td[2]/input")).sendKeys("mercury");
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody"
				+ "/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]"
				+ "/td[2]/div/input")).click();
		
	}

}
