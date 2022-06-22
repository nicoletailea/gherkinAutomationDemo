Feature: name
	Scenario: pass
		Given given
		When when
		Then param = "pass"

	Scenario: fail
		Given given
		When when
		Then param = "fail"

	Scenario: skip
		Given given
		When when
		Then param = "skip"
