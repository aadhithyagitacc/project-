@login
Feature: Verifying Adactin Login Hotel details

  Background: 
    Given User is on the Adactin page

  Scenario Outline: Verifying Adactin login with valid credentials
    When User should perform login"<username>","<password>"
    Then User should verify after login "Hello Aadhibommie!"

    Examples: 
      | username    | password   |
      | Aadhibommie | bommikutty |

  Scenario Outline: Verifying Adactin login with valid credentials
    When User should perform login"<username>","<password>" with enter key
    Then User should verify after login "Hello Aadhibommie!"

    Examples: 
      | username    | password   |
      | Aadhibommie | bommikutty |

  Scenario Outline: Verifying Adactin login with invalid credentials
    When User should perform login"<username>","<password>"
    Then User should verify after login error msg "Invalid Login details or Your Password might have expired."

    Examples: 
      | username    | password  |
      | Aadhibommie | bommi1234 |
