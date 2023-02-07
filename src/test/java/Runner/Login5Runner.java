package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={ "src/test/java/Feature/Login5.feature"},
        glue={"Steps","Hooks"},dryRun =false)
public class Login5Runner {

}
