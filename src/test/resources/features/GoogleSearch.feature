Feature: Google Page Title Check

  Scenario: Verify Google page title
    Given I open the Chrome browser
    When I navigate to "https://www.google.com"
    Then The page title should be "Google"
    And I close the browser