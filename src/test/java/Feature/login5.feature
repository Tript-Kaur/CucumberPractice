Feature:  To Test Login Functionality

  Scenario Outline:Login with correct UserName Password
    Given Login Page
    When UserName and Password
    And login Button
    Then HomePage
    Examples:
      |One|
      |Two|
      |Three|

