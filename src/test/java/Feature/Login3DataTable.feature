Feature:  To Test Login Functionality

#  parameter type: DataTable in feature file   for single scenario

  Scenario:Login with correct UserName Password
    Given User is on Login Page "https://www.saucedemo.com/"
    When User enters "<UserName>" and "<Password>" in Fields
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

    And clicks on login Button
    Then Launch HomePage
