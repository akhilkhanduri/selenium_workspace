package iframe.handle.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		
		// Step -1
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		
		// Step -2
		String Register = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[2]/a")).getText();
		System.out.println(Register);
		
		//Step -3		
		driver.switchTo().frame("singleframe");;
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("WebDriver");
		
		//Step -4
		driver.switchTo().defaultContent();
		
		//Step -5
		String Webtable = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[3]/a")).getText();
		System.out.println(Webtable);
		
		//Step -6
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
				
		//Step -7
		Thread.sleep(3000);
		WebElement SingleFrame = driver.findElement(By.xpath("//*[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(SingleFrame);
		
		//Step -8
		WebElement SecondFrame = driver.findElement(By.xpath("//*[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(SecondFrame);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium");
		
		//Step -9
		
		driver.switchTo().defaultContent();
		
		String Switch = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a")).getText();
		System.out.println(Switch);
		
		//Step -10
		Thread.sleep(5000);
		driver.quit();
	}
}
