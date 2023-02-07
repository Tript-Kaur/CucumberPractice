Feature:  To Test Login Functionality

#  parameter type: DataTable in feature file   for single scenario

  Scenario Outline:Login with correct UserName Password
    Given User is on Login Page "https://www.saucedemo.com/"
    When User enters "<UserName>" and "<Password>" in Fields
    And clicks on login Button shown
    Then Launch HomePage after this
    Examples:
      | UserName                | Password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |







