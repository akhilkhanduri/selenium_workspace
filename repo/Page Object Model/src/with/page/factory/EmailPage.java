package with.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using = "//*[@id='identifierId']")
	private WebElement UserName;
	
	@FindBy(how=How.XPATH, using = "/html/body/div[1]/div[1]"
			+ "/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/"
			+ "div/content/span")
	private WebElement Next;
	
	public EmailPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void EmailAddress(String Email){
		UserName.sendKeys(Email);
	}
	
	public void ClickNextButton(){
		Next.click();
	}
	
	public void Wait() throws InterruptedException{
		Thread.sleep(5000);
	}
	
	public void EnterEmail(String Email) throws InterruptedException{		
		this.EnterEmail(Email);
		this.ClickNextButton();
		this.wait();
		
	}
	
	
	
	

}
