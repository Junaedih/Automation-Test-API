package com.jun.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class patchStepDef {
    @Given("link url https reqres.in can access")
    public void linkUrlHttpsReqresInCanAccess() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    @When("Patch Request User Sending user id : {int}")
    public void patchRequestUserSendingUserIdInt(int userId) {
        //int userId = 3;
        String newName = "Junaedih";

        //test patch user id 3 --> update first name
        //first, get the firstb name user id 3
        String fname = given().when().get("https://reqres.in/api/users/" + userId)
                .getBody().jsonPath().get("data.first_name");
        System.out.println("name before = " + fname);


        //change the first name to "updateUser"
        //create body request with HashMap and convert it to json
        HashMap<String, String> bodyMap = new HashMap<>();
        bodyMap.put("first_name", newName);
        JSONObject jsonObject = new JSONObject(bodyMap);

        given().log().all()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .patch("https://reqres.in/api/users/" + userId)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("first_name", Matchers.equalTo(newName));
    }

    @Then("List users updated")
    public void listUsersUpdated() {
    }
}
