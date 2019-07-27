package openqa.frame.example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_Example {	
	WebDriver driver =null;	
	public void BrowserOpen() {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");		
		// Invoke Browser
		driver = new FirefoxDriver();		
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		String register = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[2]/a")).getText();
		System.out.println(register);
	}
	public void IframeCounting() {
		List<WebElement> Frame = driver.findElements(By.tagName("iframe"));
		int frameSize = Frame.size();
		System.out.println(frameSize);	
	}
	public void IframeHandling() {
		WebElement frameexample = driver.findElement(By.xpath("//*[@id=\'singleframe\']"));
		driver.switchTo().frame(frameexample);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("WebDriver");	
		
		driver.switchTo().defaultContent();
		String WebTable = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[3]/a")).getText();
		System.out.println(WebTable);		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iframe_Example framehandling = new Iframe_Example();
		framehandling.BrowserOpen();
		framehandling.IframeCounting();
		framehandling.IframeHandling();

	}

}
