package net.katrinka.acceptance;

import org.junit.Ignore;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class CronJobApiTest extends ApiAcceptanceTest {
    private String path = "/cron/startIntegration";

    @Test
    public void cronJobInitiateApi() {
        given()
                .log().uri()
        .when()
                .get(path)
        .then()
                .assertThat().statusCode(200);
    }

    @Test
    @Ignore
    public void requiresAuth() {
        when()
                .get(path)
        .then()
                .assertThat().statusCode(401);

    }
}
