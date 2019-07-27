package cucumber.test.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTestTwo {
	private static WebDriver driver;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
				+ "Browser Driver\\geckodriver.exe");	
		driver = new FirefoxDriver();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() {
	  driver.navigate().to("https://www.facebook.com");
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password()  {
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vikrantnandan@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456789");
	    driver.findElement(By.xpath("//*[@value=\"Log In\"]")).click();
	
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully()  {
	   System.out.println("Login Successfull");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application()  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Click Logout");
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		 System.out.println("LogOut Successfull");
	}
}
