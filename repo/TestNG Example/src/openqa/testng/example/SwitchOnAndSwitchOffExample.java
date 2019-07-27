package openqa.testng.example;

import org.testng.annotations.Test;

public class SwitchOnAndSwitchOffExample {
	  @Test(priority = 1, enabled=true)
	  public void One() {
		  System.out.println("1");
	  }
	  
	  @Test(priority = 2, enabled = false)
	  public void Two() {
		  System.out.println("2");
	  }
	  
	  @Test(priority = 3, enabled=false)
	  public void Three() {
		  System.out.println("3");
	  }
	  
	  @Test(priority = 4, enabled=true)
	  public void Four() {
		  System.out.println("4");
	  }
	  
	  @Test(priority = 5, enabled=false)
	  public void Five() {
		  System.out.println("5");
	  }
}
