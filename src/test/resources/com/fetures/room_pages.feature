Feature: Test Room schedules

@temp
Scenario Outline: Scheduled rooms
    Given user logs in with valid credentials
    When user clicks on "<room>"
    Then user should see booked daily schedule for selected "<room>"
        
            Examples:
            |room         |
            |kilimanjaro  |
            #|half dome    |
            #|denali       |
            #|meru         |