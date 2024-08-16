package classwork_webservice;

import io.restassured.RestAssured;
import org.junit.Test;

public class WebServiceTest {

    @Test
    public void testMethod() {

        String name = "a";

        RestAssured
                .given()
                .spec(BaseSteps.REQUEST_SPECIFICATION)
                .body(new Search(name, true))
                .when()
                .post()
                .then()
                .extract().body().as(Data.class).getData().get(0).equals(BaseSteps.getUser(name));
    }
}