import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddCookiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Second Commit
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL="http://flipkart.com/";
		driver.navigate().to(URL);
                //we should pass name and value for cookie as parameters
                // In this example we are passing, name= mycookie and value=123456789123
		Cookie name = new Cookie("mycookie", "123456789123");
		
		driver.manage().addCookie(name);
				
                // After adding the cookie we will check that by displaying all the cookies.
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		
		System.out.println(cookiesList);
		
		/*for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		}*/

	}

}
