package handle.dropdown.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		
		// Scenarios: 1 Locate Day dropdown menu
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		
		Select oday = new Select(day);
		oday.selectByIndex(5);
		Thread.sleep(3000);
		oday.selectByValue("7");
		Thread.sleep(3000);
		oday.selectByVisibleText("10");
		Thread.sleep(3000);
		
		//Scenarios: 2 Count Elements in dropdown
		List<WebElement> count = oday.getOptions();
		int osize = count.size();
		System.out.println("Total options in day dropdown menu are  " +osize);
		
		// Scenarios: 3 To get all the options populate in console
		for(int i =0; i<osize; i++) {
			String dropdownValue = count.get(i).getText();
			System.out.println("Dropdown value is: " +dropdownValue);
		}
		
		Boolean verify = oday.isMultiple();
		System.out.println("It's not Support Multi Select.."+verify);
		
		}
}
