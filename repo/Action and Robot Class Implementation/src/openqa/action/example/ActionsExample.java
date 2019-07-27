package openqa.action.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		
		// Step -1
		driver.navigate().to("http://www.google.com");
		WebElement GoogleSearchBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		WebElement SearchButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
				
		Actions oaction = new Actions(driver);
		oaction.moveToElement(GoogleSearchBox).click()
		.keyDown(GoogleSearchBox,Keys.SHIFT) // for Press Shift Key
		.sendKeys(GoogleSearchBox, "s") // Enter s Character
		.keyUp(GoogleSearchBox, Keys.SHIFT) // Release Shift Key
		.sendKeys(GoogleSearchBox, "elenium") // Enter Character "elenium"
		.click(SearchButton); // Click Search Button
		
		Action search = oaction.build();	
		search.perform();
		
		System.out.println("Action Performed");
		

	}

}
