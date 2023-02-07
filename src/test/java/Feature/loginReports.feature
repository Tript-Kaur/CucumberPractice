Feature:  To Test Login Functionality

  Scenario:Login with correct UserName Password
    Given User on Login Page
    When enters <UserName> and <Password>
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

    And clicks login Button
    Then HomePage
