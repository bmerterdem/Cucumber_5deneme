package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class datatables {
    @When("write username {string}")
    public void writeUsername(String username) {
        System.out.println("username = " + username);
    }

    @And("write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println("username and pass= " + username+" "+ password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable elemanlar) {
        List<String> listelemanlar=elemanlar.asList(String.class);
        for (String u:listelemanlar)
            System.out.println("u = " + u);
    }

    @And("Write username and password as Datatables")
    public void writeUsernameAndPasswordAsDatatables(DataTable elemanlar) {
        List<List<String>>listelemanlar=elemanlar.asLists(String.class);
        for (int i = 0; i <listelemanlar.size() ; i++) {
            System.out.println("listElemanlar="+listelemanlar.get(i).get(0)+" "+listelemanlar.get(i).get(1));

        }
    }
}
