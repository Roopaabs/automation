package runner;



import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/feature", // Path to your feature files
    glue = "stepDefinations",                // Package name for step definitions
    plugin = {"pretty", "html:target/cucumber-reports"}, // Plugins for report generation
    monochrome = true                                               // Readable console output
)


public class CucumberTest {

}
