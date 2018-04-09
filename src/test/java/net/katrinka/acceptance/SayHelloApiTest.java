package net.katrinka.acceptance;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class SayHelloApiTest extends ApiAcceptanceTest {
    private String path = "/sayhello";

    @Test
    public void sayHelloApi() {
        given()
                .log().uri()
                .auth().preemptive().basic(username, password)
        .when()
                .get(path)
        .then()
                .assertThat().statusCode(200)
                .body(equalTo("Hello, Sucka!"));
    }

    @Test
    public void requiresAuth() {
        when()
                .get(path)
        .then()
                .assertThat().statusCode(401);

    }

    @Test
    public void sayHelloToMyLittleFriend() {
        given()
                .auth().preemptive().basic(username, password)
        .when()
                .put("/sayhello/Tony")
        .then()
                .assertThat().statusCode(200)
                .body(equalTo("Hello there, Tony"));

    }
}
