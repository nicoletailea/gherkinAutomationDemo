package pack;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("Angenommen")
    public void angenommen() {
        System.out.println("angenommen");
    }

    @When("wenn")
    public void wenn() {
        System.out.println("Wenn");
    }

    @Then("dann")
    public void dann() {
        System.out.println("Dann");
    }

    /*@When("param = {string}")
    public void param(String string) throws Exception {
        switch (string) {
            case "pass":
                System.out.println("Success");
                break;
            case "fail":
                throw new Exception("Failing test");
            case "failedAssert":
                Assert.assertEquals("Test with failing assertion", 1, 2);
            case "skipByThrow":
                throw new PendingException();
        }
    }*/

    }
