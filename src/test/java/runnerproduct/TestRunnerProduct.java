package runnerproduct;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/product.feature",
				 glue = {"stepDefinitionProduct"},
				 tags = "@Regression",
				 plugin = {"pretty","html:target/CucumberReport/cucumber.html",
						 "json:target/JsonReport/report.json",
						 "junit:target/JUnitReport/report.xml"}
			 	 )

public class TestRunnerProduct {

}
