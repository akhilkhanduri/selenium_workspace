package openqa.appium.setup;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Appium_Example {
	static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
	// Path to Eclipse project
	File classpathRoot = new File(System.getProperty("user.dir"));

	// Path to <project folder>/Apps -> Amazon
	File appDir = new File(classpathRoot, "/selendroid-test-app-0.17.0.apk");
	
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	
	// Name of the OS: Android, iOS or FirefoxOS
	capabilities.setCapability("platformName", "Android");
	
	// Mobile OS version –  My device is running Android 6.0
	capabilities.setCapability(CapabilityType.VERSION, "6.0");
	
	// Device name:  – I am using Emulator
	capabilities.setCapability("deviceName", "emulator-5554");
	
	// An absolute local path to the APK file
	capabilities.setCapability("appDir", appDir.getAbsolutePath());
	
	// Java package of the tested Android app
	capabilities.setCapability("appPackage", "io.selendroid.testapp");
	
	// An activity name for the Android activity you want to run from your package.
	capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
	
	// Constructor to initialize driver object with new Url and Capabilities
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	System.out.println("Donesss");
	
	WebElement element = driver.findElementByClassName("android.widget.Button");
	element.click();
	
	}

}
