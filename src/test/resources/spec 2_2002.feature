#Auto generated Octane revision tag
Feature: BddSpec
	Scenario: passing
		Given given
		When when
		Then param = "pass"

	Scenario: exception
		Given given
		When when
		Then param = "fail"

	Scenario: skipped
		Given given
		When when
		Then param = "skipByThrow"
		