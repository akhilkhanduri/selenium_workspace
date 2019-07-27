package openqa.radio.checkbox.example;

import org.openqa.selenium.WebDriver;

public class PropertiesCollection {
	
	enum LocatorType{
		id,
		className,
		tagname,
		name,
		linktext,
		partiallinktext,
		xpath,
		cssSelector
	}
	
	public static WebDriver driver;
	public static String Key = "webdriver.gecko.driver";
	public static String Path =  "C:\\Users\\rishabh\\Desktop\\"
			+ "Selenium Class\\Browser Driver\\geckodriver.exe";	
	public static String url = "https://www.facebook.com";

}
