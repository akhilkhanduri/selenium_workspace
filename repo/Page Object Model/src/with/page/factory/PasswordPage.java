package with.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {
	WebDriver driver;
	@FindBy(how=How.XPATH, using = "/html/body/div[1]/div[1]/div[2]"
			+ "/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/div"
			+ "/div[1]/div/div[1]/input")
	private WebElement Password;
	
	@FindBy(how=How.XPATH, using = "/html/body/div[1]/div[1]/"
			+ "div[2]/div[2]/form/div[2]/div/div[3]/div[2]/"
			+ "div[1]/div/content/span")
	private WebElement SignNext;
	
	@FindBy(how=How.XPATH, using = "//*[@class='IMH1vc lUHSR Hj2jlf']")
	private WebElement VerifyText;
	
	public PasswordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;		
		PageFactory.initElements(driver, this);
	}

		
	public void EnterPassword(String StrPassword){
		Password.sendKeys(StrPassword);	
	}
	
	public void ClickSignIn(){
		SignNext.click();		
	}
	
	public String forget(){
		return VerifyText.getText();		
	}
	
	

	public void GmailLogin(String StrPassword){
		this.EnterPassword(StrPassword);
		this.ClickSignIn();	
	}

}
