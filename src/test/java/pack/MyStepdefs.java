package pack;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.jshell.spi.ExecutionControl;
import org.junit.Assert;

public class MyStepdefs {
    @Given("given")
    public void given() {
    }

    @When("when")
    public void when() {
    }

    @Then("then")
    public void then() {
    }

    @When("param = {string}")
    public void param(String string) throws Exception {
        switch (string) {
            case "pass":
                System.out.println("Success");
                break;
            case "fail":
                throw new Exception();
            case "skip":
                Assert.assertEquals(1, 2);
        }
    }

    }
