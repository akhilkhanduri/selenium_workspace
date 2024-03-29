package page.object.model.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModelForGoogle {
	WebDriver driver;
		
	By searchBox = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input");
	By searchButton = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]");
	By imFeelingLucky = By.xpath("//*[@id=\"tsf0\"]/div[2]/div/div[3]/center/input[2]");
	By gmailLink = By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a");
	By signInButton = By.xpath("//*[@id=\"gb_70\"]");
	By imageLink = By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a");
	
	public PageObjectModelForGoogle(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void enterTextIntoSearch(String someText) {
		driver.findElement(searchBox).sendKeys(someText);
	}
	
	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}
	
	public void clickImFeelingLucky() {
		driver.findElement(searchButton).click();
	}
	
	public void clickGmailLink() {
		driver.findElement(gmailLink).click();
	}
	
	public void clickSignInButton() {
		driver.findElement(signInButton).click();
	}
	
	public void clickImageLink() {
		driver.findElement(imageLink).click();
	}
	
	public void GoogleSearch(String someText) 
	{		
		this.enterTextIntoSearch(someText);
		this.clickSearchButton();
	}
	
	public void ImageSearch(String someText) throws InterruptedException 
	{	
		this.clickImageLink();
		Thread.sleep(3000);
		this.enterTextIntoSearch(someText);
		this.clickSearchButton();
	}
	

}
