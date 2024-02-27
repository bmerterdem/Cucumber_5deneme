package StepDefinitions;

import Pages.DialogCOntentttt;
import Utilities.GWDD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _loginstepsss {
    DialogCOntentttt dc=new DialogCOntentttt();
    @Given("nav to cmp")
    public void navToCmp() {
        GWDD.getDriver().get("https://test.mersys.io/");
        GWDD.getDriver().manage().window().maximize();
    }

    @When("enter u and p")
    public void enterUAndP() {

        WebDriverWait wait=new WebDriverWait(GWDD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(dc.username));
        dc.sendkeysFunction(dc.username,"turkeyts");
        dc.sendkeysFunction(dc.password, "TechnoStudy123");
        dc.clickFunction(dc.lgnbttn);
    }

    @Then("user success")
    public void userSuccess() {
        dc.verifyContainsTextFunction(dc.txtTechnostudy, "Internship");



    }
}
