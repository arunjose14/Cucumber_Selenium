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
    And User verifies "New User Signup" is displayed on the "SignUpPage"
    And User enters "Arun" on the "Name Field" on "SignUpPage"
    And User enters $$[testDataFile]UserEmail on the "Email Field" on "SignUpPage"
    And User clicks on the "Signup button" on the "SignUpPage"
    
    And User clicks on the "Title Mr" on the "SignUpPage"
    
    And User clicks on the "News letter checkbox" on the "SignUpPage"
    And User clicks on the "Offers checkbox" on the "SignUpPage"
    
    #And User clicks on the "Day of Birth" on the "SignUpPage"
    #And User clicks on the "Day 14" on the "SignUpPage"
    And User enters $$[testDataFile]userPassword on the "Password Field" on "SignUpPage"
    And User selects value "4" from dropdown "Day of Birth" on the "SignUpPage"
    And User selects value "May" from dropdown "Month of Birth" on the "SignUpPage"
    And User selects value "1999" from dropdown "Year of birth" on the "SignUpPage"
    And User enters "Arun" on the "First Name field" on "SignUpPage"
    And User enters "Joseph" on the "Last Name field" on "SignUpPage"
    And User enters "XYZ" on the "Company field" on "SignUpPage"
    And User enters "Address 1" on the "Address 1 field" on "SignUpPage"
    And User enters "Address 2" on the "Address 2 field" on "SignUpPage"

    And User selects value "Canada" from dropdown "Country dropdown" on the "SignUpPage"
    And User enters "Kerala" on the "State field" on "SignUpPage"
    And User enters "Pala" on the "City field" on "SignUpPage"
    And User enters "659610" on the "Zip code field" on "SignUpPage"
    And User enters "9990008718" on the "Mobile Number field" on "SignUpPage"
    And User clicks on the "Create Account" on the "SignUpPage"
    And User verifies "Account created Message" is displayed on the "SignUpPage"
    And User clicks on the "Continue button" on the "SignUpPage"
    And User verifies "Logged in user name" is displayed on the "HomePage"
    And User clicks on the "Delete Account" on the "HomePage"
    And User verifies "Account Deleted Message" is displayed on the "SignUpPage"
    And User clicks on the "Continue button" on the "SignUpPage"
    
    
    
    
    
    
    
    


