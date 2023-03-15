package com.jun.stepdef;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class getStepDef {


    @Given("can access https:reqres.in")
    public void canAccessHttpsReqresIn() {

        RestAssured
       .baseURI = "https://reqres.in/";
    }

    @When("get request page {int}")
    public void getRequestPage(int Pages) {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users?page=" + Pages)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("page", Matchers.equalTo(+ Pages));


}

    @Then("list users page on displayed")
    public void listUsersPageOnDisplayed() {

    }




    @Then("list users not displayed")
    public void listUsersNotDisplayed() {
    }

    @When("get request single user id {int}")
    public void getRequestSingleUserId(int UserID) {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/" + UserID)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo( + UserID));

    }

    @Then("specific single user displayed")
    public void specificSingleUserDisplayed() {
    }




}
