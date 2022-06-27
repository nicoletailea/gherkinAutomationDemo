package pack;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("given")
    public void given() {
        System.out.println("Given");
    }

    @When("when")
    public void when() {
        System.out.println("When");
    }

    @Then("then")
    public void then() {
        System.out.println("Then");
    }

    @When("param = {string}")
    public void param(String string) throws Exception {
        switch (string) {
            case "pass":
                System.out.println("Success");
                break;
            case "fail":
                throw new Exception("Failing test");
            case "skip":
                Assert.assertEquals("Test with failing assertion", 1, 2);
            case "skipByThrow":
                throw new PendingException();
        }
    }

    }
