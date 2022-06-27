Feature: BddSpec
	Scenario: passing
		Given given
		When when
		Then param = "pass"

	Scenario: failedAssert
		Given given
		When when
		Then param = "failedAssert"

	Scenario: exception
		Given given
		When when
		Then param = "fail"

	Scenario: skipped
		Given given
		When when
		Then param = "skipByThrow"