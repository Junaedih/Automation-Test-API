package com.jun.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class putStepDef {
    @Given("reqres.in can access")
    public void reqresInCanAccess() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    @When("PUT request sending ID {int}")
    public void putRequestSending( int userId) {
        //int userId = 2;
        String newName = "Junaedih";
        // put update user id 2 --> update firstname
        // first, get attribute user id 2

        String fname = given().when().get("https://reqres.in/api/users/" + userId).getBody().jsonPath().get("data.first_name");
        String lname = given().when().get("https://reqres.in/api/users/" + userId).getBody().jsonPath().get("data.last_name");
        String avatar = given().when().get("https://reqres.in/api/users/" + userId).getBody().jsonPath().get("data.avatar");
        String email = given().when().get("https://reqres.in/api/users/" + userId).getBody().jsonPath().get("data.email");
        System.out.println("name before" + fname);


        // change the first name to "Junaedih"
        //create body request with hashMap and convert it to json

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", userId);
        bodyMap.put("email", email);
        bodyMap.put("first_name", newName);
        bodyMap.put("last_name", lname);
        bodyMap.put("avatar", avatar);
        JSONObject jsonObject = new JSONObject(bodyMap);

        given().log().all()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .put("https://reqres.in/api/users/" + userId)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("first_name", Matchers.equalTo(newName));
    }

    @Then("List Users ID Updated")
    public void listUsersIDUpdated() {
    }
}
