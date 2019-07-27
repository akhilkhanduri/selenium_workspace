package openqa.testng.example;

import org.testng.annotations.Test;

public class DependsOnMethodExample {
	
  @Test(dependsOnMethods="BrowserOpen")
  public void SignIn() {
	  System.out.println("SignIn Successful !!");
  }
  
  @Test
  public void BrowserOpen() {
	  System.out.println("Browser Open Successful !!");	  
  }  
  
  @Test(dependsOnMethods="SignIn")
  public void SignOut() {	  
	  System.out.println("SignOut Successful !!");
  }
}
