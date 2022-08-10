import io.restassured.RestAssured;

/**
 * Project Name    : rest-assured-demo
 * Developer       : Sonal Wahla
 * Version         : 1.0.0
 * Date            : 10/08/2022
 **/

public class Token {

    public static String getToken() {
        return RestAssured
                .get("https://intelliapi-mockserver.herokuapp.com/auth")
                .jsonPath()
                .get("token");
    }
}
