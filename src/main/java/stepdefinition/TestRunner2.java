package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\java\\failedscenarios.txt",strict = false, dryRun = false, glue = "stepdefinition", monochrome = true, plugin = 
		"html:target")
public class TestRunner2 {

}
