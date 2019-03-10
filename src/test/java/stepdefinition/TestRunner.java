package stepdefinition;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefinition" }, plugin = {
		"html:target","json:src/test/java/pack2/report.json" }, monochrome = true, dryRun = false, strict = true)

public class TestRunner {

}
