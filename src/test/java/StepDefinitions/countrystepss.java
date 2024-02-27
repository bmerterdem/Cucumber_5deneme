package StepDefinitions;

import Pages.DialogCOntentttt;
import Pages.LeftNavv;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class countrystepss {
    LeftNavv ln=new LeftNavv();
    DialogCOntentttt dc=new DialogCOntentttt();
    @And("navigate to country page")
    public void navigateToCountryPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.countries);
    }

    @When("create a country")
    public void createACountry() {
        String ulkeadi= RandomStringUtils.randomAlphanumeric(8);
        String ulkekodu=RandomStringUtils.randomAlphanumeric(4);
        dc.clickFunction(dc.addbutton);
        dc.sendkeysFunction(dc.nameinput,ulkeadi);
        dc.sendkeysFunction(dc.codeinput,ulkekodu);
        dc.clickFunction(dc.savebutton);

    }

    @Then("success mesaage should be display")
    public void successMesaageShouldBeDisplay() {
        dc.verifyContainsTextFunction(dc.successMessage,"successfully");
    }

    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.clickFunction(dc.addbutton);
        dc.sendkeysFunction(dc.nameinput,name);
        dc.sendkeysFunction(dc.codeinput,code);
        dc.clickFunction(dc.savebutton);

    }
}
