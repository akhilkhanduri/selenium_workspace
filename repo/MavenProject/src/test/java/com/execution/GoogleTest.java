package com.execution;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GoogleTest {
  @Test
  public void f() {
	  System.out.println("Main Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("1");
  }

}
