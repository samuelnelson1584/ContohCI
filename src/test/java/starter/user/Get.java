package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    public String url = "https://reqres.in/api/";
    public Response response;

    @Step("I set GET api endpoints")//implementation
    public String setGetApiEndpoints() {
        return url + "users/2";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        response =  SerenityRest.given().when().get(setGetApiEndpoints());
    }

    @Step("I receive valid HTTP response code ")
    public void receiveValidHttpResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail user")
    public void receiveValidDataForDetailUser() {
        restAssuredThat(response -> response.body("'data'.'id'",  equalTo(2)));
        restAssuredThat(response -> response.body("'data'.'first_name'", equalTo("Janet")));
    }
}