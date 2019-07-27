package openqa.window.handle.execution;

import org.openqa.selenium.WebDriver;
import openqa.window.handle.WindowHandlesExample;
public class WindowHandleExampleExecution {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			WindowHandlesExample execute = new WindowHandlesExample(driver);
			execute.windowexecution();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
