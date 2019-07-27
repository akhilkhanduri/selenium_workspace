package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
public static WebDriver driver;
	 @Given("^User is on Home Page$")
	 public void user_is_on_Home_Page(){
		 System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
					+ "Browser Driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("http://www.store.demoqa.com");
	 }
	 
	 @When("^User Navigate to LogIn Page$")
	 public void user_Navigate_to_LogIn_Page(){
	 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 }
	 
	 @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enters_UserName_and_Password(String username, String password) {
		 driver.findElement(By.id("log")).sendKeys(username); 
	     driver.findElement(By.id("pwd")).sendKeys(password);
	     driver.findElement(By.id("login")).click();
	 }
	 
	 @Then("^Message displayed Login Successfully$")
	 public void message_displayed_Login_Successfully(){
	 System.out.println("Login Successfully");
	 }
	 
	 @When("^User LogOut from the Application$")
	 public void user_LogOut_from_the_Application(){
	 driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	 }
	 
	 @Then("^Message displayed LogOut Successfully$")
	 public void message_displayed_LogOut_Successfully(){
	 System.out.println("LogOut Successfully");
	 }
	}
	 

	