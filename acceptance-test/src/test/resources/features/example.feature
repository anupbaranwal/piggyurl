@Piggyurl
Feature: User would like to get piggyurls
  Background:
    Given the following piggyurls exists in the library
      | code | description                 |
      | 1    | Twinkle twinkle little star |
      | 2    | Johnny Johnny Yes Papa      |

  Scenario: User should be able to get all piggyurls
    When user requests for all piggyurls
    Then the user gets the following piggyurls
      | code | description                 |
      | 1    | Twinkle twinkle little star |
      | 2    | Johnny Johnny Yes Papa      |

  Scenario: User should be able to get piggyurls by code
    When user requests for piggyurls by code "1"
    Then the user gets the following piggyurls
      | code | description                 |
      | 1    | Twinkle twinkle little star |

  Scenario: User should get an appropriate NOT FOUND message while trying get piggyurls by an invalid code
    When user requests for piggyurls by id "10000" that does not exists
    Then the user gets an exception "Piggyurl with code 10000 does not exist"