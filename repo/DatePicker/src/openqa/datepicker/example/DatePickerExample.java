package openqa.datepicker.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement from = driver.findElement(By.xpath("//*[@id=\"src\"]"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		WebElement onward = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label"));
		WebElement returns = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div/label"));
				
		from.sendKeys("KOLKATA");
		Thread.sleep(2000);
		
		to.click();
		to.sendKeys("Delhi");
		onward.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]"
				+ "/table/tbody/tr[1]/td[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[3]/td[7]")).click();
		Thread.sleep(2000);
		returns.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[6]/td[6]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
	}

}
