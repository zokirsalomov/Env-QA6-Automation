Feature: Test Login functionality


Scenario Outline: Login functionality
    Given the user goes to the home page
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
    
    
    