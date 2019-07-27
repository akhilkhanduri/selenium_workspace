package openqa.radio.checkbox.example;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioAndChecboxExample {

	public static void OpenBrowser() {
		System.setProperty(PropertiesCollection.Key, PropertiesCollection.Path);
		PropertiesCollection.driver = new FirefoxDriver();
		System.out.println("Browser Open!!");
		PropertiesCollection.driver.navigate().to(PropertiesCollection.url);
		System.out.println("Navigated Facebook Page");			
		}
	
	public static void FillUserAndPass() {		
		UserActivity.EnterText("email", "username", "id");
		System.out.println("Entered Username");
		UserActivity.EnterText("pass", "password","name");
		System.out.println("Entered Password");		
		}
	
	public static void VerfiyRadioButton() {
		Boolean Dispaly = PropertiesCollection.driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).isDisplayed();
		System.out.println(Dispaly);
		Boolean Enabled = PropertiesCollection.driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).isDisplayed();
		System.out.println(Enabled);		
		Boolean Selected = PropertiesCollection.driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).isDisplayed();
		System.out.println(Selected);
		
		UserActivity.ClickOnElement("//*[@id=\"u_0_9\"]","xpath");
		
		Boolean AfterClick = PropertiesCollection.driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).isDisplayed();
		System.out.println(AfterClick);
	}

	public static void TearDown() throws Exception {
		if (PropertiesCollection.driver != null) {
			PropertiesCollection.driver.quit();
			System.out.println("Driver close Succesfully !!");
		}else {
			System.out.println("Driver not closed ");
			
		}
	}
	
	public static void main(String[] args) throws Exception {		
		RadioAndChecboxExample.OpenBrowser();
		RadioAndChecboxExample.FillUserAndPass();
		RadioAndChecboxExample.VerfiyRadioButton();
		RadioAndChecboxExample.TearDown();		
	}	

	}
