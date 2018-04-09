package net.katrinka.acceptance;

import io.restassured.RestAssured;
import net.katrinka.AcceptanceTest;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

@Category(AcceptanceTest.class)
public class ApiAcceptanceTest {
    static String hostName = "http://localhost:8080";

    String username = "admin";
//    String password = "f00bar";
    String password = "ch0colateCak3";

    @BeforeClass
    public static void restAssuredConfig() {
        RestAssured.baseURI = System.getProperty("testHost", hostName);
    }
}
