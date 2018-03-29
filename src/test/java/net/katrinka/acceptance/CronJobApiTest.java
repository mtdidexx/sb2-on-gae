package net.katrinka.acceptance;

import io.restassured.RestAssured;
import net.katrinka.AcceptanceTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

@Category(AcceptanceTest.class)
public class CronJobApiTest {
    private String path = "/cron/startIntegration";

    @BeforeClass
    public static void restAssuredConfig() {
//        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.baseURI = "https://lims-mdonahue-sb.appspot.com";
    }

    @Test
    public void cronJobInitiateApi() {
        given()
                .log().uri()
                .auth().preemptive().basic("admin", "ch0colateCak3")
                .when()
                .get(path)
                .then()
                .assertThat().statusCode(200);
    }

    @Test
    public void requiresAuth() {
        when()
                .get(path)
                .then()
                .assertThat().statusCode(401);

    }
}
