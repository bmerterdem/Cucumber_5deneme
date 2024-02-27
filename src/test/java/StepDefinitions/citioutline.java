package StepDefinitions;

import Pages.DialogCOntentttt;
import Pages.LeftNavv;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class citioutline {
    LeftNavv ln=new LeftNavv();
    DialogCOntentttt dc=new DialogCOntentttt();
    @And("navigate to citizenship page")
    public void navigateToCitizenshipPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.citizenship);
    }

    @When("user a citi name as {string} short name as {string}")
    public void userACitiNameAsShortNameAs(String name, String shortname) {
        dc.clickFunction(dc.addbutton);
        dc.sendkeysFunction(dc.nameinput,name);
        dc.sendkeysFunction(dc.shortname,shortname);
        dc.clickFunction(dc.savebutton);
    }

    @Then("already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyexists,"already");
    }

    @When("user delete the {string}")
    public void userDeleteThe(String searchText) {
        dc.deleteitem(searchText);
    }
}
