package openqa.webelement.example.us;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		WebElement element = driver.findElement(By.xpath("//*[@value=\'Login\']"));
		
		String oAttributeValue = element.getAttribute("name");
		System.out.println(oAttributeValue);
		
		String oText = element.getText();
		System.out.println(oText);
				
		String oCssProperty = element.getCssValue("font-family");
		System.out.println(oCssProperty);
		
		Rectangle oRect = element.getRect();
		System.out.println("Height of: " +oRect.height);
		System.out.println("Width of: " +oRect.width);
		
		Dimension Dim = element.getSize();
		System.out.println(Dim);
		
		Point point = element.getLocation();
		System.out.println(point);
		
		String oTagname = element.getTagName();
		System.out.println(oTagname);
		
		Boolean oDisplay = element.isDisplayed();
		System.out.println(oDisplay);
		
		Boolean oEnable = element.isEnabled();
		System.out.println(oEnable);

	}

}
