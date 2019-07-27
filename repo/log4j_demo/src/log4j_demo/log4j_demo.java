package log4j_demo;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class log4j_demo {
	
	static final Logger logger = LogManager.getLogger(log4j_demo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOMConfigurator.configure("C:\\Users\\rishabh\\Desktop\\Selenium Class\\Workspace\\log4j_demo\\log4j1.xml");		
		/*URL u = getClass().getClassLoader().getResource("com/my/abc/test/log4j.xml");
        DOMConfigurator.configure(u);*/
		
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("TEST Has Started");
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch WebSite
		driver.navigate().to("http://www.calculator.net/"); logger.info("Open Calc Application");
		
		// Click on Math Calculators
		driver.findElement(By.xpath("html/body/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/div[3]/a")).click(); 
		logger.info("Clicked Math Calculator Link");
	  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Click on Percent Calculators
		driver.findElement(By.xpath("html/body/div[3]/div[1]/ul[1]/li[3]/a")).click(); 
		logger.info("Clicked Percent Calculator Link");

		// Enter value 10 in the first number of the percent Calculator
		driver.findElement(By.name("cpar1")).sendKeys("10"); 
		logger.info("Entered Value into First Text Box");

		// Enter value 50 in the second number of the percent Calculator
		driver.findElement(By.name("cpar2")).sendKeys("50");  
		logger.info("Entered Value into Second Text Box");
		
		// Click Calculate Button
		driver.findElement(By.xpath("html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click(); 
		logger.info("Click Calculate Button");

		// Get the Result Text based on its xpath
		String result = driver.findElement(By.xpath("html/body/div[3]/div[1]/p[2]/font/b")).getText();  
		logger.info("Get Text Value");
		
		//Print a Log In message to the screen
		logger.info(" The Result is " + result);
		
		if(result.equals("5"))
		{
			logger.info("The Result is Pass");

		}
		else
		{
			logger.error("TEST FAILED. NEEDS INVESTIGATION");

		}
		
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		
		//Close the Browser.
		driver.close();    
	}

}
