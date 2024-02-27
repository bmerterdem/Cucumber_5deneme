Feature: citi functionality
  Background:
  Background:
    Given nav to cmp
    When enter u and p
    Then user success
    And navigate to citizenship page
    Scenario Outline: citi create
      When user a citi name as "<name>" short name as "<short>"
      Then success mesaage should be display

      When  user a citi name as "<name>" short name as "<short>"
      Then already exist message should be displayed
      When user delete the "<name>"
      Then success mesaage should be display
      Examples:
        |name  |short|
      |mertulss34554k12  |mer5454ss54t23433|
      |mertu554ss23212lk2 |me5454rsst1223233|
