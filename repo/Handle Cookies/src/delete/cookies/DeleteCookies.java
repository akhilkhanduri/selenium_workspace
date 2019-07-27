package delete.cookies;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL="http://flipkart.com/";
		driver.navigate().to(URL);
		
		driver.manage().deleteCookieNamed("AdobeOrg");		
		
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		System.out.println(cookiesList);
		
		driver.manage().deleteCookieNamed("AdobeOrg");
		
		for(Cookie delete : cookiesList){
			System.out.println(delete);
		}
	}
}
