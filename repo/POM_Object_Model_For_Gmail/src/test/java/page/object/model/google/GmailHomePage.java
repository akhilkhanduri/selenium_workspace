package page.object.model.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GmailHomePage {
	WebDriver driver;
	
	/*@FindBy(how = How.XPATH, using=(""))
	WebElement element;*/
	
	By signIn = By.xpath("");
	By createAnAccount = By.xpath("");
	
	public GmailHomePage(WebDriver driver) {
		/*this.driver = driver;*/	
		PageFactory.initElements(driver, driver);
	}
	
	public void clickSignIn() {
		driver.findElement(signIn).click();
	}
	
	public void clickCreateAnAccount() {
		driver.findElement(signIn).click();
	}	

}
