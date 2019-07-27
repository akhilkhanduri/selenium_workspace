package openqa.radio.exaple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement Check_1 = driver.findElement(By.xpath("//*[@id=\'Content\']/div[1]/blockquote[1]/form/input[1]"));
		WebElement Check_2 = driver.findElement(By.xpath("//*[@id=\'Content\']/div[1]/blockquote[1]/form/input[2]"));
		
		
		Boolean displayedCheck_1 = Check_1.isDisplayed();
		Boolean enabledCheck_1= Check_1.isEnabled();
		Boolean selectedCheck_1 = Check_1.isSelected();
		
		System.out.println(displayedCheck_1);
		System.out.println(enabledCheck_1);
		System.out.println(selectedCheck_1);
		
		Boolean displayedCheck_2 = Check_2.isDisplayed();
		Boolean enabledCheck_2= Check_2.isEnabled();
		Boolean selectedCheck_2 = Check_2.isSelected();
		
		System.out.println(displayedCheck_2);
		System.out.println(enabledCheck_2);
		System.out.println(selectedCheck_2);
		
		Check_1.click();
		Boolean selectedCheck_1Click = Check_1.isSelected();
		System.out.println(selectedCheck_1Click);
		
		Check_2.click();
		Boolean selectedCheck_2Click = Check_2.isSelected();
		System.out.println(selectedCheck_2Click);
	}

}
