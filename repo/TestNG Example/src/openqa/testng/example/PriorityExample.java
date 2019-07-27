package openqa.testng.example;

import org.testng.annotations.Test;

public class PriorityExample {
  
	  @Test(priority = 1)
	  public void One() {
		  System.out.println("1");
	  }
	  
	  @Test(priority = 2)
	  public void Two() {
		  System.out.println("2");
	  }
	  
	  @Test(priority = 3)
	  public void Three() {
		  System.out.println("3");
	  }
	  
	  @Test(priority = 4)
	  public void Four() {
		  System.out.println("4");
	  }
	  
	  @Test(priority = 5)
	  public void Five() {
		  System.out.println("5");
	  }
  }

