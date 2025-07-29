Feature: LoggedIn User View

  Scenario: Validate user is able to view after log in
    Given User is in the Login page
    When User successfully enters the log in details
    Then User should be able to view the home page