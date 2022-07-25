@Searchhotel
Feature: Verifying Adactin Search Hotel details

  Scenario Outline: Verifying Adactin search hotels select all fields
    Given User is on the Adactin page
    When User should perform login"<username>","<password>"
    Then User should verify after login "Hello Aadhibommie!"
    And User should search Hotels"<Location>","<Hotels>","<Room_Type>","<Number_of_Rooms>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>"and"<Children_per_Room>"
    Then User should verify after Search Hotels "Select Hotel"

    Examples: 
      | username    | password   | Location | Hotels      | Room_Type | Number_of_Rooms | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | Aadhibommie | bommikutty | Sydney   | Hotel Creek | Double    | 1 - One         | 22/06/2022    | 23/06/2022     | 1 - One         | 2 - Two           |

  Scenario Outline: Verifying Adactin search hotels enter manatory fields
    Given User is on the Adactin page
    When User should perform login"<username>","<password>"
    Then User should verify after login "Hello Aadhibommie!"
    And User should enter manatory fields only "<Location>","<Number_of_Rooms>","<Check_In_Date>","<Check_Out_Date>"and"<Adults_per_Room>"
    Then User should verify after Search Hotels "Select Hotel"

    Examples: 
      | username    | password   | Location | Number_of_Rooms | Check_In_Date | Check_Out_Date | Adults_per_Room |
      | Aadhibommie | bommikutty | Sydney   | 1 - One         | 22/06/2022    | 23/06/2022     | 1 - One         |

  Scenario Outline: Verifying Adactin search hotels page entering invalid dates
    Given User is on the Adactin page
    When User should perform login"<username>","<password>"
    Then User should verify after login "Hello Aadhibommie!"
    And User should search Hotels"<Location>","<Hotels>","<Room_Type>","<Number_of_Rooms>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>"and"<Children_per_Room>"
    Then User should verify after Search Hotels page checking Error Message "Check-In Date shall be before than Check-Out Date"and"Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username    | password   | Location | Hotels      | Room_Type | Number_of_Rooms | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | Aadhibommie | bommikutty | Sydney   | Hotel Creek | Double    | 1 - One         | 20/06/2023    | 21/06/2022     | 1 - One         | 2 - Two           |

  Scenario Outline: Verifying Adactin search hotels page without select any fields
    Given User is on the Adactin page
    When User should perform login"<username>","<password>"
    Then User should verify after login "Hello Aadhibommie!"
    And User should search Hotels without select any fields
    Then User should verify after Search Hotel Error message in location "Please Select a Location"

    Examples: 
      | username    | password   |
      | Aadhibommie | bommikutty |
