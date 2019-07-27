package page.object.model.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailSignInPage {
	WebDriver driver;
	
	By userName = By.xpath("//*[@id=\"identifierId\"]");
	By usernameNext = By.xpath("//*[@id=\"identifierNext\"]/content/span");
	
	public GmailSignInPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void enterUserName(String username) {
		driver.findElement(userName).sendKeys(username);
	}
	
	public void clickNextButton() {
		driver.findElement(usernameNext).click();
		
	}
}
