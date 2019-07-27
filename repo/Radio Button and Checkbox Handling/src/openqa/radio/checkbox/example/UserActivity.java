package openqa.radio.checkbox.example;

import org.openqa.selenium.By;


public class UserActivity {

	public static void EnterText(String LocatorValue, String value, String LocatorType) {
		
		if(LocatorType == "id") {
			PropertiesCollection.driver.findElement(By.id(LocatorValue)).sendKeys(value);
		}else if(LocatorType ==  "name") {
			PropertiesCollection.driver.findElement(By.name(LocatorValue)).sendKeys(value);
		}else if(LocatorType == "className") {
			PropertiesCollection.driver.findElement(By.className(LocatorValue)).sendKeys(value);
		}else if(LocatorType == "xpath") {
			PropertiesCollection.driver.findElement(By.xpath(LocatorValue)).sendKeys(value);
		}else if(LocatorType == "cssSelector") {
			PropertiesCollection.driver.findElement(By.cssSelector(LocatorValue)).sendKeys(value);	
		}else {
			System.out.println("No Locator Found");
		}
		
	}	
	
	public static void ClickOnElement(String LocatorValue, String LocatorType) {
		
		if(LocatorType ==  "id") {
			PropertiesCollection.driver.findElement(By.id(LocatorValue)).click();
		}else if(LocatorType ==  "name") {
			PropertiesCollection.driver.findElement(By.name(LocatorValue)).click();
		}else if(LocatorType == "className") {
			PropertiesCollection.driver.findElement(By.className(LocatorValue)).click();
		}else if(LocatorType == "xpath") {
			PropertiesCollection.driver.findElement(By.xpath(LocatorValue)).click();
		}else if(LocatorType == "cssSelector") {
			PropertiesCollection.driver.findElement(By.cssSelector(LocatorValue)).click();	
		}else {
			System.out.println("No Locator Found");
		}
	}
			}
