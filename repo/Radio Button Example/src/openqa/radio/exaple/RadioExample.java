package openqa.radio.exaple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.facebook.com");
		
		WebElement Female = driver.findElement(By.xpath("//*[@id=\'u_0_9\']"));
		
		WebElement male = driver.findElement(By.xpath("//*[@id=\'u_0_a\']"));
		
		Boolean Fdisplay = Female.isDisplayed();
		Boolean Fenable = Female.isEnabled();
		Boolean Fselected = Female.isSelected();
		
		System.out.println(Fdisplay);
		System.out.println(Fenable);
		System.out.println(Fselected);
		
		Boolean Mdisplay = male.isDisplayed();
		Boolean Menable = male.isEnabled();
		Boolean Mselected = male.isSelected();
		
		System.out.println(Mdisplay);
		System.out.println(Menable);
		System.out.println(Mselected);
		
		male.click();
		Boolean MAfterselected = male.isSelected();
		System.out.println(MAfterselected);
				
		Boolean femalenotSelected= Female.isSelected();
		System.out.println(femalenotSelected);
		
		Female.click();
		Boolean FAfterselected = Female.isSelected();
		System.out.println(FAfterselected);
				
		Boolean malenotSelected= male.isSelected();
		System.out.println(malenotSelected);
		
	}

}
