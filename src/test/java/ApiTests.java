import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTests {

    @Test
    public void oneTest(){

        given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 73009,\n" +
                        "  \"name\": \"Myakula\",\n" +
                        "  \"status\": \"sold\"\n" +
                        "}")
                .log().all()
                .when()
                .post("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(73009))
                .body("name", equalTo("Myakula"))
                .body("status", equalTo("sold"));
    }


    @Test
    public void twoTest(){

        given()
                .baseUri("https://petstore.swagger.io/v2")
                .log().all()
                .when()
                .get("/pet/73009")
                .then()
                .log().all()
                .body("id", equalTo(73009));
    }

    @Test
    public void threeTest(){

        given()
                .baseUri("https://petstore.swagger.io/v2")
                .log().all()
                .when()
                .delete("/pet/73009")
                .then()
                .log().all()
                .statusCode(200);

    }

}
