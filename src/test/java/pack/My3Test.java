package pack;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results\\MyTest_OctaneGherkinResults.xml",
                features="src/test/resources/f3")
public class My3Test {
}
