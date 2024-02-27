Feature: country Functionality
  Scenario: create country
    Given nav to cmp
    When enter u and p
    Then user success
    And navigate to country page
    When create a country
    Then success mesaage should be display
