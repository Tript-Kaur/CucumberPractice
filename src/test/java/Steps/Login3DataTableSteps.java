/*
package Steps;



import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;


public class Login3DataTableSteps
{
        @Given("^User is on Login Page \"([^\"]*)\"$")
        public void userIsOnLoginPage(String arg0) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            //      throw new cucumber.api.PendingException();
        }
        @When("^User enters <UserName> and <Password> in Fields$")
        public void user_enters_UserName_and_Password_in_Fields(DataTable arg1) throws Throwable {
                // Write code here that turns the phrase above into concrete actions
                // For automatic transformation, change DataTable to one of
                // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
                // E,K,V must be a scalar (String, Integer, Date, enum etc)
               // throw new PendingException();

                List<List<String>> l=arg1.raw();
                for(List<String> el:l) {
                        for (String s : el)
                                System.out.print(s + "\t");
                        System.out.println();
                }
        }

        @And("^clicks on login Button$")
        public void clicksOnLoginButton() {
        }

        @Then("^Launch HomePage$")
        public void launchHomePage() {
        }
        }
*/
