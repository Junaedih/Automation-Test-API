package com.jun.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.json.JSONObject;

public class postStepDef {

    String valueName;
    String valueJob;

    @Given("https:reqres.in can access")
    public void httpsReqresInCanAccess() {
        RestAssured
                .baseURI = "https://reqres.in/";

    }



    @When("post request send name {string}")
    public void postRequestSend(String valueName) {

        String valueJob = "QA Engineer";

        JSONObject bodyObj = new JSONObject();
        bodyObj.put("name", valueName);
        bodyObj.put("job", valueJob);

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(bodyObj.toString())

                .when()
                .post("https://reqres.in/api/users")

                .then().log().all()
                .assertThat().statusCode(201)
                .assertThat().body("name", Matchers.equalTo(valueName))
                .assertThat().body("job", Matchers.equalTo(valueJob));

    }


    @Then("the list of users increases")
    public void theListOfUsersIncreases() {
    }
}
