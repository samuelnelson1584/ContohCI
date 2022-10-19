package starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    public String url = "https://reqres.in/api/";
    public Response response;


    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndpoints() {
        return url + "users/2";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().when().delete(setDeleteApiEndpoints());
    }

    @Step("I receive valid HTTP response code 204")
    public void receiveValidHttpResponseCode204() {
        restAssuredThat(response -> response.statusCode(204));
    }
//    @Step("I set GET api endpoints")//implementation
//    public String setGetApiEndpoints() {
//        return url + "users/2";
//    }
//
//    @Step("I send GET HTTP request")
//    public void sendGetHttpRequest() {
//        response =  SerenityRest.given().when().get(setGetApiEndpoints());
//    }
//
//    @Step("I receive valid HTTP response code ")
//    public void receiveValidHttpResponseCode() {
//        restAssuredThat(response -> response.statusCode(200));
//    }

}
