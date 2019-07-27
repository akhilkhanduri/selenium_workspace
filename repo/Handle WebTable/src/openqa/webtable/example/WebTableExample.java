package openqa.webtable.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://money.rediff.com/gainers/bsc/dailygroupa?");
		
		//No.of Columns
		List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of cols are : " +column.size()); 
		
		//No.of rows 
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr")); 
		System.out.println("No of rows are : " + rows.size());
		
		driver.close();
		

	}

}
