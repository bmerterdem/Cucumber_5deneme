package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/giris.feature"},
        glue = {"StepDefinitions"}
)

public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
