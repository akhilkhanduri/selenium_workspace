package openqa.window.handle;

import java.util.Collection;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlesExample {
	WebDriver driver = null;
	
	public WindowHandlesExample(WebDriver driver) {
		this.driver = driver;		
	}

	public void OpenBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
					+ "Browser Driver\\geckodriver.exe");		
driver = new FirefoxDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
	public void InvokeWebApps() {
	driver.navigate().to("http://demo.automationtesting.in/Windows.html");	
	}
	
	public void GetWindowCode() {
		try {
			String windowcode = driver.getWindowHandle();
			System.out.println("First Window alphanumeric Code: "+windowcode);
			String FirstwindowTitle = driver.getTitle();
			System.out.println("First Window Title: "+FirstwindowTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void GetMultiWindowCode() throws InterruptedException {
		try {
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("button.btn-info:nth-child(1)")).click();
			Set<String> windowcodes = driver.getWindowHandles();
			/*Collection<String> window = driver.getWindowHandles();*/
			System.out.println("Multiple Window Alphanumeric Code: "+windowcodes);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void SwitchToAnotherWindow() throws InterruptedException {
		try {
			for(String windowhandle : driver.getWindowHandles()) {
				driver.switchTo().window(windowhandle);
				String SecondWindowTitle = driver.getTitle();
				System.out.println("Second Window Title: "+SecondWindowTitle);
				Thread.sleep(5000);
				if(driver != null) {
					driver.quit();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void windowexecution() throws InterruptedException {
		try {
			this.OpenBrowser();
			this.InvokeWebApps();
			this.GetWindowCode();
			this.GetMultiWindowCode();
			this.SwitchToAnotherWindow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
