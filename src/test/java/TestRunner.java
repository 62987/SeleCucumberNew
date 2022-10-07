import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Feature"},
        glue = {"StepDefination"},
        plugin = {"html:target/QA-Automation-html-report.html","json:target/QA_Automation.json"},
        monochrome = true,
        tags = "@login"

)

public class TestRunner {
}
