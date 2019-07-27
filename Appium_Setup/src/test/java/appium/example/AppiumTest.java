package appium.example;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class AppiumTest {
	static AppiumDriver<WebElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(CapabilityType.VERSION, "6.0");
		cap.setCapability("DeviceName", "emulator-5554");
		cap.setCapability("appPackage", "io.selendroid.testapp");
		cap.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		System.out.println("Donesss");
		
		
		
		
		
		
	
	
	
	
	

	}

}
