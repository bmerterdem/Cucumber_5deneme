package StepDefinitions;

import Utilities.GWDD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class hooks {
    @After
    public void after(Scenario senaryo){
        System.out.println("senaryo bitti");
        if(senaryo.isFailed()){
            TakesScreenshot ts=(TakesScreenshot) GWDD.getDriver();
            byte[] hafizadakihali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakihali,"image/png","screenshot name");

        }






        GWDD.quitdriver();
    }
}
