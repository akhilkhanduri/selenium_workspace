@SmokeTest
Feature: Login Action
	
	@SmokeTest
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "testuser_1" and "Test@123"
    Then Message displayed Login Successfully

  Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully