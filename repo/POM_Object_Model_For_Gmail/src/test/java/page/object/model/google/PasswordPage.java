package page.object.model.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage {
	WebDriver driver;
	By passwordField = By.xpath("//*[@id=\"identifierId\"]");
	By passwordNext = By.xpath("//*[@id=\"identifierNext\"]/content/span");
	
	public PasswordPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
		
	}
	
	public void passNext() {
		driver.findElement(passwordNext).click();
	}
	
	public void Waiting() throws InterruptedException {
		Thread.sleep(5000);
	}
}
