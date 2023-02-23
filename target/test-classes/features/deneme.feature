Feature: deneme_feature_file


  Scenario: TC01_DenemeTestCase
    When user goes to Google url
    And user searches for iPhone
    Then user verifies that the results related to iPhone
    And user closes the browser