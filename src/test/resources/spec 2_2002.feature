Feature: BddSpec
	Scenario: pass
		Given given
		When when
		Then param = "pass"

	Scenario: skip
		Given given
		When when
		Then param = "skip"

	Scenario: fail
		Given given
		When when
		Then param = "fail"
