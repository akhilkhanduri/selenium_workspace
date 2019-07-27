package multidata.approach.jxl.dataprovider;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MultidataTest {
	
	private WebDriver driver; // Selenium control driver
	private String baseUrl; // baseUrl of website Facebook
	
  @Test(dataProvider = "FacebookTest")
  public void FacebookTesting(String UserName, String Password) {
	  	String actualTitle;
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(UserName);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@value=Log In]")).click();
	
		
		actualTitle = driver.getTitle();
		// On Successful login compare Actual Page Title with Expected Title
    	assertEquals(actualTitle,Utility.EXPECT_TITLE);
  }

  @DataProvider(name = "FacebookTest")
	public Object[][] testData() throws Exception {
		return Utility.getDataFromExcel(Utility.FILE_PATH, Utility.SHEET_NAME,
				Utility.TABLE_NAME);
	}
  @BeforeMethod
  public void Setup() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\"
				+ "Desktop\\SQT\\Selenium WebDriver\\Selenium Drivers\\"
				+ "Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver();

		// Setting Base URL of website Guru99
		baseUrl = Utility.BASE_URL;
		driver.manage().timeouts()
				.implicitlyWait(Utility.WAIT_TIME, TimeUnit.SECONDS);
		// Go to http://www.demo.guru99.com/V4/
		driver.get(baseUrl);
	}
  

  @AfterMethod
  public void TearDown() {
	  driver.quit();
  }

}
