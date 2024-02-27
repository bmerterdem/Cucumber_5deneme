package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
tags="SmokeTest",
features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions"   //sadecesmoketest etiketlileri calistirir

)

public class _03_Testrunnersmoke extends AbstractTestNGCucumberTests {
}
