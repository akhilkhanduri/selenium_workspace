package openqa.appium.chrome;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "ENUL6303030010"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("noReset", true);
				
		//Set ChromeDriver location
		System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
				
		//Instantiate Appium Driver
		AppiumDriver driver = null;
		
		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
			
			} catch (MalformedURLException e) {
					System.out.println(e.getMessage());
				}
						
				//Open URL in Chrome Browser
		driver.get("http://www.google.com");
		driver.findElementById("").click();
		MobileElement element = (MobileElement)(driver.findElementByName(""));
		element.click();
	}

}
