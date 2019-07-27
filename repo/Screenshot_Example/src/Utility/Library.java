package Utility;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Library {
	
  public static void CaptureScreenShot(WebDriver driver,  String ScreenshotName) throws IOException {
	  try {
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  /*System.out.println(ts.getClass().getName());*/
		  
		  File src = ts.getScreenshotAs(OutputType.FILE);
		 
		FileUtils.copyFile(src, new File("./Screenshot_Example"
				+ "/Screenshot"+ScreenshotName+".png"));
		  System.out.println("Screenshot Captured");
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

}
