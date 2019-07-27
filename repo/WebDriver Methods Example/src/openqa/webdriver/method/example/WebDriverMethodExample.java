package openqa.webdriver.method.example;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethodExample {
	static String path = new String("C:\\Users\\rishabh\\Desktop\\Selenium Class\\Browser Driver\\geckodriver.exe");
	static String key = "webdriver.gecko.driver";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To Initiate Connection over http
		System.setProperty(key, path);
		
		// To Initialize a browser
		WebDriver driver =  new FirefoxDriver();
		
		// Navigate URL Page
		driver.navigate().to("https://www.google.com");
		
		// Get Title of Google.
		String Title = driver.getTitle();
		System.out.println(Title);
		
		// Get CurrentURL
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		/*// Get PageSource
		String Source = driver.getPageSource();
		System.out.println(Source);*/
		
		// Get Window Browser Code.
		String Code = driver.getWindowHandle();
		System.out.println(Code);
		
		// For Maximize and Full Screen Browser Window
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		Dimension SizeWindow = driver.manage().window().getSize();
		System.out.println(SizeWindow);
		
	
		
		
		
		
		
		
		
		
		

	}

}
