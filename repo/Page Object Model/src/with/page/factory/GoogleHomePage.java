package with.page.factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using=".//*[@class='gb_P']")
	private WebElement GmailLink;
	
	public GoogleHomePage(WebDriver driver){
		this.driver = driver;		
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	//Click on SignIn Link
	public void SignIn(){
		GmailLink.click();						
	}
			
		public void ClickOnSignIn(){
			this.SignIn();
		}
			
			

}
