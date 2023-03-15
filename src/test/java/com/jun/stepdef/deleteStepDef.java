package com.jun.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class deleteStepDef {
    @Given("https reqres.in can access")
    public void httpsReqresInCanAccess() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    @When("Request Deleted User Sending user id : {int}")
    public void requestDeletedUserSendingUserId(int UserId) {

        given().log().all()
                .when().delete("https://reqres.in/api/users/" + UserId)
                .then()
                .log().all()
                .assertThat().statusCode(204);
    }


    @Then("Reduced list of users")
    public void reducedListOfUsers() {
    }
}
