package com.xpath.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");
		
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.calculator.net");
		
		driver.findElement(By.xpath("//*[@id=\'contentout\']/table/tbody/tr/td[3]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'content\']/table[2]/tbody/tr/td/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'cpar1\']")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\'cpar2\']")).sendKeys("5");
		driver.findElement(By.xpath("//*[@id=\'content\']/table[1]/tbody/tr[2]/td/input[2]")).click();
		
		String Result = driver.findElement(By.xpath("//*[@id=\'content\']/p[2]")).getText();
		
		System.out.println(Result);
		
		if(Result.contentEquals("10% of 5 = 0.5")) {
			System.out.println("Result Passed");				
		}else {
			System.out.println("Result Failed");
		}
			
	}
	
//
}
