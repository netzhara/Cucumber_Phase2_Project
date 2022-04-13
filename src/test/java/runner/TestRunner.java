package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/log.feature",
				 glue= {"stepDefinitions"},
				 tags = "@LoginWebsite",
				 plugin = {"pretty","html:target/ReportCucumber/cucumber.html",
						   "json:target/ReportJson/report.json",
						   "junit:target/ReportJUnitReport/report.xml"})
public class TestRunner {

}
