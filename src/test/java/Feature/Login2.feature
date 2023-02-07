Feature:  To Test Login Functionality
  Scenario:Login with correct UserName Password
    Given User is on Login Page
    When User enters "UserName" and "Password" in Fields
    And clicks on login Button
    Then Launch HomePage

#  parameter type in feature file ""  for single scenario
