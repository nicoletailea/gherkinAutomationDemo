Feature: BddSpec
	Scenario: pass
		Given given
		When when
		Then param = "pass"

	@Exclude
	Scenario: skip
		Given given
		When when
		Then param = "skip"

	Scenario: fail
		Given given
		When when
		Then param = "fail"

	Scenario: skip2
		Given gi

	Scenario: skip
		Given given
		When when
		Then param = "skipByThrow"