package dataprovider.example.with.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
	
  @Test(dataProvider = "Authentication")
  public void FacebookTest(String username, String password) {
	  try {
		WebDriverInstance.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		System.out.println("Entered Username");
		WebDriverInstance.driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		System.out.println("Entered Password");
		WebDriverInstance.driver.findElement(By.xpath("//*[@value=\"Log In\"]")).click();
		System.out.println("Clicked Login Button");
		
		System.out.println("Login Succesfully!!");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
  }

  @BeforeMethod
  public void BroswerInvocation() throws MalformedURLException {
	  System.setProperty(WebDriverInstance.Key, WebDriverInstance.Path);
	  WebDriverInstance.driver = new FirefoxDriver();
	  System.out.println("Browser Invoked Successfully");
	  WebDriverInstance.driver.navigate().to(WebDriverInstance.url);
	  System.out.println("URL Open Successfully!!");
  }

  @AfterMethod
  public void DriverCloseOperation() throws Exception {
	  if(WebDriverInstance.driver != null) {
		  WebDriverInstance.driver.quit();
	  	System.out.println("Driver close Succesfully");
	  }
	  else {
		  System.out.println("Driver not able to kill ourself");
		  throw new Exception("Reason is Something went Wrong");
	  }
  }


  @DataProvider(name = "Authentication")
  public Object[][] LoginCredential() {
    return new Object[][] {
      new Object[] { "123456789", "156875"  },
      new Object[] { "123456789", "156875"  },
      new Object[] { "123456789", "156875"  },
      new Object[] { "123456789", "156875"  },
      new Object[] { "123456789", "156875"  },
      new Object[] { "123456789", "156875"  },
      new Object[] { "123456789", "156875"  }
    };
  }
}
