package StepDefinitions;

import Pages.DialogCOntentttt;
import Pages.LeftNavv;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataTablestepsspecial {
    LeftNavv ln = new LeftNavv();
    DialogCOntentttt dc = new DialogCOntentttt();

    @And("CLick on the element in Leftnav")
    public void clickOnTheElementInLeftnav(DataTable itemss) {
        List<String> strbtns = itemss.asList(String.class);
        for (String str : strbtns) {
            WebElement element = ln.getWebElement(str);
            ln.clickFunction(element);
        }


    }

    @And("Click on the element Dialog")
    public void clickOnTheElementDialog(DataTable dt) {
        List<String> strbtns = dt.asList(String.class);
        for (String str : strbtns) {
            WebElement element = dc.getWebElement(str);
            dc.clickFunction(element);


        }
    }

    @And("user sending the keys in dialog content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List <List<String>>items=dt.asLists(String.class);
        for (int i = 0; i <items.size() ; i++) {
            WebElement element=dc.getWebElement(items.get(i).get(0));
            dc.sendkeysFunction(element,items.get(i).get(1));

        }

    }

    @And("user delete item from dialog content")
    public void userDeleteItemFromDialogContent(DataTable dt) {
        List<String> strbtns = dt.asList(String.class);
        for (String str : strbtns) {
            dc.deleteitem(str);

        }
    }
}