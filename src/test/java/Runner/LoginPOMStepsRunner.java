package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={ "src/test/java/Feature/LoginPOM.feature"},
        glue={"StepsTestPOM"},dryRun =false)
public class LoginPOMStepsRunner {

}
