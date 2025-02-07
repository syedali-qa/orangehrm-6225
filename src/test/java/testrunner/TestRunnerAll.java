package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Syed Murthuza Ali/eclipse-workspace/AutomationFrameworks/prac6225/src/test/resources/Features/LoginPageUI.feature",
		glue = "stepdefinitions",
		tags = "@Smoke or @Sanity or @Regression",
		plugin = {"pretty","html:target/reports/report.html"},
//		dryRun = true,
		monochrome = true
		)



public class TestRunnerAll {

}
