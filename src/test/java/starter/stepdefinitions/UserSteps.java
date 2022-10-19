package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;
import starter.user.Get;
import starter.user.Post;
import starter.user.Put;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    Put put;

    @Steps
    Delete delete;

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints() {
        get.setGetApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode() {
        get.receiveValidHttpResponseCode();
    }

    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser() {
        get.receiveValidDataForDetailUser();
    }


    @Given("I set POST api endpoints")
    public void setPostApiEndpoints() {
        post.setPostApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttpResponseCode201() {
        post.receiveValidHttpResponseCode201();
    }

    @And("I receive valid data for new user")
    public void receiveValidDataForNewUser() {
        post.receiveValidDataForNewUser();
    }

    @Given("I set PUT api endpoints")
    public void setPutApiEndpoints() {
        put.setPutApiEndpoints();
    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest() {
        put.sendPutHttpRequest();
    }

    @And("I receive valid data for updated user")
    public void  receiveValidDataForUpdatedUser() {
        put.receiveValidDataForUpdatedUser();
    }

    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints() {
        delete.setDeleteApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        delete.sendDeleteHttpRequest();
    }

    @Then("I receive valid HTTP response code 204")
    public void receiveValidHttpResponseCode204() {
        delete.receiveValidHttpResponseCode204();
    }
}