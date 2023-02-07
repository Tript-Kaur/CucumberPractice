package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={ "src/test/java/Feature/loginReports.feature"},
        glue={"Steps","Hooks"},dryRun =false,
        plugin = {"pretty","html:target/HtmlReports",
                "json:target/report.json",
                "junit:target/report.xml"}
)
public class LoginReportsRunner {
}
