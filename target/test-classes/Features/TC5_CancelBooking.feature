@CancelPage
Feature: Verifying Adactin Cancel booking  details

  Scenario Outline: Verifying Adactin cancel booking page
    Given User is on the Adactin page
    When User should perform login"<username>","<password>"
    Then User should verify after login "Hello Aadhibommie!"
    And User should search Hotels"<Location>","<Hotels>","<Room_Type>","<Number_of_Rooms>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>"and"<Children_per_Room>"
    Then User should verify after Search Hotels "Select Hotel"
    And User should select a Hotel
    Then User should verify after select Hotel page "Book A Hotel"
    And User should Book A Hotel "<First_Name>","<Last_Name>"and"<Billing_Address>"
      | CreditCardNo     | CreditCardType   | ExpiryMonth | ExpiryYear | CvvNumber |
      | 6787654567876545 | American Express | January     |       2022 |       565 |
      | 6787654567876545 | VISA             | February    |       2022 |       565 |
      | 6787654567876545 | Master Card      | March       |       2022 |       565 |
      | 6787654567876545 | Others           | April       |       2022 |       565 |
    Then User should verify the message after Book Hotel in booking confirmation page"Booking Confirmation"
    And User should cancel the order id
    Then User should verify the order id cancelled msg in Booked Itinerary page"The booking has been cancelled."

    Examples: 
      | username    | password   | Location | Hotels      | Room_Type | Number_of_Rooms | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room | First_Name | Last_Name | Billing_Addres |
      | Aadhibommie | bommikutty | Sydney   | Hotel Creek | Double    | 1 - One         | 22/07/2022    | 23/07/2022     | 1 - One         | 2 - Two           | Aadhithya  | Rajasekar | Thanjavur      |

  Scenario Outline: Verifying Adactin cancel booking page by cancelling existing order id
    Given User is on the Adactin page
    When User should perform login"<username>","<password>"
    Then User should verify after login "Hello Aadhibommie!"
    And User should cancel the booked order id"<Order_id>"
    Then User should verify the order id cancelled msg in Booked Itinerary page"The booking has been cancelled."

    Examples: 
      | username    | password   | Order_id   |
      | Aadhibommie | bommikutty | 08Y1J4S14W |
