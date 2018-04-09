package net.katrinka.acceptance;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class ActuatorApiTest extends ApiAcceptanceTest {

    @Test
    public void healthEndpointRequiresAuth() {
        String path = "/actuator/health";
        given()
                .auth().preemptive().basic(username, password)
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
                .auth().preemptive().basic(username, password)
        .when()
                .get("/actuator/info")
        .then()
                .assertThat().statusCode(200)
                .body(equalTo("{}"));
    }

    @Test
    public void beansActuatorEndpointNotEnabaledByDefault() {
        when().get("/actuator/beans")
        .then().assertThat().statusCode(401);
    }
}
