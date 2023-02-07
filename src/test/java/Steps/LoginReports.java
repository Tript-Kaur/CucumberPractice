package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class LoginReports {
    @Given("^User on Login Page$")
    public void user_on_Login_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
           }
    @When("^enters <UserName> and <Password>$")
    public void enters_UserName_and_Password(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<List<String>> l=arg1.raw();
        for(List<String> el:l) {
            for (String s : el)
                System.out.print(s + "\t");
            System.out.println();
        }  }
    @When("^clicks login Button$")
    public void clicks_login_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("^HomePage$")
    public void homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}
