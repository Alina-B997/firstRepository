import Pages.NewPet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;
import static jdk.internal.net.http.frame.Http2Frame.asString;
import static org.hamcrest.Matchers.equalTo;

public class JavaApi {

    @Test
    public void firstTest(){

        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        given()
                .log().all()
                .when()
                .get("/pet/101")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void validateResponseBodyFromGet(){

        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        given()
                .log().all()
                .when()
                .get("/pet/101")
                .then()
                .log().all()
                .body("id", equalTo(101));
    }

}
