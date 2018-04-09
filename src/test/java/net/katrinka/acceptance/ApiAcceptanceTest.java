package net.katrinka.acceptance;

import io.restassured.RestAssured;
import net.katrinka.AcceptanceTest;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

@Category(AcceptanceTest.class)
public class ApiAcceptanceTest {

    String username = "action";
    String password = "jackson";

//    String username = "admin";
//    String password = "ch0colateCak3";

    @BeforeClass
    public static void restAssuredConfig() {
        String hostName = "http://localhost:8080";
        RestAssured.baseURI = System.getProperty("testHost", hostName);
    }
}
