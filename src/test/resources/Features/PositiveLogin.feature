#Author: Arun Joseph
#Keywords Summary :
#Feature: Register user to the demo application
#Scenario: Registration
#test  

Feature: Register user to the demo application
  

  @arun
  Scenario: Registration
    Given User launces the application
    And User verifies "HomePage Button" is displayed on the "HomePage"
    And User clicks on the "Signup button" on the "HomePage"
    And User verifies "Log into your Account text" is displayed on the "SignUpPage"
    
    And User enters $$[testDataFile]UserEmail on the "Login Email field" on "SignUpPage"
    And User enters $$[testDataFile]userPassword on the "Login Password" on "SignUpPage"
    And User clicks on the "Login Button" on the "SignUpPage"
    And User verifies "Logged in user name" is displayed on the "HomePage"
    
    
    
    
    
    
    
    
    


