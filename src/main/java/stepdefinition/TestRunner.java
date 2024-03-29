package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features", tags = {}, strict = false, dryRun = false, glue = "stepdefinition", monochrome = true, plugin = "html:target")
public class TestRunner {

}
