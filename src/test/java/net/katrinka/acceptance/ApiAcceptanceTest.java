package net.katrinka.acceptance;

import io.restassured.RestAssured;
import net.katrinka.AcceptanceTest;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

@Category(AcceptanceTest.class)
public class ApiAcceptanceTest {
    @BeforeClass
    public static void restAssuredConfig() {
//        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.baseURI = "https://lims-mdonahue-sb.appspot.com";
    }
}
