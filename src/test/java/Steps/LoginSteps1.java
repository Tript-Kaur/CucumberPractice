
package Steps;

import cucumber.api.java.en.*;

public class LoginSteps1 {
    @Given("^User is on Login Page$")
    public void userIsOnLoginPage() {
        System.out.println("Given");
    }
    @When("User enters UserName and Password in Fields")
    public void userEntersUserNameAndPasswordInFields() {
        System.out.println("When *********************");
    }

    @And("clicks on login Button")
    public void clicksOnLoginButton() {  System.out.println("And");
    }

    @Then("Launch HomePage")
    public void launchHomePage() {  System.out.println("Then1");
    }

    @Then("Throw Exception Incorrect Credentials")
    public void throwExceptionIncorrectCredentials() {  System.out.println("Then2");
    }
}

