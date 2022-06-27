Feature: BddSpec
	Scenario: pass
		Given given
		When when
		Then param = "pass"

	@Exclude
	Scenario: failedAssert
		Given given
		When when
		Then param = "failedAssert"

	Scenario: exception
		Given given
		When when
		Then param = "fail"

	Scenario: skip
		Given given
		When when
		Then param = "skipByThrow"