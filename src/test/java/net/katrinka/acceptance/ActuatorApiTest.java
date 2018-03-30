package net.katrinka.acceptance;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class ActuatorApiTest extends ApiAcceptanceTest {

    @Test
    public void healthTestDoesNotRequireAuth() {
        String path = "/actuator/health";
        given()
                .log().uri()
        .when()
                .get(path)
        .then()
                .assertThat().statusCode(200)
                .body(equalTo("{\"status\":\"UP\"}"));
    }

    @Test
    public void infoEndpointRequiresAuth() {
        when().get("/actuator/info")
        .then().assertThat().statusCode(401);
    }

    @Test
    public void infoEndpointUsesBasicAuth() {
        given()
                .auth().preemptive().basic("admin", "ch0colateCak3")
        .when()
                .get("/actuator/info")
        .then()
                .assertThat().statusCode(200)
                .body(equalTo("{}"));
    }
}
