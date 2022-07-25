@SelectHotel
Feature: Verifying Adactin Select Hotel details

  Scenario Outline: Verifying Adactin Select Hotels select all fields
    Given User is on the Adactin page
    When User should perform login"<username>","<password>"
    Then User should verify after login "Hello Aadhibommie!"
    And User should search Hotels"<Location>","<Hotels>","<Room_Type>","<Number_of_Rooms>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>"and"<Children_per_Room>"
    Then User should verify after Search Hotels "Select Hotel"
    And User should select a Hotel
    Then User should verify after select Hotel page "Book A Hotel"

    Examples: 
      | username    | password   | Location | Hotels      | Room_Type | Number_of_Rooms | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | Aadhibommie | bommikutty | Sydney   | Hotel Creek | Double    | 1 - One         | 22/06/2022    | 23/06/2022     | 1 - One         | 2 - Two           |

  Scenario Outline: Verifying Adactin Select Hotels without fields
    Given User is on the Adactin page
    When User should perform login"<username>","<password>"
    Then User should verify after login "Hello Aadhibommie!"
    And User should search Hotels"<Location>","<Hotels>","<Room_Type>","<Number_of_Rooms>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>"and"<Children_per_Room>"
    Then User should verify after Search Hotels "Select Hotel"
    And User should select Hotels without any fields
    Then User should click and continue without select any Hotel fields error in select Hotel "Please Select a Hotel"

    Examples: 
      | username    | password   | Location | Hotels      | Room_Type | Number_of_Rooms | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | Aadhibommie | bommikutty | Sydney   | Hotel Creek | Double    | 1 - One         | 22/06/2022    | 23/06/2022     | 1 - One         | 2 - Two           |
