/*
package StepsTestPOM;

import PageObjectModel.HomePagePOM;
import PageObjectModel.LoginPagePOM;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPOMSteps {
    private static  WebDriver driver=null;
    private static LoginPagePOM loginObject;
    private static HomePagePOM homePageObject;

    @Before
    public void driverInitialization()
    { WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       homePageObject=new HomePagePOM(driver);
       loginObject=new LoginPagePOM(driver);
    }
    @Given("^Browser is Open$")
    public void browserIsOpen() {
        driver.get("https://example.testproject.io/web/");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @And("^User is on login page$")
    public void userIsOnLoginPage() {

            }

    @When("^ser enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void serEntersAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginObject.loginProcess(arg0,arg1);
    }

    @And("^clicks on Login button$")
    public void clicksOnLoginButton() {
    }

    @Then("^user is navigated to homepage$")
    public void userIsNavigatedToHomepage() {

        Assert.assertTrue(homePageObject.CheckLogOutisDisplayed());
    }
}
*/
