package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/resources/features",
					glue = {"com.spotify.stepDefinition"},
					plugin = {"pretty",
							"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
							"json:target/reports/reports.json",
							"html:target/reports/reports-html.html",
							"junit:target/reports/reports-html.xml"},
						monochrome = true)
public class TestRunner {

}
