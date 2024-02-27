Feature: Country Multii Scenario
  Background:
    Given nav to cmp
    When enter u and p
    Then user success
    And navigate to country page
    @Regression
    Scenario: create country
      When create a country
      Then success mesaage should be display
      Scenario: create country 2
        When create a country name as "mert31231" code as "190323"
        Then success mesaage should be display