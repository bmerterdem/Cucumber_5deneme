package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/giris.feature","src/test/java/FeatureFiles/countryy.feature"},
        glue ={"StepDefinitions"}
)

public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {
}
