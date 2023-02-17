package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class HomeStep {
    @Given("User open application")
    public void user_open_application() {
        System.out.println("Hi");
    }
    @When("User on welcome screen")
    public void user_on_welcome_screen() {
        System.out.println("Hello");

    }
    @When("I login with {string} and {string}")
    public void i_login_with_and(String userName, String password) {
        System.out.println("My credentials : :" + userName +" "+  "and"+" "  + password);

    }
    @Given("I entered my credentials")
    public void i_entered_my_credentials(DataTable dataTable) {

        List<List<String>> list = dataTable.asLists(String.class);
        System.out.println(list.get(0).get(0));

    }
    @Then("I verify login failed")
    public void i_verify_login_failed() {

    }
}
