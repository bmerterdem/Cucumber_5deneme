package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@Regression",
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions"  ,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
//sadecesmoketest etiketlileri calistirir
public class _05_extendReport extends AbstractTestNGCucumberTests{

}