package com.gmail.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

		
		WebDriver driver;
		
		By signin = By.id("gb_70");
		By username = By.id("identifierId");
		By next = By.xpath(".//*[@id='identifierNext']/content[@class='CwaK9']/span[@class='RveJvd snByac']");
		By password = By.name("password");
		By button = By.xpath(".//*[@class='OZliR']/div[@id='passwordNext']/content[@class='CwaK9']/span[@class='RveJvd snByac']");
		
		String uid = "vikrant9430@gmail.com";
		String pass = "123456789";
		
		public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver= driver;
		}

				
		public void signinbutton(){
			driver.findElement(signin).click();			
		}
		
		public void typeusername(){
			driver.findElement(username).sendKeys(uid);
		}
		
		public void nextbutton (){
			driver.findElement(next).click();
		}		
		
		public void typepassword() throws InterruptedException{
			Thread.sleep(5000);
			driver.findElement(password).sendKeys(pass);
		}
		
		public void loginbutton(){
			driver.findElement(button).click();
		}

}
