package pack;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results\\MyTest_OctaneGherkinResults.xml",
                features="src/test/resources/DE bdd 2_24002.feature")
public class MyTest2 {
}
