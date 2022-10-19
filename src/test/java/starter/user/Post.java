package starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    public String url = "https://reqres.in/api/";
    public Response response;

    @Step("I set POST api endpoints")
    public String setPostApiEndpoints() {
        return url + "users";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "morpheus");
        requestBody.put("job", "leader");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoints());
    }

    @Step("I receive valid HTTP response code 201")
    public void receiveValidHttpResponseCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for new user")
    public void receiveValidDataForNewUser() {
        restAssuredThat(response -> response.body("'name'",  equalTo("morpheus")));
        restAssuredThat(response -> response.body("'job'", equalTo("leader")));
    }

}