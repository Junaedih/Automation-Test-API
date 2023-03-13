package apiauto;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class testReqres {


    @Test
    public static void TC_003_testGetListSingleUsersId1() {

        //JSONObject jsonObject = new JSONObject();
        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/1")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(1))
                .assertThat().body("data.email", Matchers.equalTo("george.bluth@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("George"))
                .assertThat().body("data.last_name", Matchers.equalTo("Bluth"));
    }

    @Test
    public void TC_001_testGetListUsersPage1() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users?page=1")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("per_page", Matchers.equalTo(6))
                .assertThat().body("page", Matchers.equalTo(1));

    }

    @Test
    public void TC_002_testGetListUsersPage2() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users?page=2")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("per_page", Matchers.equalTo(6))
                .assertThat().body("page", Matchers.equalTo(2));
    }

    @Test
    public void TC_004_testGetListSingleUsersId2() {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/2")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(2))
                .assertThat().body("data.email", Matchers.equalTo("janet.weaver@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Janet"))
                .assertThat().body("data.last_name", Matchers.equalTo("Weaver"));

    }

    @Test
    public void TC_005_testGetListSingleUsersId3() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/3")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(3))
                .assertThat().body("data.email", Matchers.equalTo("emma.wong@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Emma"))
                .assertThat().body("data.last_name", Matchers.equalTo("Wong"));
    }

    @Test
    public void TC_006_testGetListSingleUsersId4() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/4")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(4))
                .assertThat().body("data.email", Matchers.equalTo("eve.holt@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Eve"))
                .assertThat().body("data.last_name", Matchers.equalTo("Holt"));
    }

    @Test
    public void TC_007_testGetListSingleUsersId5() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/5")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(5))
                .assertThat().body("data.email", Matchers.equalTo("charles.morris@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Charles"))
                .assertThat().body("data.last_name", Matchers.equalTo("Morris"));
    }

    @Test
    public void TC_008_testGetListSingleUsersId6() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/6")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(6))
                .assertThat().body("data.email", Matchers.equalTo("tracey.ramos@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Tracey"))
                .assertThat().body("data.last_name", Matchers.equalTo("Ramos"));
    }

    @Test
    public void TC_009_testGetListSingleUsersId7() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/7")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(7))
                .assertThat().body("data.email", Matchers.equalTo("michael.lawson@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Michael"))
                .assertThat().body("data.last_name", Matchers.equalTo("Lawson"));
    }

    @Test
    public void TC_010_testGetListSingleUsersId8() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/8")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(8))
                .assertThat().body("data.email", Matchers.equalTo("lindsay.ferguson@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Lindsay"))
                .assertThat().body("data.last_name", Matchers.equalTo("Ferguson"));
    }

    @Test
    public void TC_011_testGetListSingleUsersId9() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/9")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(9))
                .assertThat().body("data.email", Matchers.equalTo("tobias.funke@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Tobias"))
                .assertThat().body("data.last_name", Matchers.equalTo("Funke"));
    }

    @Test
    public void TC_012_testGetListSingleUsersId10() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/10")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(10))
                .assertThat().body("data.email", Matchers.equalTo("byron.fields@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Byron"))
                .assertThat().body("data.last_name", Matchers.equalTo("Fields"));
    }

    @Test
    public void TC_013_testGetListSingleUsersId11() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/11")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(11))
                .assertThat().body("data.email", Matchers.equalTo("george.edwards@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("George"))
                .assertThat().body("data.last_name", Matchers.equalTo("Edwards"));
    }


    @Test
    public void TC_014_testGetListSingleUsersId12() {

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/12")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("data.id", Matchers.equalTo(12))
                .assertThat().body("data.email", Matchers.equalTo("rachel.howell@reqres.in"))
                .assertThat().body("data.first_name", Matchers.equalTo("Rachel"))
                .assertThat().body("data.last_name", Matchers.equalTo("Howell"));
    }

    @Test
    public void TC_015_negative_test_GetListSingleUsersId13() {

        // not found user id 13
        // Expected Status Code : 404

        RestAssured
                .given().when()
                .get("https://reqres.in/api/users/13")
                .then().log().all()
                .assertThat().statusCode(404);
    }


    @Test
    public void TC_016_testPostCreateUserNameJunaedihJobStudent() {

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
    public void TC_017_NegativeTestPostCreateUserWrongFormatHeaderValue() {
        // wrong header value = "application/json_x"
        // should be header value = "application/json"

        String valueName = "Alghazali";
        String valueJob = "QA Engeneer";

        JSONObject bodyObj = new JSONObject();
        bodyObj.put("name", valueName);
        bodyObj.put("job", valueJob);

        RestAssured
                .given()
                .header("Content-Type", "application/jsonx")
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
    public void TC_018_testPutUser() {
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
    public void TC_019_testPatchUser() {
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
    public void TC_020_testDeleteUser() {
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

    @Test
    public void TC_021_NegativeTestDeleteUserWrongPath() {

        // Wrong path : "htt://reqres.in/api/users_xxx/"
        // Should be : "https://reqres.in/api/users/"
        //define baseURI

        RestAssured.baseURI = "https://reqres.in/";
        //data to delete
        int userToDelete = 13;
        //test delete api user 13
        given().log().all()
                .when().delete("htt://reqres.in/api/users_xxx/" + userToDelete)
                .then()
                .log().all()
                .assertThat().statusCode(204);
    }


    @Test
    public void TC_022_testGetListUsersWithJsonSchema() {


        File jsonSchema = new File("src/test/resources/jsonSchema2/getListUserSchema2.json");

        RestAssured

                .given().when()
                .get("https://reqres.in/api/users?page=2")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("per_page", Matchers.equalTo(6))
                .assertThat().body("page", Matchers.equalTo(2))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

}
