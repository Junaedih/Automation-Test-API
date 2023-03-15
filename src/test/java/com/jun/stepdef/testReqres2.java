package com.jun.stepdef;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class testReqres2 {

    @Test
    public void TC_001_GET_ListUsersPerPage() {

        for (int Page = 1; Page < 3; Page++) {

            RestAssured
                    .given().when()
                    .get("https://reqres.in/api/users?page=" + Page)
                    .then().log().all()
                    .assertThat().statusCode(200)
                    .assertThat().body("page", Matchers.equalTo(+ Page));
        }
          }

    @Test
    public void TC_002_GET_Single_User () {

        for (int userID = 1; userID < 13; userID++) {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/" + userID)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(+ userID));

    }
                }


    @Test
    public void TC_003_Negative_Test_GET_User() {

        // not found user id 13
        // Expected Status Code : 404

        int UserID = 13;
        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/" + UserID)
                .then().log().all()
                .assertThat().statusCode(404);
    }


    @Test
    public void TC_004_POST_Create_User() {

        String valueName = "Junaedih";
        String valueJob = "QA Engeneer";

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

    @Test
    public void TC_005_PUT_User() {
        //define base URI
        RestAssured.baseURI = "https://reqres.in/";

        //data to update
        int userId = 2;
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

    @Test
    public void TC_006_PATCH_User() {
        //define baseURI
        RestAssured.baseURI = "https://reqres.in/";
        // data to update
        int userId = 3;
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

    @Test
    public void TC_007_DELETE_User() {
        //define baseURI
        RestAssured.baseURI = "https://reqres.in/";

        //data to delete
        int userToDelete = 4;

        //test delete api user 4
        given().log().all()
                .when().delete("https://reqres.in/api/users/" + userToDelete)
                .then()
                .log().all()
                .assertThat().statusCode(204);
    }

}
