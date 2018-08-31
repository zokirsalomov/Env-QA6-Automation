Feature: Test Room schedules

Background: 
	Given user logs in with valid credentials

@temp
Scenario Outline: Scheduled rooms
    When user clicks on "<room>"
    Then user should see booked daily schedule for selected "<room>"
        
            Examples:
            |room         |
            |kilimanjaro  |
            |half dome    |
            |denali       |
            |meru         |
            
           
Scenario Outline: Reserve a room
    When clicks on "<room>"
    When user verfies empty date and time on the schedule
    And user hunts for that same date and time in the hunt page
    Then user should see "<room>" name on the list of free spots
            
            Examples:
            |room       |
            |kilimanjaro|
            #|half dome  |
            #|denali     |
            #|meru       |
            
            
            
            
            
            
            
            
            
            
            
            