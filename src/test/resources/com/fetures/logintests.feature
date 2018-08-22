Feature: Test Login functionality

Background:
	Given the user goes to the home page

Scenario Outline: Login functionality
    
    When User loges in using username "<username>" and password "<password>"
    Then user should see map and following links:
            |kitchen      |
            |kilimanjaro  |
            |half dome    |
            |denali       |
            |meru         |
            |kuzzat's cave|
            |lobby        |
            |study area   |
            |4stay        |
            |ocean view   |
    
    Examples:
    |username                     |password	  |
    |efewtrell8c@craigslist.org   |jamesmay   |
  #  |mcossor8l@webmd.com          |cecilnacey |
   # |teachervamikemarcus@gmail.com|mikemarcus |
    
    
  
  Scenario: Test Login Functionality with invalid user name
  	When user enters invalid username "invaliduser@gmail.com" and "jamesmay" 
  	Then System should display "user with email: invaliduser@gmail.com doesn`t exist." message
  	
  	
  	
  Scenario: Test Login with invalid password
  	When User enters valid username "efewtrell8c@craigslist.org" and invalid password "invalid"
  	Then System should display error "invalid password." message
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
    