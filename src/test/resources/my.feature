Feature: my
  Scenario: pass
    Given given
    When param = "pass"
    Then then

  Scenario: skip
    Given given
    When param = "skip"
    Then then

  Scenario: fail
    Given given
    When param = "fail"
    Then then