package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLogin {
		WebDriver driver;
		By SignInButton = By.xpath(".//*[@class='gb_P']");
		By LoginId = By.xpath("//*[@id='identifierId']");
		By NextButton = By.cssSelector(".RveJvd");
		By Password =  By.xpath(".//*[@class='whsOnd zHQkBf']");
		By LoginButton = By.cssSelector(".RveJvd");
		By Forget = By.xpath("//*[@id='forgotPassword']");
		
		public GmailLogin(WebDriver driver){
			this.driver = driver;		
		}				

		//Click on SignIn Button
	    public void ClickSignIn(){
	        driver.findElement(SignInButton).click();
	    }
	    
	    //Set user name in textbox
	    public void EnterUsername(String StrUsername){
	        driver.findElement(LoginId).sendKeys(StrUsername);
	    }
	    
	  //Click on Next Button
	    public void Next(){
	        driver.findElement(NextButton).click();
	    }
	    
	    //Wait 
	    
	    public void Sleep() throws InterruptedException{
	        Thread.sleep(5000);
	    }
	    
	    
	    //Set Password in textboxt
	    public void EnterPassword(String StrPassword){
	        driver.findElement(Password).sendKeys(StrPassword);
	    }
	    
	    //Click on login button
	    public void clickLogin(){
	       driver.findElement(LoginButton).click();

	    }
	    
	  //Get the title of Login Page
	    public String TextVerify(){
	     return driver.findElement(Forget).getText();
	    }
	    
	    public void SignIn(String StrUsername,String StrPassword) throws InterruptedException{

	    	//Click SignIn button
	        this.ClickSignIn();
	        
	    	//Fill user name
	        this.EnterUsername(StrUsername);
	        
	        //Click Next button
	        this.Next();
	        
	        //Wait
	        this.Sleep();

	        //Fill password
	        this.EnterPassword(StrPassword);

	        //Click Login button
	        this.clickLogin();          

	    }
	}

 