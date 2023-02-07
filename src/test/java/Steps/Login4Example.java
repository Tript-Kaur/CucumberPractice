package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login4Example {
    @Given("^User is on Login Page \"([^\"]*)\"$")
    public void userIsOnLoginPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
        System.out.printf(arg0+"\t");
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" in Fields$")
    public void userEntersAndInFields(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println(arg0+"  "+arg1);
    }

    @And("^clicks on login Button shown$")
    public void clicksOnLoginButtonShown() {
    }

    @Then("^Launch HomePage after this$")
    public void launchHomePageAfterThis() {
    }
}
